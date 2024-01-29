import subprocess
import utils

from defusedxml.minidom import parse
from globals import TARGET_PATH, INVALID_COMMAND
from logger import init_logger
from progress import progress_bar
from rich import box
from rich.live import Live
from rich.table import Table
from time import sleep

log = init_logger(__name__)

def run_adb(device_id, cmd, shell=False):
    command = [utils.get_adb_bin(), "-s", device_id]
    if shell:
        command.append("shell")
    command.extend(cmd)
    try:
        output = subprocess.check_output(command, stderr=subprocess.STDOUT, text=True)
        return output
    except Exception:
        return None

def get_connected_devices():
    output = subprocess.check_output([utils.get_adb_bin(), "devices"], text=True).splitlines()
    devices = list()
    if len(output) > 2:
        for i in range(len(output) - 1):
            if output[i] == "List of devices attached" and i != len(output) - 1:
                for i in range(len(output) - 2):
                    device = output[i+1].split("\t")[0]
                    devices.append(device)
                break
    return devices

def get_connected_device_info():
    device_info = list()
    devices = get_connected_devices()
    for device in devices:
        build_version = run_adb(device, ["getprop", "ro.build.version.release"], True).split('\n')[0]
        sdk = run_adb(device, ["getprop", "ro.build.version.sdk"], True).split('\n')[0]
        architecture = run_adb(device, ["getprop", "ro.product.cpu.abi"], True).split('\n')[0]
        hardware = run_adb(device, ["getprop", "ro.hardware"], True).split('\n')[0]
        brand = run_adb(device, ["getprop", "ro.product.brand"], True).split('\n')[0]
        manufacturer = run_adb(device, ["getprop", "ro.product.manufacturer"], True).split('\n')[0]
        model = run_adb(device, ["getprop", "ro.product.model"], True).split('\n')[0]
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

def display_device_info():
    summaries = get_connected_device_info()
    if len(summaries) == 0:
        log.error("No connected devices detected.")
        return
    print("")
    table = Table(title="Connected Device Info", box=box.ROUNDED)
    table.add_column("No.", style="white", justify="center")
    table.add_column("Device ID", style="cyan", justify="center")
    table.add_column("Model", style="yellow", justify="center")
    table.add_column("Brand", style="magenta", justify="center")
    table.add_column("Manufacturer", style="red", justify="center")
    table.add_column("Hardware", style="green", justify="center")
    table.add_column("Build Version", style="blue", justify="center")
    table.add_column("SDK Version", style="yellow", justify="center")
    table.add_column("Architecture", style="white", justify="center")
    with Live(table, refresh_per_second = 4):
        for i, summary in enumerate(summaries):
            sleep(0.5)
            table.add_row(
                str(i+1),
                summary["device_id"],
                summary["model"],
                summary["brand"],
                summary["manufacturer"],
                summary["hardware"],
                summary["build_version"],
                summary["sdk"],
                summary["architecture"]
            )
    print("\n")
    
def get_app_details_from_manifest(manifest_file):
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

def get_app_name_from_string_file(strings_file):
    dom = parse(strings_file)
    strings = dom.getElementsByTagName("string")
    for string in strings:
        if string.getAttribute("name") == "app_name":
            app_name = string.firstChild.nodeValue
            return app_name

def get_target_info(targets):
    summaries = list()
    for target in targets:
        target_id = target.split("/")[-1]
        manifest = target + "/resources/AndroidManifest.xml"
        string = target + "/resources/res/values/strings.xml"
        app_name = get_app_name_from_string_file(string)
        app_info = get_app_details_from_manifest(manifest)
        app_details = {
            "target_id": target_id,
            "app_name": app_name,
            "package_name": app_info["package"],
            "version": app_info["version"],
            "min_sdk": app_info["min_sdk"],
            "target_sdk": app_info["target_sdk"]
        }
        if not any(summary.get("package_name") == app_details["package_name"] for summary in summaries):
            summaries.append(app_details)
        else:
            log.warning(f"Duplicated apps detected. Consider removing: {target}")
    return summaries

def display_target_info(targets):
    summaries = get_target_info(targets)
    if len(summaries) == 0:
        log.error("No targets can be found.")
        return
    print("")
    table = Table(title="Target Info", box=box.ROUNDED)
    table.add_column("No.", style="white", justify="center")
    table.add_column("Target ID", style="orange3", justify="center")
    table.add_column("App Name", style="cyan", justify="center")
    table.add_column("Package", style="yellow", justify="center")
    table.add_column("App Version", style="magenta", justify="center")
    table.add_column("Min. SDK", style="red", justify="center")
    table.add_column("Target SDK", style="green", justify="center")
    with Live(table, refresh_per_second = 4):
        for i, summary in enumerate(summaries):
            sleep(0.5)
            table.add_row(
                str(i+1),
                summary["target_id"],
                summary["app_name"],
                summary["package_name"],
                summary["version"],
                summary["min_sdk"],
                summary["target_sdk"]
            )
    print("\n")

def get_info(args):
    if len(args) > 1 and len(args) <= 3:
        if len(args) == 2:
            if args[0] == "device" and args[1] == "info":
                progress_bar()
                display_device_info()
            elif args[0] == "target" and args[1] == "info":
                progress_bar()
                targets = utils.get_target_paths()
                display_target_info(targets)
            else:
                log.error(INVALID_COMMAND)
        else:
            if args[0] == "target" and args[2] == "info":
                progress_bar()
                targets = args[1].split(",")
                available_targets = list()
                for target in targets:
                    target_path = TARGET_PATH + "/" + target
                    if utils.is_path_exists(target_path):
                        available_targets.append(target_path)
                    else:
                        log.warning(f"Target not found. Ignoring: {target}")
                display_target_info(available_targets)
            else:
                log.error(INVALID_COMMAND)
    else:
        log.error(INVALID_COMMAND)