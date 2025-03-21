import os
import settings.utils as utils

from globals import MODULE_PATH
from settings.logger import get_logger
from state.module import module_state
from state.options import option_state


log = get_logger(__name__)


def option_value(args):
    opts = option_state.get_all_options()
    if len(opts) == 0:
        log.error("No module selected. Please select a module.")
        return    
    avail_opts = list()
    for opt in opts.values():
        avail_opts.extend(opt.keys())
    for arg in args:
        option = arg.split("=")[0]
        value = arg.split("=")[1]
        if option.upper() not in avail_opts:
            log.error(f"Option invalid: {option.upper()}")
            return
        for component,options in opts.items():
            for k,v in options.items():
                if option.upper() == k:
                    if v.is_valid(value, is_empty=False):
                        v.default = v.cast(value)
                        option_state.update(component, options)
                        log.info(f"{option.upper()} = {value}")
                        break
                    log.error(f"Input: '{value}' is invalid for option: {k}")
                    return
    name = module_state.get("name")
    module_path = os.path.join(MODULE_PATH, module_state.get("path"))
    if utils.is_path_exists(module_path):
        module_name = os.path.basename(name)
        module = utils.import_module(os.path.dirname(module_path), module_name)
        module.SherlockModule().update_option_status()