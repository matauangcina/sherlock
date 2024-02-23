from output.progress import progress_bar
from rich import box
from rich.live import Live
from rich.table import Table
from time import sleep


def display_device_info(device_dict):
    progress_bar("Getting device info")
    print("")
    table = Table(title="Connected Device Info", caption="Use a device by device id or index.", box=box.ROUNDED)
    table.add_column("#", style="bright_white", justify="center")
    table.add_column("Device ID", style="bright_cyan", justify="center")
    table.add_column("Model", style="bright_yellow", justify="center")
    table.add_column("Brand", style="bright_magenta", justify="center")
    table.add_column("Manufacturer", style="bright_red", justify="center")
    table.add_column("Hardware", style="bright_green", justify="center")
    table.add_column("Build Version", style="bright_blue", justify="center")
    table.add_column("SDK Version", style="bright_yellow", justify="center")
    table.add_column("Architecture", style="bright_white", justify="center")
    with Live(table, refresh_per_second=4):
        for device in device_dict:
            sleep(0.1)
            table.add_row(
                device["idx"],
                device["device_id"],
                device["model"],
                device["brand"],
                device["manufacturer"],
                device["hardware"],
                device["build_version"],
                device["sdk"],
                device["architecture"]
            )
    print("")


def display_target_info(target_dict):
    progress_bar("Getting target info")
    print("")
    table = Table(title="Target Info", box=box.ROUNDED)
    table.add_column("#", style="bright_white", justify="center")
    table.add_column("Target ID", style="bright_cyan", justify="center")
    table.add_column("App Name", style="bright_yellow", justify="center")
    table.add_column("Package", style="bright_magenta", justify="center")
    table.add_column("App Version", style="bright_red", justify="center")
    table.add_column("Min. SDK", style="bright_green", justify="center")
    table.add_column("Target SDK", style="bright_blue", justify="center")
    with Live(table, refresh_per_second=4):
        for target in target_dict:
            sleep(0.1)
            table.add_row(
                target["idx"],
                target["target_id"],
                target["app_name"],
                target["package_name"],
                target["version"],
                target["min_sdk"],
                target["target_sdk"]
            )
    print("")