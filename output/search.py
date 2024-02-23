from rich import box
from rich.console import Console
from rich.table import Table


console = Console(width=150)


def display_modules(modules):
    table = Table(title="Matching Modules", caption="Interact with a module by name or index.", box=box.SIMPLE, padding=(0,2))
    table.add_column("#", style="bright_white", justify="center")
    table.add_column("Name", style="bright_cyan")
    table.add_column("Status", style="bright_yellow", justify="center")
    table.add_column("Rule ID", style="bright_green")
    table.add_column("Description", style="bright_white")
    for module in modules:
        table.add_row(
            module["idx"],
            module["name"],
            module["status"],
            "".join(["• " + rule + "\n" for rule in module["rule_id"]]),
            module["desc"]
        )
    console.print(table)
    print("")