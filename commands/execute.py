import os
import settings.utils as utils

from settings.config import extend_search_path
from globals import MODULE_PATH
from settings.logger import get_logger
from state.device import device_state
from state.module import module_state
from state.options import option_state


log = get_logger(__name__)


def module(args=None):
    options = option_state.get_all_options()
    for k,v in options.items():
        if not v.is_valid(v.default):
            log.error(f"Option: '{k}' are not set.")
            return
    device = device_state.device_id
    if device is None:
        log.error("No device is used. Use a device with the following command: 'use device <device_id>'")
        return
    name = module_state.get("name")
    extend_search_path(name)
    module_path = os.path.join(MODULE_PATH, module_state.get("path"))
    if utils.is_path_exists(module_path):
        module_name = os.path.basename(name)
        exploit_module = __import__(module_name)
        exploit_instance = getattr(exploit_module, "SherlockModule")()
        exploit_instance.execute()