import os
import re
import random
import string
import subprocess
import utils

from config import manifest_post_process
from globals import TARGET_PATH, JADX_BIN
from logger import get_logger
from rich.console import Console
from scan import run_engine
from time import sleep

console = Console(log_path=False)

log = get_logger(__name__)

def run_decompiler(path, status):
    status.update(status="[bold green] Setting up workspace", spinner="dots")
    sleep(1)
    name = path.split("/")[-1].split(".")[0]
    target_path = TARGET_PATH + "/" + name
    console.log("Creating workspace")
    sleep(1)
    if utils.is_path_exists(target_path):
        target_path += "-" + "".join(random.choice(string.ascii_lowercase) for _ in range(3))
    os.makedirs(target_path)
    console.log(f"Target workspace: {target_path}")
    sleep(1)
    status.update(status="[bold yellow] Running decompiler", spinner="clock")
    sleep(1)
    console.log("Decompiler initiated...")
    subprocess.run(["bash", JADX_BIN, "--deobf", path, "-d", target_path, "--quiet"])
    console.log("Target decompiled!")
    sleep(1)

def decompile(args):
    print("")
    is_exist_list = list()
    with console.status("[bold orange3] Initiating decompiling process", spinner="dots") as status:
        sleep(1)
        for apk in args:
            status.update(status="[bold blue] Locating apk", spinner="earth")
            sleep(1)
            console.log("Getting apk file")
            sleep(1)
            if utils.is_path_exists(apk):
                if re.match(r".+\.apk$", apk) and utils.is_file(apk):
                    console.log(f"Target found: {apk}")
                    sleep(1)
                    is_exist_list.append(True)
                    run_decompiler(apk, status)
                else:
                    if utils.is_dir(apk):
                        for file in os.listdir(apk):
                            apk_file = apk + "/" + file
                            if re.match(r".+\.apk$", apk_file) and utils.is_file(apk_file):
                                console.log(f"Target apk: {apk_file}")
                                sleep(1)
                                is_exist_list.append(True)
                                run_decompiler(apk_file, status)
                            else:
                                is_exist_list.append(False)
                                console.log(f"APK not found. Ignoring: {apk}")
                                sleep(0.5)
                    else:
                        is_exist_list.append(False)
                        console.log(f"APK not found. Ignoring: {apk}")
                        sleep(0.5)
            else:
                is_exist_list.append(False)
                console.log(f"APK not found. Ignoring: {apk}")
                sleep(0.5)
        if all(not is_exist for is_exist in is_exist_list):
            console.print("[bold white on red] No valid apk file is found [/]\n")
        else:
            post_decompile(status)
            console.print("[bold white on green] Decompilation completed [/]\n")

def post_decompile(status):
    status.update("[bold red] Getting things ready", spinner="bouncingBall", spinner_style="yellow")
    console.log("Post decompilation process initiating")
    codebase = utils.get_codebase_path()
    manifest_post_process()
    _ = run_engine(codebase, "mod", True)