from rich import box
from rich.console import Console
from rich.panel import Panel
from rich.table import Table


console = Console()


def display_help_panel(help_dict):
    print("")
    message = Table.grid(padding=1)
    message.add_column(style="bold white", justify="left", ratio=10)
    message.add_column(style="bold white", justify="center", ratio=1)
    message.add_column(style="bright_white", ratio=10)
    message.add_row(
        "Usage", ":", help_dict["usage"]
    )
    message.add_row(
        "Description", ":", help_dict["description"]
    )
    message.add_row(
        "Demo(s)", ":", help_dict["demo"]
    )
    message_panel = Panel(
        message,
        box=box.ROUNDED,
        title=f"[bold gold3]{help_dict['command']}[/]",
        title_align="left",
        border_style="gold3",
        width=75,
        padding=(1,2)
    )
    console.print(message_panel)
    print("")