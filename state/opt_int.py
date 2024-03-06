import re

from state.opt import Opt


class OptInt(Opt):

    def __init__(self, name, attr=[]):
        super().__init__(name, attr)
    
    def type(self):
        return "integer"
    
    def is_valid(self, value="", is_empty=True):
        if is_empty and self.empty_required_value(value):
            return False
        if value != "" and not re.match(r'^-*\d+$', str(value)):
            return False
        return super().is_valid(value, is_empty=False)