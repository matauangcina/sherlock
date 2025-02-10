import json
import os

from database.commands import COMMANDS
from datetime import datetime
from globals import INVALID_CMD, DB_PATH
from output.banner import display_banner
from output.help import display_help_panel
from prompt_toolkit import PromptSession
from prompt_toolkit.auto_suggest import AutoSuggestFromHistory
from prompt_toolkit.completion import Completer, Completion, CompleteEvent, FuzzyCompleter
from prompt_toolkit.document import Document
from prompt_toolkit.history import FileHistory
from prompt_toolkit.styles import Style
from settings.logger import get_logger
from settings.utils import get_commands
from state.device import device_state
from state.module import module_state


log = get_logger(__name__)


class PromptCompleter(Completer):

    def __init__(self):
        super().__init__()
        self._commands = COMMANDS


    def get_command_hints(self, document: Document):
        cmds = [cmd for cmd in get_commands(document.text) if not cmd.startswith('--')]
        opts = [opt for opt in get_commands(document.text) if opt.startswith('--')]
        curr = self._commands
        hints = dict()
        for cmd in cmds:
            cmd = cmd.lower()
            if cmd in list(curr.keys()):
                if "opts" in curr[cmd]:
                    curr = {
                        opt: "" for opt in curr[cmd]["opts"] if opt not in opts
                    }
                elif "exec" in curr[cmd]:
                    return hints
                else:
                    curr = curr[cmd]
        if len(curr) > 0:
            for key in curr.keys():
                if document.get_word_before_cursor().lower() in key.lower() and not key.lower() == "desc":
                    hints[key] = curr[key]
        return hints


    def get_completions(self, document: Document, complete_event: CompleteEvent):
        word = document.get_word_before_cursor()
        hints = self.get_command_hints(document)
        if len(hints) == 0:
            return
        sort_cmds = dict(sorted(hints.items()))
        for key,val in sort_cmds.items():
            desc = None
            if type(val) is dict and "desc" in val:
                desc = val["desc"]
            yield Completion(key, -(len(word)), display_meta=desc)


class Prompt:

    def __init__(self):
        self._commands = COMMANDS
        self._session = self.prompt_session()


    def prompt_session(self):
        history = os.path.expanduser("~/.sherlock/sherlock_history")
        history_dir = os.path.dirname(history)
        if not os.path.exists(history_dir):
            os.makedirs(history_dir)
        if not os.path.exists(history):
            open(history, "a").close()
        return PromptSession(
            completer=FuzzyCompleter(PromptCompleter()),
            complete_in_thread=True,
            auto_suggest=AutoSuggestFromHistory(),
            style=self.prompt_style(),
            history=FileHistory(history),
        )


    def prompt_style(self):
        return Style.from_dict({
            "completion-menu.completion": "bg:#af8700 #ffffff",
            "completion-menu.completion.current": "bg:#d7af00 #000000",
            "scrollbar.background": "bg:#d7af87",
            "scrollbar.button": "bg:#222222",
            "timestamp": "#e95420",
            "device_id": "#c061cb",
            "name_prompt_open": "#5e5c64",
            "name": "#33c7de",
            "name_prompt_close": "#5e5c64",
            "start_prompt": "#ffffff",
        })


    def prompt_message(self):
        timestamp = datetime.now().strftime("%a, %Y-%m-%d %H:%M:%S")
        device_id = device_state.device_id
        name = module_state.get("name")
        time_prompt = f"({timestamp})"
        device_id_prompt = f"(Device: {device_id})" if device_id is not None else ""
        name_prompt_open = f":["
        name_prompt = f"{name}" if name is not None else "~"
        name_prompt_close = "]\n"
        start_prompt = "↳ "
        return [
            ("class:timestamp", time_prompt),
            ("class:device_id", device_id_prompt),
            ("class:name_prompt_open", name_prompt_open),
            ("class:name", name_prompt),
            ("class:name_prompt_close", name_prompt_close),
            ("class:start_prompt", start_prompt)
        ]


    def get_help(self, args):
        cmds = self._commands
        help_id = list()
        help_message = dict()
        for arg in args:
            if arg not in cmds:
                break
            help_id.append(arg)
            if "exec" not in cmds[arg]:
                cmds = cmds[arg]
        if len(help_id) > 0:
            id = "_".join(help_id)
            with open(os.path.join(DB_PATH, "help.json"), "r") as file:
                help = json.load(file)
            help_message = {
                "command": help[id]["command"],
                "description": help[id]["description"],
                "usage": help[id]["usage"],
                "demo": help[id]["demo"]
            }
        return help_message


    def get_exec(self, args):
        cmds = self._commands
        execute = None
        count = 0
        for arg in args:
            count += 1
            if arg not in cmds:
                break
            if "exec" in cmds[arg]:
                execute = cmds[arg]["exec"]
                break
            cmds = cmds[arg]
        return {
            "idx": count,
            "exec": execute
        }


    def execute(self, command):
        if command.strip() == "":
            return
        cmds = get_commands(command)
        if len(cmds) > 0 and cmds[0] == "help":
            cmds.pop(0)
            help_summary = self.get_help(cmds)
            if len(help_summary) == 0:
                log.error(f"{INVALID_CMD}\n")
                return
            display_help_panel(help_summary)
            return
        idx = self.get_exec(cmds)["idx"]
        exec_cmd = self.get_exec(cmds)["exec"]
        if exec_cmd is None:
            log.error(INVALID_CMD)
            return
        args = cmds[idx:]
        exec_cmd(args)


    def init(self):
        display_banner()
        while True:
            try:
                cmd = self._session.prompt(self.prompt_message())
                if cmd.strip() == "exit":
                    log.info("Thankyou for using Sherlock.\n")
                    break
                try:
                    self.execute(cmd)
                except Exception as e:
                    log.warning(f"Error executing command: {e}")
            except KeyboardInterrupt:
                pass
            except EOFError:
                log.info("Thankyou for using Sherlock.\n")
                break


prompt = Prompt()