from settings.logger import get_logger
from state.options import option_state
from state.opt_enum import OptEnum
from state.opt_str import OptStr


log = get_logger(__name__)


class SherlockModule:

    def __init__(self):
        option_state.add_options([
            OptStr("CONTENT_PROVIDER", [True, "Content provider URI", ""]),
            OptStr("PACKAGE_NAME", [True, "Target package name", ""]),
            OptStr("CLASS_NAME", [True, "Target class name", ""]),
            OptStr("INTERCEPT_ACTION", [True, "Action name to intercept", ""]),
            OptEnum("RESULT_CODE", [True, "Result code returned to the caller", -1, [-1, 0, 1, "RESULT_OK", "RESULT_FIRST_USER", "RESULT_CANCELED"]])
        ])

    def use(self):
        return

    def manifest():
        pass

    def activity():
        pass

    def execute(self):
        print("Access to arbitrary base module")