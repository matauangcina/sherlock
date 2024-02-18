from rich.console import Console
from rich.panel import Panel
from rich.text import Text

console = Console()

# text = Text("Hello, World!")
# text.stylize("bold magenta", 0, 6)
# console.print(text)

# text = Text()
# text.append("Hello", style="bold magenta")
# text.append(" World!")
# console.print(text)

panel = Panel(Text("Hello"))
console.print(panel)