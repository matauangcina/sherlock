import os
import re
import subprocess
import settings.utils as utils

from globals import JADX_BIN
from settings.config import post_process
from settings.logger import get_logger
from settings.target_info import get_target_db, add_target_to_db


log = get_logger(__name__)


def should_output_dir(args):
    return len(args) > 0 and "--output" in args


def is_file_specified(args):
    return len(args) > 0 and "--file" in args


def run_decompiler(apks, output_dir):
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
        decompile_cmd = ["bash", JADX_BIN, "--deobf", apk, "-d", output_path, "--comments-level", "none", "--export-gradle"]
        log.debug(f"Decompiling: '{os.path.basename(apk)}'")
        try:
            jadx = subprocess.check_output(decompile_cmd, stderr=subprocess.STDOUT, text=True).splitlines()
        except Exception as e:
            log.error(f"Decompilation failed: {e}, skipping: \'{id}\'")
            continue
        for line in jadx:
            if re.match(r"^.*Killed.*$", line):
                log.error(f"Process killed, skipped: '{id}'")
                continue
        log.info(f"Target decompiled to: '{output_path}'")
        output.append(output_path)
    if len(output) == 0:
        log.error("No target apk can be processed further.\n")
        return
    log.debug("Post decompiling..")
    for o in output:
        add_target_to_db(targets, o)
        post_process(targets, os.path.basename(o))
    log.info("Decompilation completed.\n")


def decompile(args):
    print("")
    apks = list()
    output_dir = None
    if should_output_dir(args):
        output_dir = args[args.index("--output") + 1]
        if not utils.is_path_exists(output_dir):
            log.error("Output directory not found. Terminating..\n")
            return
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
    log.debug("Running decompiler...")
    run_decompiler(apks, output_dir)