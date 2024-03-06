import os
import psutil
import shlex
import subprocess

from globals import ADB_BIN, POC_PATH
from settings.target_info import get_app_details


def is_path_exists(path):
    return os.path.exists(path)


def is_file(path):
    return os.path.isfile(path)


def is_dir(path):
    return os.path.isdir(path)


def get_commands(text):
    return shlex.split(text)


def get_manifest_file(target_path):
    manifest = os.path.join(target_path, "resources/AndroidManifest.xml")
    return manifest if is_path_exists(manifest) else None


def get_string_file(target_path):
    strings = os.path.join(target_path, "resources/res/values/strings.xml")
    return strings if is_path_exists(strings) else None


def get_poc_manifest():
    manifest = os.path.join(POC_PATH["main"], "AndroidManifest.xml")
    return manifest if is_path_exists(manifest) else None


def get_poc_layout():
    layout = os.path.join(POC_PATH["layout"], "activity_main.xml")
    return layout if is_path_exists(layout) else None


def get_poc_main():
    main = os.path.join(POC_PATH["code"], "MainActivity.java")
    return main if is_path_exists(main) else None


def get_codebase_path(target_path):
    manifest = get_manifest_file(target_path)
    package_name = get_app_details(manifest)["package"]
    codebase = "sources/" + package_name.replace(".", "/")
    codebase_path = os.path.join(target_path, codebase)
    return codebase_path if is_path_exists(codebase_path) else None


def find_process_by_name(name):
    process = list()
    for p in psutil.process_iter(["name"]):
        if p.info["name"] == name:
            process.append(p.exe())
    return process


def get_adb_bin():
    global ADB_BIN
    adb_bin = find_process_by_name("adb")
    if adb_bin:
        ADB_BIN = adb_bin.pop()
        return ADB_BIN
    return "adb"


def run_adb(device_id, cmd, shell=False, realtime=False):
    command = [get_adb_bin(), "-s", device_id]
    if shell:
        command.append("shell")
    command.extend(cmd)
    if realtime:
        try:
            output = subprocess.Popen(command, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, universal_newlines=True)
            return output
        except Exception:
            return None
    try:
        output = subprocess.check_output(command, stderr=subprocess.STDOUT, text=True)
        return output
    except Exception:
        return None