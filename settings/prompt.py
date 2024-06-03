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

    def get_suggestions(self, document: Document):
        cmds = [cmd for cmd in get_commands(document.text) if not cmd.startswith('--')]
        flags = [flag for flag in get_commands(document.text) if flag.startswith('--')]
        current = self._commands
        for cmd in cmds:
            candidate = cmd.lower()
            if candidate in list(current.keys()):
                if "cmds" in current[candidate]:
                    current = current[candidate]["cmds"]
                elif "flags" in current[candidate]:
                    current = {
                        flag: "" for flag in current[candidate]["flags"] if flag not in flags
                    }
                else:
                    return dict()
        suggestions = dict()
        if current and len(current) > 0:
            for key,_ in current.items():
                if document.get_word_before_cursor().lower() in key.lower():
                    suggestions[key] = current[key]
        return suggestions

    def get_completions(self, document: Document, complete_event: CompleteEvent):
        word = document.get_word_before_cursor()
        commands = self.get_suggestions(document)
        if len(commands) == 0:
            return
        sort_cmds = dict(sorted(commands.items()))
        for cmd,extra in sort_cmds.items():
            if type(extra) is dict and "desc" in extra:
                desc = extra["desc"]
            else:
                desc = None
            yield Completion(cmd, -(len(word)), display_meta=desc)


class Prompt:

    def __init__(self):
        self._cli = None
        self._completer = FuzzyCompleter(PromptCompleter())
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
            history=FileHistory(history),
            completer=self._completer,
            style=self.prompt_style(),
            auto_suggest=AutoSuggestFromHistory(),
            reserve_space_for_menu=4,
            complete_in_thread=True
        )

    @staticmethod
    def prompt_style():
        return Style.from_dict({
            "completion-menu.completion": "bg:#af8700 #ffffff",
            "completion-menu.completion.current": "bg:#d7af00 #000000",
            "scrollbar.background": "bg:#d7af87",
            "scrollbar.button": "bg:#222222",
            "completion-menu.completion fuzzymatch.outside": "fg:#000000",
            "timestamp": "#e95420",
            "device_id": "#c061cb",
            "name_prompt_open": "#5e5c64",
            "name": "#33c7de",
            "name_prompt_close": "#5e5c64",
            "start_prompt": "#ffffff",
        })

    @staticmethod
    def prompt_message():
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
        help_id = []
        help_message = dict()
        for arg in args:
            if arg in cmds:
                help_id.append(arg)
                if "cmds" in cmds[arg]:
                    cmds = cmds[arg]["cmds"]
            else:
                break
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
    
    def get_execute_method(self, args):
        cmds = self._commands
        exec_method = None
        step = 0
        for arg in args:
            step += 1
            if arg in cmds:
                if "cmds" not in cmds[arg]:
                    if "exec" in cmds[arg]:
                        exec_method = cmds[arg]["exec"]
                        break
                else:
                    cmds = cmds[arg]["cmds"]
            else:
                break
        return {
            "step": step,
            "exec": exec_method
        }

    def run_command(self, command):
        if command.strip() == "":
            return
        cmds = get_commands(command)
        if len(cmds) > 0 and cmds[0] == "help":
            cmds.remove("help")
            help_summary = self.get_help(cmds)
            if len(help_summary) == 0:
                log.error(f"{INVALID_CMD}\n")
                return
            display_help_panel(help_summary)
            return
        step = self.get_execute_method(cmds)["step"]
        exec_method = self.get_execute_method(cmds)["exec"]
        if exec_method is None:
            log.error(INVALID_CMD)
            return
        args = cmds[step:]
        exec_method(args)

    def init(self):
        display_banner()
        while True:
            try:
                cmd = self._session.prompt(self.prompt_message())
                if (cmd.strip() in ["exit"]):
                    log.info("Thankyou for using Sherlock.\n")
                    break
                try:
                    self.run_command(cmd)
                except Exception as e:
                    log.warning(f"Error executing command: {e}")
            except KeyboardInterrupt:
                pass
            except EOFError:
                log.info("Thankyou for using Sherlock.\n")
                break


prompt = Prompt()