from state.opt import Opt


class OptEnum(Opt):

    def __init__(self, name, attr=[]):
        super().__init__(name, attr)

    def type(self):
        return "enum"
    
    @property
    def desc(self):
        allowed = ""
        if len(self._enums) != 0:
            for i,enum in enumerate(self._enums):
                if i == len(self._enums) - 1:
                    allowed += str(enum)
                else:
                    allowed += str(enum) + ", "
        return f"{self._desc} (Accepted: {allowed})"
    
    def is_valid(self, value="", is_empty=True):
        if super().is_valid(value, is_empty) and value != "":
            return value in self._enums
        return False