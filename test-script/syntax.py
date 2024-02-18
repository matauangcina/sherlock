from rich.console import Console
from rich.syntax import Syntax

console = Console()
syntax = Syntax.from_path("/home/finechina/Project/sherlock/test/fullscreen.py", theme="vim", line_numbers=True, line_range=[5,10])
console.print(syntax)