import shutil
import utils

from globals import (
    TARGET_PATH,
    INVALID_COMMAND
)
from logger import init_logger
from remove import remove_workspace
from rich.console import Console
from time import sleep

log = init_logger(__name__)

console = Console(log_path=False)

def exit(args):
    print("")
    if len(args) > 1:
        log.error(INVALID_COMMAND)
        return False
    elif len(args) != 0:
        if args[0] == "clean":
            remove_workspace(TARGET_PATH)
            sleep(0.3)
            log.info("Thankyou for using Sherlock!\n")
            return True
        else:
            log.error(INVALID_COMMAND)
            return False
    else:
        log.info("Thankyou for using Sherlock!\n")
        return True