from globals import banner
from output.progress import load_terminal
from rich.console import Console
from rich.panel import Panel


console = Console()


def display_banner():
    load_terminal("Starting console", 1)
    console.print(banner)
    console.print(Panel.fit("Type 'help' for assistance.", padding=(0,2)))