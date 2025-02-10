import settings.utils as utils

from output.show import display_target_info
from output.show import display_device_info
from output.show import display_module_options
from output.show import display_component_summary
from settings.device_info import get_connected_devices
from settings.device_info import get_connected_device_info
from settings.target_info import get_target_db, get_app_components
from settings.logger import get_logger
from state.module import module_state
from state.options import option_state


log = get_logger(__name__)


def is_target_specified(args):
    return len(args) > 0 and "--target" in args


def is_component_exist(args):
    return len(args) > 0 and ("--component" in args or "--activity" in args or "--provider" in args or "--receiver" in args or "--service" in args)


def format_component(targets, ids):
    component = dict()
    for id in ids:
        manifest = utils.get_manifest_file(targets[id]["path"])
        component[id] = {
            "package": targets[id]["package"],
            "components": get_app_components(manifest)
        }
    return component


def target_info(args=None):
    targets = get_target_db()
    if targets is None:
        log.error("Target DB not found.")
        return
    ids = list(targets)
    if is_target_specified(args):
        specified = args[args.index("--target") + 1].split(",")
        valid_ids = list()
        for id in specified:
            target_id = id
            if id.isdigit():
                target_id = int(id)
                if target_id < 1 or target_id > len(ids):
                    log.error("Invalid target index.")
                    return
                valid_ids.append(ids[target_id - 1])
            else:
                if target_id in ids:
                    valid_ids.append(target_id)
        ids = valid_ids
    if len(ids) == 0:
        log.error("No targets available.")
        return
    print("")
    if is_component_exist(args):
        components = format_component(targets, ids)
        display_component_summary(args, components, ids)
    else:
        display_target_info(targets, ids)


def device_info(args=None):
    devices = get_connected_devices()
    if len(devices) == 0:
        log.error("No connected devices detected.")
        return
    print("")
    device_info = get_connected_device_info(devices)
    display_device_info(device_info)


def module_options(args=None):
    opts = option_state.get_all_options()
    if len(opts) == 0:
        log.error("No module selected. Please select an exploit module.")
        return
    print("")
    module_name = module_state.get("name")
    display_module_options(opts, module_name)