from analyze import analyze
from cmd import Cmd
from use import use
from colorama import Fore, Style
from config import init_config
from datetime import datetime
from decompile import decompile
from exit import exit
from get import get_info
from globals import VERSION
from help import help
from logger import get_logger
from progress import terminal_progress
from remove import remove
from rich import box
from rich import print
from rich.panel import Panel
from search import search
from show import show
from time import sleep

log = get_logger(__name__)

class Sherlock(Cmd):
    device_id = ""
    exploit_id = ""
    category = ""

    def preloop(self):
        self.update_prompt()

    def postcmd(self, stop, line):
        self.update_prompt()
        return stop

    def update_prompt(self):
        device_id = ""
        exploit = ""
        current_timestamp = datetime.now().strftime("%a, %Y-%m-%d %H:%M:%S")
        timestamp = f"{Fore.LIGHTBLUE_EX}[{current_timestamp}]{Fore.RESET}"
        prompt = f"{Fore.LIGHTYELLOW_EX}>{Style.RESET_ALL} "
        if self.device_id != "":
            device_id = f"{Fore.LIGHTGREEN_EX}[{self.device_id}]{Fore.RESET}"
        if self.exploit_id != "":
            exploit = f"{self.category}({Style.BRIGHT}{Fore.LIGHTRED_EX}{self.exploit_id}{Style.RESET_ALL}) "
        self.prompt = f"{timestamp}{device_id}\n{exploit}{prompt}"

    def do_version(self, line):
        # DONE!!!
        print("")
        print(Panel.fit(f"{VERSION}", box=box.DOUBLE_EDGE))
        print("")

    def do_use(self, line):
        # DONE!!!
        args = line.split()
        if use(args) != "":
            use_dict = use(args)
            if use_dict["type"] == "device":
                self.device_id = "Device: " + use_dict["device_id"]
            else:
                self.category = use_dict["category"]
                self.exploit_id = use_dict["exploit_id"]
    
    def do_search(self, line):
        # DONE
        args = line.split()
        search(args)

    def do_show(self, line):
        args = line.split()
        show(self.exploit_id, args)

    def do_set(self, line):
        # set <something> value
        args = line.split()
        pass

    def do_add(self, line):
        # add
        args = line.split()
        pass
    
    def do_build(self, line):
        # add
        args = line.split()
        pass

    def do_get(self, line):
        # DONE!!!
        args = line.split()
        get_info(args)

    def do_analyze(self, line):
        # DONE
        args = line.split()
        analyze(args)
    
    def do_decompile(self, line):
        # DONE!!!
        args = line.split()
        decompile(args)
    
    def do_remove(self, line):
        # DONE!!!
        args = line.split()
        remove(args)

    def do_help(self, line):
        # DONE!!!
        help()

    def do_exit(self, line):
        # DONE!!!
        args = line.split()
        return exit(args)

def banner():
    print("\n\n\n")
    print("[bright_yellow]     ███████╗██╗  ██╗███████╗██████╗ ██╗      ██████╗  ██████╗██╗  ██╗       [/]")
    print("[bright_yellow]     ██╔════╝██║  ██║██╔════╝██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝       [/]")
    print("[bright_yellow]     ███████╗███████║█████╗  ██████╔╝██║     ██║   ██║██║     █████╔╝        [/]")
    print("[bright_yellow]     ╚════██║██╔══██║██╔══╝  ██╔══██╗██║     ██║   ██║██║     ██╔═██╗        [/]")
    print("[bright_yellow]     ███████║██║  ██║███████╗██║  ██║███████╗╚██████╔╝╚██████╗██║  ██╗       [/]")
    print("[bright_yellow]     ╚══════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝       [/]")
    print("")
    print(f"[bold red]                                                        \[{VERSION}][/]\n\n\n")

def print_header():
    print("")
    terminal_progress("Starting Terminal", 1)
    banner()
    sleep(1)
    print(Panel("Use [bold]'help'[/bold] for assistance", width=50))

def main():
    print_header()
    run_cmd = Sherlock()
    run_cmd.cmdloop()

if __name__ == '__main__':
    init_config()
    main()