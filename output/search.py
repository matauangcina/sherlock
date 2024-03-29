from rich import box
from rich.console import Console
from rich.table import Table


console = Console(width=150)


def display_modules(modules):
    table = Table(
        title="[bold underline2]Matching Modules: [/]", 
        caption="Interact with a module by module name or index.", 
        box=box.SIMPLE, 
        padding=(0,2),
        title_justify="left"
    )
    table.add_column("#", style="bright_white", justify="center")
    table.add_column("Name", style="bright_cyan", overflow="fold")
    table.add_column("Status", style="bright_yellow", justify="center")
    table.add_column("Description", style="bright_white")
    for i,module in enumerate(modules):
        table.add_row(
            str(i+1),
            module["name"],
            module["status"],
            module["desc"]
        )
    console.print(table)
    print("")