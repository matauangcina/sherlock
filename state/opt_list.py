from state.opt import Opt


class OptList(Opt):

    def __init__(self, name, attr=[]):
        super().__init__(name, attr)
    

    def cast(self, value):
        arr = list()
        if value == "":
            return value
        pair = value.split(";")
        for p in pair:
            val = p.split(",")
            if len(val) == 2:
                extra = [val[0], val[1]]
            else:
                extra = [val[0]]
            arr.append(extra)
        return arr
    
    
    def is_valid(self, value="", is_empty=True):
        if is_empty and self.empty_required_value(value):
            return False
        return super().is_valid(value, is_empty=False)