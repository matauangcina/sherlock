import os
import settings.utils as utils

from globals import MODULE_PATH
from settings.logger import get_logger
from state.device import device_state
from state.module import module_state
from state.options import option_state


log = get_logger(__name__)


def module(args=None):
    options = option_state.get_all_options()
    for opts in options.values():
        for k,v in opts.items():
            if not v.is_valid(str(v.default)):
                log.error(f"Option: '{k}' is not set.")
                return
    device = device_state.device_id
    if device is None:
        log.error("No device is currently used. Use a device with: 'use device <device_id>'")
        return
    print("")
    name = module_state.get("name")
    module_path = os.path.join(MODULE_PATH, module_state.get("path"))
    if utils.is_path_exists(module_path):
        module_name = os.path.basename(name)
        module = utils.import_module(os.path.dirname(module_path), module_name)
        module.SherlockModule().execute()