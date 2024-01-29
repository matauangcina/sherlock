import shutil
import utils

from globals import (
    TARGET_PATH,
    INVALID_COMMAND
)
from logger import init_logger
from rich.console import Console
from time import sleep

log = init_logger(__name__)

console = Console(log_path=False)

def remove_workspace(target):
    is_exist = False
    with console.status("[bold orange3] Starting cleanup process", spinner="dots") as status:
        sleep(1)
        status.update("[bold blue] Locating workspace", spinner="earth")
        sleep(1)
        console.log("Getting workspace")
        sleep(2)
        if utils.is_path_exists(target):
            is_exist = True
            console.log("Workspace found")
            sleep(1)
            status.update("[bold red] Cleaning up workspace", spinner="bouncingBall", spinner_style="yellow")
            shutil.rmtree(target)
            sleep(1)
            console.log("Removing workspace")
            sleep(2)
        else:
            console.log(f"Workspace not found: {target}")
            sleep(0.5)
    if is_exist:
        console.print("[bold white on green] Workspace removed [/]\n")
    else:
        console.print("[bold white on red] Aborting [/]\n")

def remove_target(targets):
    is_exist_list = list()
    with console.status("[bold orange3] Starting process", spinner="dots") as status:
        sleep(1)
        for i, target in enumerate(targets):
            if i == 0:
                continue
            status.update(status="[bold blue] Locating workspace", spinner="earth")
            sleep(1)
            console.log("Getting target workspace")
            sleep(2)
            if utils.is_path_exists(target):
                is_exist_list.append(True)
                console.log(f"Workspace found: {target}")
                sleep(1)
                status.update(status="[bold red] Cleaning up workspace", spinner="bouncingBall", spinner_style="yellow")
                shutil.rmtree(target)
                sleep(1)
                console.log("Removing target workspace")
                sleep(2)
            else:
                is_exist_list.append(False)
                console.log(f"Workspace not found: {target}")
                sleep(0.5)
    if all(not is_exist for is_exist in is_exist_list):
        console.print("[bold white on red] No valid workspace identified. [/]\n")
    else:
        console.print("[bold white on green] Completed [/]\n")

def remove(args):
    print("")
    if len(args) > 1 and len(args) <= 2:
        if len(args) == 1:
            if args[0] == "workspace":
                remove_workspace(TARGET_PATH)
            else:
                log.error(INVALID_COMMAND)
        else:
            if args[0] == "target":
                targets = args[1].split(",")
                target_abs_path = list()
                for target in targets:
                    path = TARGET_PATH + "/" + target
                    if utils.is_path_exists(path):
                        target_abs_path.append(path)
                    else:
                        log.warning(f"Target not found. Ignoring: {target}")
                remove_target(target_abs_path)
            else:
                log.error(INVALID_COMMAND)
    else:
        log.error(INVALID_COMMAND)