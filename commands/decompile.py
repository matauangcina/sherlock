import os
import re
import subprocess
import settings.utils as utils

from globals import JADX_BIN
from settings.config import post_decompile
from settings.logger import get_logger
from settings.target_info import get_target_db, update_target_db, get_app_details, get_app_name


log = get_logger(__name__)


def should_output_dir(args):
    return len(args) > 0 and "--output" in args


def is_quiet(args):
    return len(args) > 0 and "--quiet" in args


def run_decompiler(apks, is_quiet, output_dir):
    targets = get_target_db()
    if targets is None:
        log.error("Target DB not found.\n")
        return
    ids = targets.keys()
    output = list()
    for apk in apks:
        id = os.path.basename(apk).split(".")[0]
        if id in ids:
            log.warning(f"Duplicated target. Consider renaming the apk file, skipping: '{id}'")
            continue
        output_path = os.path.join(output_dir if output_dir is not None else os.path.dirname(apk), id)
        decompile_cmd = ["bash", JADX_BIN, "--deobf", apk, "-d", output_path, "--comments-level", "none"]
        if is_quiet:
            decompile_cmd.append("--quiet")
        log.debug(f"Decompiling: '{apk}'")
        subprocess.run(decompile_cmd)
        log.info(f"Target decompiled to: '{output_path}'")
        output.append(output_path)
    if len(output) == 0:
        log.error("No target apk can be processed further.\n")
        return
    update_db(targets, output)
    post_decompile(targets)
    log.info("Decompilation completed.\n")


def update_db(db, paths):
    for path in paths:
        id = os.path.basename(path)
        manifest = utils.get_manifest_file(path)
        strings = utils.get_string_file(path)
        app_details = get_app_details(manifest)
        app_name = get_app_name(strings)
        if id not in db:
            db[id] = {
                "app_name": app_name,
                "path": path,
                "package": app_details["package"],
                "version": app_details["version"],
                "min_sdk": app_details["min_sdk"],
                "target_sdk": app_details["target_sdk"]
            }
    update_target_db(db)


def decompile(args):
    print("")
    apks = list()
    quiet = False
    output_dir = None
    if is_quiet(args):
        quiet = True
    if should_output_dir(args):
        output_dir = args[args.index("--output") + 1]
        if not utils.is_path_exists(output_dir):
            log.error("Output directory not found. Terminating..\n")
            return
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
    run_decompiler(apks, quiet, output_dir)