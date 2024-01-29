from datetime import datetime
from rich import box
from rich.align import Align
from rich.console import Group
from rich.layout import Layout
from rich.live import Live
from rich.panel import Panel
from rich.progress import (
    BarColumn, 
    Progress, 
    SpinnerColumn, 
    TaskProgressColumn, 
    TimeRemainingColumn
)
from rich.table import Table
from time import sleep

def make_layout() -> Layout:
    layout = Layout(name="root")
    layout.split(
        Layout(name="header", size=3),
        Layout(name="help", size=42),
        Layout(name="footer")
    )
    layout["help"].split_row(
        Layout(name="row_1", ratio=1),
        Layout(name="row_2", ratio=1),
        Layout(name="row_3", ratio=1),
        Layout(name="row_4", ratio=1)
    )
    layout["row_1"].split(
        Layout(name="version"),
        Layout(name="analyze")
    )
    layout["row_2"].split(
        Layout(name="use"),
        Layout(name="decompile")
    )
    layout["row_3"].split(
        Layout(name="get"),
        Layout(name="exit")
    )
    layout["row_4"].split(
        Layout(name="remove"),
        Layout(name="TBA")
    )
    return layout

class Header:
    def __rich__(self) -> Panel:
        grid = Table.grid(expand=True)
        grid.add_column(justify="center", ratio=1)
        grid.add_column(justify="right")
        grid.add_row(
            "[bold]Help Page[/]",
            datetime.now().ctime().replace(":", "[blink]:[/]")
        )
        return Panel(grid, box=box.DOUBLE_EDGE, style="bright_white")
    
def help_message(title, desc, cmd) -> Panel:
    message = Table.grid(padding=1)
    message.add_column(style="bright_white", justify="right")
    message.add_column(style="white")
    message.add_row(
        "Description:", desc
    )
    message.add_row(
        "Usage:", cmd
    )
    message_panel = Panel(
        Align.center(
            Group(Align.center(message)),
            vertical="middle",
        ),
        box=box.ROUNDED,
        title=f"[bold white]{title}",
        border_style="white"
    )
    return message_panel

def help():
    job_progress = Progress(
        "{task.description}",
        SpinnerColumn(spinner_name="runner"),
        BarColumn(),
        TaskProgressColumn(),
        TimeRemainingColumn()
    )
    job_progress.add_task("[bold yellow]Your time remaining", total=100)
    job_progress.add_task("[bold red]Bonus hehe", total=100)
    progress_table = Table.grid(expand=True)
    progress_table.add_row(
        Panel(
            job_progress, 
            title="[bold]You don't have much time[/]", 
            border_style="red",
            box=box.DOUBLE_EDGE,
            padding=(1, 2)
        )
    )
    layout = make_layout()
    layout["header"].update(Header())
    layout["version"].update(help_message("Version", "Get version", "version"))
    layout["use"].update(help_message("Use", "Use connected device", "use <device_id>"))
    layout["get"].update(help_message("Get", "Get device/target info from workspace", "* get device info\n* get target \[target_id,..] info"))
    layout["remove"].update(help_message("Remove", "Remove target from workspace", "* remove workspace\n* remove target target_id,.."))
    layout["analyze"].update(help_message("Analyze", "Analyze target codebase", "analyze target \[target_id,..] \[manifest|code]"))
    layout["decompile"].update(help_message("Decompile", "Decompile target to workspace", "decompile <apk> <apk>.."))
    layout["exit"].update(help_message("Exit", "Exit terminal", "exit \[clean]"))
    layout["TBA"].update(help_message("TBA", "TBA", "TBA"))
    layout["footer"].update(progress_table)

    with Live(layout, refresh_per_second=10, screen=True):
        for job in job_progress.tasks:
            while not job.finished:
                job_progress.advance(job.id)
                sleep(0.05)