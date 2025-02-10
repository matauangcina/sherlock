from state.opt import Opt


class OptEnum(Opt):

    def __init__(self, name, attr=[]):
        super().__init__(name, attr)


    def cast(self, value):
        for enum in self._enums:
            if value == str(enum):
                if isinstance(enum, bool):
                    return value.lower() in ["true"]
                elif isinstance(enum, int):
                    return int(value)
                return value
    

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
        if super().is_valid(value, is_empty):
            return str(value) in str(self._enums)
        return False