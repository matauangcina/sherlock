from settings.logger import get_logger
from state.module_singleton import ModuleSingleton
from state.opt import Opt


log = get_logger(__name__)


class Options:

    def __init__(self):
        self._datastore = ModuleSingleton()

    def add_options(self, options):
        if len(options) == 0:
            return
        if len(self.get_all_options()) != 0:
            self.reset_options()
        for option in options:
            if isinstance(option, list):
                option_class = option[0]
                option_args = option[1:]
                option_instance = option_class(*option_args)
            elif isinstance(option, Opt):
                option_instance = option
            else:
                log.error(f"Option not compatible: {option}")
                return
            self._datastore.store_option(option_instance.name, option_instance)
    
    def update(self, key, value):
        self._datastore.update_option(key, value)
    
    def remove(self, name):
        self._datastore.delete_option(name)

    def reset_options(self):
        self._datastore.delete_options()

    def get(self, name):
        return self._datastore.get_option(name)

    def get_all_options(self):
        return self._datastore.get_options()


option_state = Options()