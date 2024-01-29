# from analyze import analyze
from cmd import Cmd
from use import use
from colorama import (
    Fore, 
    Style
)
from datetime import datetime
from decompile import decompile
from exit import exit
from get import get_info
from globals import VERSION
from help import help
from logger import init_logger
from progress import terminal_progress
from remove import remove
from rich import box
from rich import print
from rich.panel import Panel
from time import sleep

log = init_logger(__name__)

class Sherlock(Cmd):
    device_id = ""

    def preloop(self):
        self.update_prompt()

    def postcmd(self, stop, line):
        self.update_prompt()
        return stop

    def update_prompt(self):
        current_timestamp = datetime.now().strftime("%a, %Y-%m-%d %H:%M:%S")
        self.prompt = f"{Fore.LIGHTBLUE_EX}[{current_timestamp}]{Fore.LIGHTGREEN_EX}[{self.device_id}]{Fore.LIGHTBLACK_EX}: # {Style.RESET_ALL}"

    def do_version(self, line):
        # DONE!!!
        print("")
        print(Panel.fit(f"{VERSION}", box=box.DOUBLE_EDGE))
        print("")

    def do_use(self, line):
        # DONE!!!
        args = line.split()
        if use(args) != "":
            self.device_id = "Device: " + use(args)
        else:
            log.error("Device is not connected!")
    
    def do_get(self, line):
        # DONE!!!
        args = line.split()
        get_info(args)

    def do_analyze(self, line):
        # DISPLAY OUTPUT
        args = line.split()
        # analyze(args)
    
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
    print("\n")
    print("[bright_yellow]     ███████╗██╗  ██╗███████╗██████╗ ██╗      ██████╗  ██████╗██╗  ██╗       [/]")
    print("[bright_yellow]     ██╔════╝██║  ██║██╔════╝██╔══██╗██║     ██╔═══██╗██╔════╝██║ ██╔╝       [/]")
    print("[bright_yellow]     ███████╗███████║█████╗  ██████╔╝██║     ██║   ██║██║     █████╔╝        [/]")
    print("[bright_yellow]     ╚════██║██╔══██║██╔══╝  ██╔══██╗██║     ██║   ██║██║     ██╔═██╗        [/]")
    print("[bright_yellow]     ███████║██║  ██║███████╗██║  ██║███████╗╚██████╔╝╚██████╗██║  ██╗       [/]")
    print("[bright_yellow]     ╚══════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚══════╝ ╚═════╝  ╚═════╝╚═╝  ╚═╝       [/]")
    print("")
    print(f"[bold red]                                                        \[{VERSION}][/]\n")

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
    main()