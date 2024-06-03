from output.progress import progress_bar
from settings.logger import get_logger
from rich import box
from rich import print
from rich.console import Console
from rich.live import Live
from rich.panel import Panel
from rich.table import Table
from rich.text import Text
from time import sleep


log = get_logger(__name__)


def display_device_info(device_dict):
    progress_bar("Getting device info")
    print("")
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
    print("")
    table = Table(
        title="Target Info",
        caption="Interact with a target by target id or index.",
        box=box.ROUNDED
    )
    table.add_column("#", style="bright_white", justify="center")
    table.add_column("Target ID", style="bright_cyan", justify="center")
    table.add_column("App Name", style="orange3", justify="center")
    table.add_column("Path", style="bright_yellow", justify="center", overflow="fold")
    table.add_column("Package", style="bright_magenta", justify="center", overflow="fold")
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


def display_activity_summary(components, id):
    activities = components[id]["components"]["act"]
    if len(activities) == 0:
        log.error("No activities found.\n")
        return
    act_table = Table(box=box.ROUNDED)
    act_table.add_column("Activity", style="bright_white")
    act_table.add_column("Exported", style="bright_yellow", justify="center")
    act_table.add_column("Action", style="bright_cyan")
    act_table.add_column("Deeplink", style="bright_magenta", justify="center")
    with Live(act_table, refresh_per_second=4):
        sleep(0.1)
        for activity in activities:
            actions = [filter["action"] for filter in activity["intent_filters"]] if activity["intent_filters"] is not None else None
            deeplinks = [None if filter["deeplink"] is None else filter["deeplink"] for filter in activity["intent_filters"]] if activity["intent_filters"] is not None else None
            act_table.add_row(
                activity["name"],
                activity["exported"],
                "".join(["• " + action + ("\n" if i < len(actions) - 1 else "") for i,action in enumerate(actions)]) if actions is not None else "-",
                "".join(["-" + ("\n" if i < len(deeplinks) - 1 else "") if deeplink is None else deeplink for i,deeplink in enumerate(deeplinks)]) if deeplinks is not None else "-"
            )


def display_provider_summary(components, id):
    providers = components[id]["components"]["prov"]
    if len(providers) == 0:
        log.error("No providers found.\n")
        return
    prov_table = Table(box=box.ROUNDED)
    prov_table.add_column("Provider", style="bright_white")
    prov_table.add_column("Authorities", style="bright_yellow", justify="center")
    prov_table.add_column("Exported", style="bright_cyan")
    prov_table.add_column("Permission", style="bright_green", justify="center")
    prov_table.add_column("Read Permission", style="bright_magenta", justify="center")
    prov_table.add_column("Write Permission", style="bright_red", justify="center")
    prov_table.add_column("Grant URI Permission", style="bright_blue", justify="center")
    with Live(prov_table, refresh_per_second=4):
        sleep(0.1)
        for provider in providers:
            prov_table.add_row(
                provider["name"],
                provider["authorities"],
                provider["exported"],
                provider["permission"] if provider["permission"] is not None else "-",
                provider["read_permission"] if provider["read_permission"] is not None else "-",
                provider["write_permission"] if provider["write_permission"] is not None else "-",
                provider["grant_uri_permission"] if provider["grant_uri_permission"] is not None else "-"
            )


def display_receiver_summary(components, id):
    receivers = components[id]["components"]["recv"]
    if len(receivers) == 0:
        log.error("No receivers found.\n")
        return
    recv_table = Table(box=box.ROUNDED)
    recv_table.add_column("Receiver", style="bright_white")
    recv_table.add_column("Exported", style="bright_yellow", justify="center")
    recv_table.add_column("Permission", style="bright_cyan", justify="center")
    recv_table.add_column("Actions", style="bright_magenta")
    with Live(recv_table, refresh_per_second=4):
        sleep(0.1)
        for receiver in receivers:
            recv_table.add_row(
                receiver["name"],
                receiver["exported"],
                receiver["permission"] if receiver["permission"] is not None else "-",
                "".join(["• " + action + ("\n" if i < len(receiver["action"]) - 1 else "") for i,action in enumerate(receiver["action"])]) if receiver["action"] is not None else "-",
            )


def display_service_summary(components, id):
    services = components[id]["components"]["serv"]
    if len(services) == 0:
        log.error("No services found.\n")
        return
    serv_table = Table(box=box.ROUNDED)
    serv_table.add_column("Service", style="bright_white")
    serv_table.add_column("Exported", style="bright_yellow", justify="center")
    serv_table.add_column("Permission", style="bright_cyan", justify="center")
    serv_table.add_column("Actions", style="bright_magenta")
    with Live(serv_table, refresh_per_second=4):
        sleep(0.1)
        for service in services:
            serv_table.add_row(
                service["name"],
                service["exported"],
                service["permission"] if service["permission"] is not None else "-",
                "".join(["• " + action + ("\n" if i < len(service["action"]) - 1 else "") for i,action in enumerate(service["action"])]) if service["action"] is not None else "-",
            )


def display_component_summary(args, components, ids):
    progress_bar("Getting component detail")
    for id in ids:
        print(
            Panel.fit(
                Text(
                    f"{id} ({components[id]['package']})",
                    style="italic bright_white", 
                    justify="center"
                ),
                box=box.DOUBLE, 
                border_style="bold magenta"
            )
        )
        if "--activity" in args:
            display_activity_summary(components, id)
        if "--provider" in args:
            display_provider_summary(components, id)
        if "--receiver" in args:
            display_receiver_summary(components, id)
        if "--service" in args:
            display_service_summary(components, id)
        if "--component" in args:
            display_activity_summary(components, id)
            display_provider_summary(components, id)
            display_receiver_summary(components, id)
            display_service_summary(components, id)
        print("")


def display_module_options(options, name):
    console = Console(width=130)
    table = Table(
        title=f"Module name: [bright_magenta]{name}[/]",
        caption="Set module option with 'set <option>=<value>'.",
        box=box.SIMPLE, 
        padding=(0,2), 
        title_justify="left"
    )
    table.add_column("Name", style="bright_white")
    table.add_column("Setting", style="bright_yellow", overflow="fold")
    table.add_column("Required", style="bright_cyan")
    table.add_column("Description", style="bright_white")
    options = dict(sorted(options.items(), key=lambda x:x[1].required, reverse=True))
    for k,v in options.items():
        table.add_row(
            k.upper(),
            str(v.default),
            str(v.required).upper(),
            v.desc
        )
    console.print(table)
    print("")