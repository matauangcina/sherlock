from rich import print
from rich.console import group
from rich.panel import Panel

@group()
def get_panels():
    yield Panel("Hello", style="blue")
    yield Panel("World", style="red")

print(Panel(get_panels()))