import os
import utils

from get import get_app_details_from_manifest
from globals import (
    INVALID_COMMAND, 
    TARGET_PATH,
    AVAILABLE_RULES
)
from logger import get_logger
from output import scan_output
from rich.console import Console
from scan import run_engine
from time import sleep

console = Console(log_path=False)

log = get_logger(__name__)

def formatted_target_list(args):
    target_list = list()
    for arg in args:
        target_path = list()
        target = TARGET_PATH + "/" + arg
        if utils.is_path_exists(target):
            package = get_app_details_from_manifest(target + "/resources/AndroidManifest.xml")["package"].replace(".", "/")
            codebase = target + "/sources/" + package
            if utils.is_path_exists(codebase):
                target_path.append(codebase)
                target_list.append(target_path)
            else:
                continue
        else:
            continue
    return target_list

def formatted_codebase_list(paths):
    codebase_list = list()
    for path in paths:
        target = list()
        if utils.is_path_exists(path):
            target.append(path)
            codebase_list.append(target)
        else:
            codebase_list = list()
            break
    return codebase_list

def get_rules_list(args, valid_rules):
    rules = list()
    for arg in args:
        if arg in valid_rules:
            rules.append(arg)
        else:
            rules = list()
            break
    return rules

def get_summary(targets, rules, id):
    summary = {
        "targets": dict()
    }
    target_summary = summary["targets"]
    for i, target in enumerate(targets):
        path = target[0]
        target_id = id[i]
        if target_id not in target_summary:
            target_summary[target_id] = {
                "path": path
            }
        for rule in rules:
            result = run_engine(target, rule)
            if rule not in target_summary[target_id]:
                target_summary[target_id][rule] = result
    return summary

def analyze(args):
    """
        analyze target [target_id,target_id,..] [manifest,code]
    """
    print("")
    is_valid = False
    summary = dict()
    with console.status("[bold orange3] Initiating analysis process", spinner="dots") as status:
        sleep(1)
        console.log("Checking argument length...")
        sleep(1)
        if len(args) > 0 and len(args) <= 3:
            console.log("Argument length valid.")
            sleep(1)
            if len(args) == 1 and args[0] == "target":
                status.update(status="[bold blue] Getting all targets in workspace", spinner="earth")
                sleep(1)
                console.log("Locating workspace...")
                sleep(1)
                target_id = os.listdir(TARGET_PATH)
                codebase = utils.get_codebase_path()
                targets = formatted_codebase_list(codebase)
                if len(targets) != 0:
                    console.log("All targets found.")
                    sleep(1)
                    status.update(status="[bold red] Running engine", spinner="bouncingBall", spinner_style="yellow")
                    sleep(1)
                    console.log("Initiating full scan...")
                    is_valid = True
                    summary = get_summary(targets, AVAILABLE_RULES, target_id)
            else:
                if args[0] == "target":
                    if len(args) == 2:
                        status.update(status="[bold magenta] Getting specified targets in workspace", spinner="clock")
                        sleep(1)
                        console.log("Locating specified targets...")
                        sleep(1)
                        second_args = args[1].split(",")
                        targets = formatted_target_list(second_args)
                        if len(targets) == 0:
                            console.log("Target not specified, continuing process.")
                            sleep(1)
                            status.update(status="[bold blue] Getting specified rules", spinner="earth")
                            sleep(1)
                            console.log("Fetching specified rules...")
                            sleep(1)
                            rules = get_rules_list(second_args, AVAILABLE_RULES)
                            if len(rules) != 0:
                                console.log("Rules fetched")
                                sleep(1)
                                status.update(status="[bold cyan] Getting all targets in workspace", spinner="moon")
                                sleep(1)
                                console.log("Locating workspace...")
                                sleep(1)
                                target_id = os.listdir(TARGET_PATH)
                                codebase = utils.get_codebase_path()
                                all_targets = formatted_codebase_list(codebase)
                                if len(all_targets) != 0:
                                    console.log("All targets found.")
                                    sleep(1)
                                    status.update(status="[bold red] Running engine", spinner="bouncingBall", spinner_style="yellow")
                                    sleep(1)
                                    console.log("Initiating full scan with specified rules...")
                                    is_valid = True
                                    summary = get_summary(all_targets, rules, target_id)
                        else:
                            console.log("Specified targets found.")
                            sleep(1)
                            status.update(status="[bold red] Running engine", spinner="bouncingBall", spinner_style="yellow")
                            sleep(1)
                            console.log("Initiating targeted scan with available rules...")
                            is_valid = True
                            summary = get_summary(targets, AVAILABLE_RULES, second_args)
                    else:
                        status.update(status="[bold magenta] Getting specified targets in workspace", spinner="clock")
                        sleep(1)
                        console.log("Locating specified targets...")
                        sleep(1)
                        second_args = args[1].split(",")
                        targets = formatted_target_list(second_args)
                        if len(targets) != 0:
                            console.log("Specified targets found.")
                            sleep(1)
                            status.update(status="[bold blue] Getting specified rules", spinner="earth")
                            sleep(1)
                            console.log("Fetching specified rules...")
                            sleep(1)
                            third_args = args[2].split(",")
                            rules = get_rules_list(third_args, AVAILABLE_RULES)
                            if len(rules) != 0:
                                console.log("Rules fetched")
                                sleep(1)
                                status.update(status="[bold red] Running engine", spinner="bouncingBall", spinner_style="yellow")
                                sleep(1)
                                console.log("Initiating targeted scan with specified rules...")
                                is_valid = True
                                summary = get_summary(targets, rules, second_args)
    if is_valid:
        console.print("[bold white on green]Target successfully scanned.[/]")
        sleep(1)
        scan_output(summary)
    else:
        console.print("[bold white on red]Scanning failed. Aborting...[/]\n")
        sleep(1)
        log.error(INVALID_COMMAND)