import os
import settings.utils as utils

from globals import TARGET_PATH
from output.get import display_target_info
from output.get import display_device_info
from settings.logger import get_logger


log = get_logger(__name__)


def is_target_specified(args):
    return len(args) > 0 and "--target" in args


def get_target_info(targets):
    target_info = list()
    for i,target in enumerate(targets):
        target_id = target.split("/")[-1]
        manifest = utils.get_manifest_file(target)
        strings = utils.get_string_file(target)
        app_name = utils.get_app_name(strings)
        app_details = utils.get_app_details(manifest)
        summary = {
            "idx": str(i+1),
            "target_id": target_id,
            "app_name": app_name,
            "package_name": app_details["package"],
            "version": app_details["version"],
            "min_sdk": app_details["min_sdk"],
            "target_sdk": app_details["target_sdk"]
        }
        if not any(info.get("package_name") == summary["package_name"] for info in target_info):
            target_info.append(summary)
        else:
            log.warning(f"Duplicated target detected. Consider removing: {target_id}")
    return target_info


def get_connected_device_info(devices):
    device_info = list()
    for i,device in enumerate(devices):
        build_version = utils.run_adb(device, ["getprop", "ro.build.version.release"], True).split('\n')[0]
        sdk = utils.run_adb(device, ["getprop", "ro.build.version.sdk"], True).split('\n')[0]
        architecture = utils.run_adb(device, ["getprop", "ro.product.cpu.abi"], True).split('\n')[0]
        hardware = utils.run_adb(device, ["getprop", "ro.hardware"], True).split('\n')[0]
        brand = utils.run_adb(device, ["getprop", "ro.product.brand"], True).split('\n')[0]
        manufacturer = utils.run_adb(device, ["getprop", "ro.product.manufacturer"], True).split('\n')[0]
        model = utils.run_adb(device, ["getprop", "ro.product.model"], True).split('\n')[0]
        summary = {
            "idx": str(i+1),
            "device_id": device,
            "build_version": build_version,
            "sdk": sdk,
            "architecture": architecture,
            "hardware": hardware,
            "brand": brand,
            "manufacturer": manufacturer,
            "model": model
        }
        device_info.append(summary)
    return device_info


def target_info(args=None):
    print("")
    if not utils.is_path_exists(TARGET_PATH):
        log.error("Workspace is empty. Please decompile target apps to workspace.\n")
        return
    target_ids = os.listdir(TARGET_PATH)
    if is_target_specified(args):
        specified_targets = args[args.index("--target") + 1].split(",")
        target_ids = [target for target in specified_targets]
    targets = list()
    for target_id in target_ids:
        target_path = utils.get_target_path_by_id(target_id)
        if target_path is not None:
            targets.append(target_path)
            continue
        log.warning(f"Target invalid, skipping: {target_id}.")
    if len(targets) == 0:
        log.error("No targets found. Terminating..\n")
        return
    target_info = get_target_info(targets)
    log.debug("Displaying target info..\n")
    display_target_info(target_info)


def device_info(args=None):
    print("")
    devices = utils.get_connected_devices()
    if len(devices) == 0:
        log.error("No connected devices are detected. Terminating..\n")
        return
    device_info = get_connected_device_info(devices)
    log.debug("Displaying connected device info..\n")
    display_device_info(device_info)