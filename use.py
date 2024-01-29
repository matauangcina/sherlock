from get import get_connected_device_info
from globals import INVALID_COMMAND
from logger import init_logger

log = init_logger(__name__)

def use(args):
    if len(args) != 1:
        log.error(INVALID_COMMAND)
        return ""
    else:
        device_id = args[0]
        connected_device = get_connected_device_info()
        if any(device.get("device_id") == device_id for device in connected_device):
            return device_id
        else:
            return ""