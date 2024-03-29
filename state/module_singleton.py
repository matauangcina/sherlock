from settings.logger import get_logger


log = get_logger(__name__)


class ModuleSingleton:

    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(ModuleSingleton, cls).__new__(cls)
            cls._instance._modules = dict()
            cls._instance._options = dict()
        return cls._instance

    def store_module(self, key, value):
        self._modules[key] = value

    def store_option(self, key, value):
        if key in self._options:
            opt = self._options[key]
            if not opt.is_valid(value.default, is_empty=False):
                log.error(f"Input: '{value.default}' is invalid for option: {key}")
                return
        self._options[key] = value
    
    def update_option(self, key, value):
        self.store_option(key, value)

    def get_module(self, key):
        return self._modules.get(key)
    
    def get_option(self, key):
        return self._options.get(key)
    
    def get_options(self):
        return self._options
    
    def delete_option(self, key):
        del self._options[key]

    def delete_options(self):
        self._options.clear()