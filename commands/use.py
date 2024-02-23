import settings.utils as utils

from settings.logger import get_logger
from state.device import device_state
from state.module import module_state


log = get_logger(__name__)


def device(args):
    print("")
    devices = utils.get_connected_devices()
    if args[0] not in devices:
        log.error(f"Device not connected: {args[0]}\n")
        return
    log.info(f"Connect to device: {args[0]}\n")
    device_state.set_device_id(args[0])
    

def module(args):
    print("")
    module = utils.get_module_path_by_id(args[0])
    if module is None:
        log.error(f"Module not found: {args[0]}\n")
        return
    log.info(f"Use module: {args[0]}\n")
    module = args[0].split("/")
    category = module[0]
    module_name = "/".join(module[1:])
    module_state.set_category(category)
    module_state.set_module_name(module_name)