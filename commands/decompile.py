import os
import random
import re
import string
import subprocess

from globals import TARGET_PATH
from globals import JADX_BIN
from settings.config import post_decompile
from settings.logger import get_logger
from settings.utils import is_path_exists, is_file


log = get_logger(__name__)


def is_quiet(args):
    return len(args) > 0 and "--quiet" in args


def run_decompiler(apks, quiet):
    for apk in apks:
        dir_name = apk.split("/")[-1].split(".")[0]
        workspace = os.path.join(TARGET_PATH, dir_name)
        if is_path_exists(workspace):
            workspace += "-" + "".join(random.choice(string.ascii_lowercase) for _ in range(3))
        os.makedirs(workspace)
        log.debug("Running decompiler..")
        decompile = ["bash", JADX_BIN, "--deobf", apk, "-d", workspace]
        if quiet:
            decompile.append("--quiet")
        subprocess.run(decompile)
        log.info(f"Target decompiled: {dir_name}")


def apk(args):
    print("")
    apks = list()
    quiet = False
    for arg in args:
        if is_path_exists(arg) and re.match(r".+\.apk$", arg) and is_file(arg):
            apks.append(os.path.expanduser(arg))
            continue
        elif is_quiet(args):
            quiet = True
            continue
        log.warning(f"Target apk not found, skipping: {arg}")
    if len(apks) == 0:
        log.error("No target apk can be found. Terminating..\n")
        return
    run_decompiler(apks, quiet)
    post_decompile()
    log.info("Decompilation process completed.\n")