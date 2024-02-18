from rich import print
from rich.console import Group
from rich.panel import Panel

panel_group = Group(
    Panel("Hello", style="blue"),
    Panel("World", style="red"),
)
print(Panel(panel_group))