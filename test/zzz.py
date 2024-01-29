from time import sleep

from rich.console import Console
from logger import init_logger

log = init_logger(__name__)

console = Console()
with console.status("[magenta] Covid detector booting up") as status:
    sleep(3)
    log.debug("Importing advanced AI")
    sleep(3)
    log.debug("Advanced Covid AI Ready")
    sleep(3)
    log.debug(status="[bold blue] Scanning for Covid", spinner="earth")
    sleep(3)
    log.info("Found 10,000,000,000 copies of Covid32.exe")
    sleep(3)
    status.update(
        status="[bold red]Moving Covid32.exe to Trash",
        spinner="bouncingBall",
        spinner_style="yellow",
    )
    sleep(5)
console.print("[bold green]Covid deleted successfully")