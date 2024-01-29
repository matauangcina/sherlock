from rich.progress import (
    BarColumn, Progress, SpinnerColumn, TaskProgressColumn, TimeRemainingColumn
)
from time import sleep

def progress_bar(time=0.02, advance=1):
    with Progress(
        "{task.description}", 
        SpinnerColumn(spinner_name="weather"), 
        BarColumn(), 
        TaskProgressColumn(),
        TimeRemainingColumn()
    ) as progress:
        task = progress.add_task("[green]Processing", total=100)
        while not progress.finished:
            progress.update(task, advance=advance)
            sleep(time)

def terminal_progress(message, time=2, advance=50):
    desc = f"[bold cyan]\[*][/] {message}"
    with Progress(
        "{task.description}", 
        SpinnerColumn(spinner_name="point", finished_text=": done")
    ) as progress:
        task = progress.add_task(desc, total=100)
        while not progress.finished:
            progress.update(task, advance=advance)
            sleep(time)