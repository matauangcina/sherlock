from output.progress import progress_bar
from rich import box
from rich import print
from rich.live import Live
from rich.table import Table
from time import sleep


def display_device_info(device_dict):
    progress_bar("Getting device info")
    table = Table(
        title="Connected Device Info", 
        caption="Use a device by device id or index.", 
        box=box.ROUNDED
    )
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
        for i,device in enumerate(device_dict):
            sleep(0.1)
            table.add_row(
                str(i+1),
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


def display_target_info(targets, ids):
    progress_bar("Getting target info")
    table = Table(
        title="Target Info",
        caption="Interact with a target by target id or index.",
        box=box.ROUNDED
    )
    table.add_column("#", style="bright_white", justify="center")
    table.add_column("Target ID", style="bright_cyan", justify="center")
    table.add_column("App Name", style="orange3", justify="center")
    table.add_column("Path", style="bright_yellow", justify="center")
    table.add_column("Package", style="bright_magenta", justify="center")
    table.add_column("App Version", style="bright_red", justify="center")
    table.add_column("Min. SDK", style="bright_green", justify="center")
    table.add_column("Target SDK", style="bright_blue", justify="center")
    with Live(table, refresh_per_second=4):
        for i,id in enumerate(ids):
            sleep(0.1)
            table.add_row(
                str(i+1),
                id,
                targets[id]["app_name"],
                targets[id]["path"],
                targets[id]["package"],
                targets[id]["version"],
                targets[id]["min_sdk"],
                targets[id]["target_sdk"],
            )
    print("")


def display_module_options(options, name):
    table = Table(
        title=f"Module name: [bright_magenta]{name}[/]",
        caption="Set module option with 'set <option> <value>'.",
        box=box.SIMPLE, 
        padding=(0,2), 
        title_justify="left"
    )
    table.add_column("Name", style="bright_white")
    table.add_column("Setting", style="bright_yellow")
    table.add_column("Required", style="bright_cyan")
    table.add_column("Description", style="bright_white")
    for k,v in options.items():
        table.add_row(
            k.upper(),
            str(v.default),
            str(v.required).upper(),
            v.desc
        )
    print(table)
    print("")