import os
import settings.utils as utils

from globals import MODULE_PATH
from settings.logger import get_logger
from state.module import module_state
from state.options import option_state


log = get_logger(__name__)


def options(args=None):
    options = option_state.get_all_options()
    if len(options) == 0:
        log.error("No module selected. Please select a module.")
        return
    name = module_state.get("name")
    module_path = os.path.join(MODULE_PATH, module_state.get("path"))
    if utils.is_path_exists(module_path):
        module_name = os.path.basename(name)
        module = utils.import_module(os.path.dirname(module_path), module_name)
        module.SherlockModule().print_option_template()