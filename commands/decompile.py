import os
import re
import settings.utils as utils

from database.decompilers import DECOMPILERS
from settings.config import post_process
from settings.logger import get_logger
from settings.target_info import get_target_db, add_target_to_db
from rich.console import Console


log = get_logger(__name__)

console = Console()


def should_output_dir(args):
    return len(args) > 0 and "--output" in args


def is_decompiler_specified(args):
    return len(args) > 0 and "--decompiler" in args


def is_file_specified(args):
    return len(args) > 0 and "--file" in args


def run_decompiler(apks, decompiler, output_dir):
    targets = get_target_db()
    if targets is None:
        log.error("Target DB not found.\n")
        return
    ids = targets.keys()
    output = list()
    for apk in apks:
        id = os.path.basename(apk).split(".apk")[0]
        if id in ids:
            log.warning(f"Duplicated target, skipping: '{id}'")
            continue
        output_path = os.path.join(output_dir if output_dir is not None else os.path.dirname(apk), id)
        with console.status("[bold blue] Decompiling targets", spinner="earth"):
            log.debug(f"Decompiling: '{os.path.basename(apk)}'")
            exec_method = decompiler["exec"]
            exec_method(apk, output_path)
            output.append(output_path)
        log.info(f"Target decompiled to: '{output_path}'")
    if len(output) == 0:
        log.error("No target apk can be processed further.\n")
        return
    with console.status("[bold red] Post processing", spinner="bouncingBall", spinner_style="bright_yellow"):
        log.debug("Post decompiling..")
        for o in output:
            add_target_to_db(targets, o)
            # post_process(targets, os.path.basename(o))
    console.print("[bold green]Decompilation completed.\n")


def decompile(args):
    print("")
    apks = list()
    output_dir = None
    if should_output_dir(args):
        output_dir = args[args.index("--output") + 1]
        if not utils.is_path_exists(output_dir):
            os.makedirs(output_dir)
            log.info(f"Make directory: '{output_dir}'")
            return
    decompiler = DECOMPILERS["jadx"]
    if is_decompiler_specified(args):
        decompiler = args[args.index("--decompiler") + 1]
        if decompiler not in DECOMPILERS.keys():
            decompiler = DECOMPILERS["jadx"]
            log.error("Decompiler not supported, continuing with default decompiler.")
        else:
            decompiler = DECOMPILERS[decompiler]
    if is_file_specified(args):
        file_path = args[args.index("--file") + 1]
        if not utils.is_path_exists(file_path):
            log.error("File not found! Terminating..\n")
            return
        with open(file_path, "r") as f:
            content = f.readlines()
        for line in content:
            line = line.split("\n")[0]
            if re.match(r"^.+\.apk$", line):
                apks.append(line)
                continue
            log.warning(f"APK file not found, skipping: {line}")
    else:
        for arg in args:
            if re.match(r"^.+\.apk$", arg):
                if utils.is_path_exists(arg) and utils.is_file(arg):
                    apks.append(arg)
                    continue
                log.warning(f"APK file not found, skipping: {arg}")
    if len(apks) == 0:
        log.error("No apk can be found.\n")
        return
    run_decompiler(apks, decompiler, output_dir)