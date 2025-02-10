class Opt:
    def __init__(
            self,
            name,
            attr=[],
            required=False,
            desc="",
            default="",
            enums=[]
        ):
        self._name = name
        self._attr = attr
        self._required = attr[0] if attr and attr[0] is not None else required
        self._desc = attr[1] if len(attr) > 1 else desc
        self._default = attr[2] if len(attr) > 2 else default
        self._enums = attr[3] if len(attr) > 3 else enums


    @property
    def name(self):
        return self._name
    

    @property
    def attr(self):
        return self._attr


    @property
    def required(self):
        return self._required


    @property
    def desc(self):
        return self._desc


    @property
    def default(self):
        return self._default
    

    @property
    def enums(self):
        return self._enums


    @name.setter
    def name(self, name):
        self._name = name


    @attr.setter
    def attr(self, attr):
        self._attr = attr


    @required.setter
    def required(self, required):
        self._required = required


    @desc.setter
    def desc(self, desc):
        self._desc = desc


    @default.setter
    def default(self, default):
        self._default = default
    

    @enums.setter
    def enums(self, enums):
        self._enums = enums


    def is_required(self):
        return self._required


    def is_valid(self, value="", is_empty=True):
        if is_empty and self.is_required():
            if value == "":
                return False
        return True


    def empty_required_value(self, value):
        return self.is_required() and value == ""