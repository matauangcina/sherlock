import re
import subprocess
import settings.utils as utils


def get_connected_devices():
    output = subprocess.check_output([utils.get_adb_bin(), "devices"], stderr=subprocess.STDOUT, text=True).splitlines()
    devices = list()
    if len(output) != 0:
        for line in output:
            if re.match(r"^.+device$", line):
                device = line.split("\t")[0]
                devices.append(device)
    return devices


def get_connected_device_info(devices):
    device_info = list()
    for device in devices:
        build_version = utils.run_adb(device, ["getprop", "ro.build.version.release"], True).split('\n')[0]
        sdk = utils.run_adb(device, ["getprop", "ro.build.version.sdk"], True).split('\n')[0]
        architecture = utils.run_adb(device, ["getprop", "ro.product.cpu.abi"], True).split('\n')[0]
        hardware = utils.run_adb(device, ["getprop", "ro.hardware"], True).split('\n')[0]
        brand = utils.run_adb(device, ["getprop", "ro.product.brand"], True).split('\n')[0]
        manufacturer = utils.run_adb(device, ["getprop", "ro.product.manufacturer"], True).split('\n')[0]
        model = utils.run_adb(device, ["getprop", "ro.product.model"], True).split('\n')[0]
        summary = {
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