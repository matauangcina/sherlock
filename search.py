import json

from globals import INVALID_COMMAND
from logger import get_logger
from progress import progress_bar
from rich import box
from rich.console import Console
from rich.live import Live
from rich.table import Table
from time import sleep

log = get_logger(__name__)

console = Console(width=150)

def get_module_list():
    with open("database/modules.json","r") as file:
        data = json.load(file)
    ids = list(data)
    modules = list()
    for id in ids:
        sum = dict()
        sum["id"] = id
        sum["name"] = data[id]["name"]
        sum["path"] = data[id]["path"]
        sum["type"] = data[id]["type"]
        sum["status"] = data[id]["status"]
        rules = data[id]["rule_id"]
        rule_id = ""
        for rule in rules:
            rule_id += "* " + rule + "\n"
        sum["rules"] = rule_id
        modules.append(sum)
    return modules

def filtered_modules_list(keyword):
    modules = get_module_list()
    filtered_modules = list()
    for module in modules:
        if keyword in module["path"]:
            filtered_modules.append(module)
    return filtered_modules

def display_modules(modules):
    print("")
    progress_bar(0.005)
    print("")
    if len(modules) == 0:
        log.error("Modules not found.\n")
        return
    table = Table(title="Matching Modules", caption="Interact with a module by name or index.", box=box.SIMPLE, padding=(0,3))
    table.add_column("#", style="bright_white", justify="center")
    table.add_column("Name", style="bright_cyan")
    table.add_column("Status", style="bright_yellow", justify="center")
    table.add_column("Rule ID", style="bright_green")
    table.add_column("Description", style="bright_white")
    with Live(table, console=console, refresh_per_second = 4):
        for i, module in enumerate(modules):
            sleep(0.1)
            table.add_row(
                str(i+1),
                module["path"],
                module["status"],
                module["rules"],
                module["name"]
            )
    print("\n")

def search(args):
    if len(args) == 1:
        if args[0] == "*":
            payloads = get_module_list()
            display_modules(payloads)
        else:
            filtered_payloads = filtered_modules_list(args[0])
            display_modules(filtered_payloads)
    else:
        log.error(INVALID_COMMAND)