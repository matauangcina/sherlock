from rich.progress import BarColumn
from rich.progress import Progress
from rich.progress import SpinnerColumn
from rich.progress import TaskProgressColumn
from rich.progress import TimeElapsedColumn
from time import sleep


def progress_bar(message, time=0.0025, advance=1):
    with Progress(
        "{task.description}", 
        SpinnerColumn(spinner_name="circleHalves"), 
        BarColumn(), 
        TaskProgressColumn(),
        TimeElapsedColumn()
    ) as progress:
        task = progress.add_task(f"[green]{message}", total=100)
        while not progress.finished:
            progress.update(task, advance=advance)
            sleep(time)


def load_terminal(message, time=1, advance=50):
    print("")
    desc = f"[bold gold1]\[*][/] {message}"
    with Progress(
        "{task.description}", 
        SpinnerColumn(spinner_name="point", finished_text="...")
    ) as progress:
        task = progress.add_task(desc, total=100)
        while not progress.finished:
            progress.update(task, advance=advance)
            sleep(time)