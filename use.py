import os
import utils

from get import get_connected_device_info
from globals import INVALID_COMMAND, MODULE_PATH
from logger import get_logger

log = get_logger(__name__)

def use(args):
    """
        use device <device_id>
        use <exploit>
    """
    if len(args) > 0 and len(args) <= 2:
        if len(args) == 2:
            device_id = args[1]
            connected_device = get_connected_device_info()
            for device in connected_device:
                if (device.get("device_id") == device_id):
                    return {
                        "type": "device",
                        "device_id": device_id
                    }
            log.error("Device is not connected.")
            return ""
        else:
            exploit = args[0]
            path = exploit.split("/")
            exploit_path = MODULE_PATH + "/" + exploit
            if utils.is_path_exists(exploit_path):
                return {
                    "type": "exploit",
                    "exploit_path": exploit_path,
                    "category": path[0],
                    "exploit_id": path[-1]
                }
            log.error("Exploit template not found.")
            return ""
    else:
        log.error(INVALID_COMMAND)
        return ""