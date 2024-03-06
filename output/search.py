from rich import box
from rich import print
from rich.table import Table


def display_modules(modules):
    table = Table(
        title="[bold underline2]Matching Modules: [/]", 
        caption="Interact with a module by module name or index.", 
        box=box.SIMPLE, 
        padding=(0,2),
        title_justify="left"
    )
    table.add_column("#", style="bright_white", justify="center")
    table.add_column("Name", style="bright_cyan")
    table.add_column("Status", style="bright_yellow", justify="center")
    table.add_column("Rule ID", style="bright_green")
    table.add_column("Description", style="bright_white")
    for i,module in enumerate(modules):
        table.add_row(
            str(i+1),
            module["name"],
            module["status"],
            "".join(["• " + rule + "\n" for rule in module["rule_id"]]),
            module["desc"]
        )
    print(table)
    print("")