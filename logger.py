import logging
from rich.logging import RichHandler

class SherlockLogHandler(RichHandler):
    def get_level_text(self, record):
        level_icon = {
            logging.DEBUG: "\[*]",
            logging.INFO: "\[i]",
            logging.WARNING: "\[!]",
            logging.ERROR: "\[-]",
            logging.CRITICAL: "\[x]"
        }
        level_color = {
            logging.DEBUG: "[bold cyan]",
            logging.INFO: "[bold green]",
            logging.WARNING: "[bold yellow]",
            logging.ERROR: "[bold red]",
            logging.CRITICAL: "[bold white on red]"
        }
        icon = level_icon.get(record.levelno)
        color = level_color.get(record.levelno)
        return f"{color}{icon}[/]"
    
def init_logger(module):
    logger = logging.getLogger(module)
    logger.setLevel(logging.DEBUG)
    custom_rich_handler = SherlockLogHandler(show_time=False, show_level=True, show_path=False)
    logger.addHandler(custom_rich_handler)
    return logger