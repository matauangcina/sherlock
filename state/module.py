class ModuleState(object):

    def __init__(self):
        self.category = None
        self.module_name = None

    def set_module_name(self, module_name):
        self.module_name = module_name

    def get_module_name(self):
        return self.module_name
    
    def set_category(self, category):
        self.category = category
    
    def get_category(self):
        return self.category


module_state = ModuleState()