from rich.table import Column, Table
from rich.console import Console
table = Table(
    "Released",
    "Title",
    Column(header="Box Office", justify="right"),
    title="Star Wars Movies"
)

console = Console()
console.print(table)