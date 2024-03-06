from output.search import display_modules
from settings.modules_info import filter_modules
from settings.logger import get_logger
from state.module import module_state


log = get_logger(__name__)


def module(args=None):
    modules = filter_modules(args[0])
    if len(modules) == 0:
        log.error("No modules found.")
        return
    module_state.filtered = modules
    log.debug("Displaying modules..\n")
    display_modules(modules)