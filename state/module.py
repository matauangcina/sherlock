from settings.logger import get_logger
from state.module_singleton import ModuleSingleton


log = get_logger(__name__)


class Module:

    def __init__(self):
        self._filtered = None
        self._module_singleton = ModuleSingleton()


    @property
    def filtered(self):
        return self._filtered
    

    @filtered.setter
    def filtered(self, filtered):
        self._filtered = filtered


    def get(self, key):
        return self._module_singleton.get_module(key)
    
    
    def store(self, key, value):
        self._module_singleton.store_module(key, value)


module_state = Module()