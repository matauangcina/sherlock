import collections
import json
import os

from database.commands import COMMANDS
from datetime import datetime
from globals import banner, INVALID_CMD
from output.help import display_help_panel
from output.progress import load_terminal
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


class CommandCompleter(Completer):

    def __init__(self):
        super(CommandCompleter, self).__init__()
        self.commands = COMMANDS

    def get_suggestions(self, document: Document):
        cmds = [cmd for cmd in get_commands(document.text) if not cmd.startswith('--')]
        flags = [flag for flag in get_commands(document.text) if flag.startswith('--')]
        current = self.commands
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
                    return {}
        suggestions = {}
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
        sorted_commands = collections.OrderedDict(sorted(commands.items()))
        for cmd,extra in sorted_commands.items():
            if type(extra) is dict and "desc" in extra:
                desc = extra["desc"]
            else:
                desc = None
            yield Completion(cmd, -(len(word)), display_meta=desc)


class SherlockPrompt(object):

    def __init__(self):
        self.cli = None
        self.completer = FuzzyCompleter(CommandCompleter())
        self.commands = COMMANDS
        self.session = self.get_prompt_session()

    def get_prompt_session(self):
        return PromptSession(
            history=FileHistory(os.path.expanduser("~/.sherlock/sherlock_history")),
            completer=self.completer,
            style=self.get_prompt_style(),
            auto_suggest=AutoSuggestFromHistory(),
            reserve_space_for_menu=4,
            complete_in_thread=True
        )

    @staticmethod
    def get_prompt_style():
        return Style.from_dict({
            "completion-menu.completion": "bg:#af8700 #ffffff",
            "completion-menu.completion.current": "bg:#d7af00 #000000",
            "scrollbar.background": "bg:#d7af87",
            "scrollbar.button": "bg:#222222",
            "completion-menu.completion fuzzymatch.outside": "fg:#000000",
            "timestamp": "#007cff",
            "device_id": "#00ff00",
            "app_abbr": "bold underline",
            "category": "#ffffff",
            "module_name": "#ff0000",
            "start_prompt": "#ffffff"
        })

    @staticmethod
    def get_prompt_message():
        timestamp = datetime.now().strftime("%a, %Y-%m-%d %H:%M:%S")
        device_id = device_state.get_device_id()
        category = module_state.get_category()
        module_name = module_state.get_module_name()
        app_abbr = "shk"
        time_prompt = f"({timestamp})"
        device_id_prompt = f"(Connected: {device_id})\n" if device_id is not None else "\n"
        category_prompt = f" {category}(" if category is not None else ""
        module_name_prompt = f"{module_name}" if module_name is not None else ""
        start_prompt = ") > " if module_name is not None else " > "
        return [
            ("class:timestamp", time_prompt),
            ("class:device_id", device_id_prompt),
            ("class:app_abbr", app_abbr),
            ("class:category", category_prompt),
            ("class:module_name", module_name_prompt),
            ("class:start_prompt", start_prompt)
        ]
    
    def get_help(self, args):
        cmds = self.commands
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
            id = "-".join(help_id)
            with open("database/help.json", "r") as file:
                help = json.load(file)
            help_message = {
                "command": help[id]["command"],
                "description": help[id]["description"],
                "usage": help[id]["usage"],
                "demo": help[id]["demo"]
            }
        return help_message
    
    def get_execute_method(self, args):
        cmds = self.commands
        exec_method = None
        step = 0
        for arg in args:
            step += 1
            if arg in cmds:
                if "cmds" not in cmds[arg]:
                    if "execute" in cmds[arg]:
                        exec_method = cmds[arg]["execute"]
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
                print("")
                log.error(f"{INVALID_CMD}\n")
                return
            display_help_panel(help_summary)
            return
        step = self.get_execute_method(cmds)["step"]
        exec_method = self.get_execute_method(cmds)["exec"]
        if exec_method is None:
            print("")
            log.error(f"{INVALID_CMD}\n")
            return
        args = cmds[step:]
        exec_method(args)

    def run(self):
        load_terminal("Starting console", 1)
        print(banner)
        while True:
            try:
                cmd = self.session.prompt(self.get_prompt_message())
                if (cmd.strip() in ["exit"]):
                    print("")
                    log.info("Thankyou for using Sherlock.\n")
                    break
                try:
                    self.run_command(cmd)
                except Exception as e:
                    log.warning(f"{e}")
            except KeyboardInterrupt:
                pass
            except EOFError:
                print("")
                log.info("Thankyou for using Sherlock.\n")
                break


prompt = SherlockPrompt()