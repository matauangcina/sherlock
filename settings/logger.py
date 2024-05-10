import logging

from rich.logging import RichHandler


class LogHandler(RichHandler):
    def get_level_text(self, record):
        level_icon = {
            logging.DEBUG: "\[*]",
            logging.INFO: "\[i]",
            logging.WARNING: "\[!]",
            logging.ERROR: "\[-]",
            logging.CRITICAL: "\[x]"
        }
        level_color = {
            logging.DEBUG: "[bold bright_cyan]",
            logging.INFO: "[bold bright_green]",
            logging.WARNING: "[bold gold1]",
            logging.ERROR: "[bold bright_red]",
            logging.CRITICAL: "[bold white on red]"
        }
        icon = level_icon.get(record.levelno)
        color = level_color.get(record.levelno)
        return f"{color}{icon}"


def get_logger(module):
    logger = logging.getLogger(module)
    logger.setLevel(logging.DEBUG)
    handler = LogHandler(show_time=False, show_level=True, show_path=False)
    logger.addHandler(handler)
    return logger                