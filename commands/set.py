from settings.logger import get_logger
from state.options import option_state


log = get_logger(__name__)


def option_value(args):
    opts = option_state.get_all_options()
    if args[0].upper() not in opts.keys():
        log.error(f"Option invalid: {args[0]}")
        return
    for k,v in opts.items():
        if args[0].upper() == k:
            if v.is_valid(args[1], is_empty=False):
                v.default = args[1]
                option_state.update(k, v)
                break
            log.error(f"Input: '{args[1]}' is invalid for option: {k}")
            return