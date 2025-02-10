from settings.logger import get_logger
from state.module_singleton import ModuleSingleton
from state.opt import Opt


log = get_logger(__name__)


class Options:

    def __init__(self):
        self._module_singleton = ModuleSingleton()

    def add_options(self, options):
        if len(options) == 0:
            return
        if len(self.get_all_options()) != 0:
            self.reset_options()
        for component,opts in options.items():
            opts_dict = dict()
            for opt in opts:
                if isinstance(opt, list):
                    option_class = opt[0]
                    option_args = opt[1:]
                    option_instance = option_class(*option_args)
                elif isinstance(opt, Opt):
                    option_instance = opt
                else:
                    log.error(f"Option not compatible: {opt}")
                    return
                opts_dict[option_instance.name] = option_instance
            self._module_singleton.store_option(component, opts_dict)

    
    def update(self, key, value):
        self._module_singleton.update_option(key, value)

    
    def remove(self, name):
        self._module_singleton.delete_option(name)


    def reset_options(self):
        self._module_singleton.delete_options()


    def get(self, name):
        return self._module_singleton.get_option(name)
    

    def get_all_options(self):
        return self._module_singleton.get_options()


option_state = Options()