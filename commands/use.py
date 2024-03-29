import os
import settings.utils as utils

from globals import MODULE_PATH
from settings.logger import get_logger
from settings.device_info import get_connected_devices
from settings.modules_info import store_module_info
from state.device import device_state
from state.module import module_state


log = get_logger(__name__)


def device(args):
    devices = get_connected_devices()
    if len(devices) == 0:
        log.error("No device is connected to host. Please connect a device before proceeding.")
        return
    use_device = args[0]
    if use_device.isdigit():
        use_device = int(use_device)
        if use_device < 1 or use_device > len(devices):
            log.error("Invalid device index.")
            return
        use_device = devices[use_device - 1]
    elif use_device not in devices:
        log.error(f"Device '{use_device}' is not connected.")
        return
    log.info(f"Selected device: '{use_device}'")
    device_state.device_id = use_device


def module(args):
    search = module_state.filtered
    use_module = args[0]
    if use_module.isdigit():
        use_module = int(use_module)
        if search is None:
            log.error("Selecting module with index can only be done after listing the modules. List modules with: 'search module <keyword>'")
            return
        if use_module < 1 or use_module > len(search):
            log.error("Invalid module index.")
            return
        use_module = search[use_module - 1]["name"]
    module_path = os.path.join(MODULE_PATH, use_module + ".py")
    if utils.is_path_exists(module_path):
        store_module_info(use_module)
        module_name = os.path.basename(use_module)
        module = utils.import_module(os.path.dirname(module_path), module_name)
        module.SherlockModule().register_options()
        log.info(f"Module: '{use_module}'")
    else:
        log.error("Selected module does not exist.")