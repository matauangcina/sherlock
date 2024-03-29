from state.opt import Opt


class OptStr(Opt):

    def __init__(self, name, attr=[]):
        super().__init__(name, attr)
    
    def cast(self, value):
        return value
    
    def is_valid(self, value="", is_empty=True):
        if is_empty and self.empty_required_value(value):
            return False
        return super().is_valid(value, is_empty=False)