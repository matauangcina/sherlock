from output.show import display_target_info
from output.show import display_device_info
from output.show import display_module_options
from settings.device_info import get_connected_devices
from settings.device_info import get_connected_device_info
from settings.target_info import get_target_db
from settings.logger import get_logger
from state.module import module_state
from state.options import option_state


log = get_logger(__name__)


def target_info(args=None):
    targets = get_target_db()
    if targets is None:
        log.error("Target DB not found.")
        return
    ids = list(targets)
    if len(ids) == 0:
        log.error("No targets available.")
        return
    log.debug("Displaying target info..\n")
    display_target_info(targets, ids)


def device_info(args=None):
    devices = get_connected_devices()
    if len(devices) == 0:
        log.error("No connected devices are detected.")
        return
    device_info = get_connected_device_info(devices)
    log.debug("Displaying connected device info..\n")
    display_device_info(device_info)


def module_options(args=None):
    opts = option_state.get_all_options()
    if len(opts) == 0:
        log.error("No module selected. Please select an exploit module")
        return
    module_name = module_state.get("name")
    log.debug("Displaying module options..\n")
    display_module_options(opts, module_name)