import get
import os
import psutil

from globals import (
    TARGET_PATH,
    ADB_BIN
)

def is_path_exists(path):
    return os.path.exists(path)

def is_file(path):
    return os.path.isfile(path)

def is_dir(path):
    return os.path.isdir(path)

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

def get_target_paths():
    target_dir = list()
    if is_path_exists(TARGET_PATH):
        for dir in os.listdir(TARGET_PATH):
            target = os.path.join(TARGET_PATH, dir)
            if os.path.isdir(target) and is_path_exists(target):
                target_dir.append(target)
    return target_dir

def get_manifest():
    manifest = list()
    target_paths = get_target_paths()
    for target in target_paths:
        manifest_path = target + "/resources/AndroidManifest.xml"
        if is_path_exists(manifest_path):
            manifest.append(manifest_path)
    return manifest

def get_codebase_path():
    codebase = list()
    manifest_files = get_manifest()
    target_paths = get_target_paths()
    for i, target in enumerate(target_paths):
        package_name = get.get_app_details_from_manifest(manifest_files[i])["package"]
        codebase_path = target + "/sources/" + package_name.replace(".", "/") + "/"
        if is_path_exists(codebase_path):
            codebase.append(codebase_path)
    return codebase