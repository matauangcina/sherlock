import os
import psutil
import shlex
import subprocess

from defusedxml.minidom import parse
from globals import TARGET_PATH, MODULE_PATH, ADB_BIN


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


def get_target_path_by_id(target_id):
    target_path = os.path.join(TARGET_PATH, target_id)
    return target_path if is_path_exists(target_path) else None


def get_module_path_by_id(module_name):
    module = os.path.join(MODULE_PATH, module_name)
    return module if is_path_exists(module) else None


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


def run_adb(device_id, cmd, shell=False):
    command = [get_adb_bin(), "-s", device_id]
    if shell:
        command.append("shell")
    command.extend(cmd)
    try:
        output = subprocess.check_output(command, stderr=subprocess.STDOUT, text=True)
        return output
    except Exception:
        return None


def get_connected_devices():
    output = subprocess.check_output([get_adb_bin(), "devices"], text=True).splitlines()
    devices = list()
    if len(output) > 2:
        for i in range(len(output) - 1):
            if output[i] == "List of devices attached" and i != len(output) - 1:
                for i in range(len(output) - 2):
                    device = output[i+1].split("\t")[0]
                    devices.append(device)
                break
    return devices


def get_app_details(manifest_file):
    ns = "android"
    dom = parse(manifest_file)
    manifest = dom.getElementsByTagName("manifest")
    sdk = dom.getElementsByTagName("uses-sdk")
    package_name = manifest[0].getAttribute("package")
    app_version = manifest[0].getAttribute(f"{ns}:versionName")
    min_sdk_version = sdk[0].getAttribute(f"{ns}:minSdkVersion")
    target_sdk_version = sdk[0].getAttribute(f"{ns}:targetSdkVersion")
    return {
        "package": package_name,
        "version": app_version,
        "min_sdk": min_sdk_version,
        "target_sdk": target_sdk_version
    }


def get_app_name(strings_file):
    dom = parse(strings_file)
    strings = dom.getElementsByTagName("string")
    for string in strings:
        if string.getAttribute("name") == "app_name":
            app_name = string.firstChild.nodeValue
            return app_name
    return "Not found"