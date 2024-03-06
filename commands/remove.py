from settings.logger import get_logger
from settings.target_info import get_target_db, update_target_db


log = get_logger(__name__)


def is_target_specified(args):
    return len(args) > 0 and "--target" in args


def target(args=None):
    targets = get_target_db()
    if targets is None:
        log.error("Target file not found.")
        return
    ids = list(targets)
    if is_target_specified(args):
        specified = args[args.index("--target") + 1].split(",")
        valid_ids = list()
        for id in specified:
            target_id = id
            if id.isdigit():
                target_id = int(id)
                if target_id < 1 or target_id > len(ids):
                    log.error("Invalid target index.")
                    return
                valid_ids.append(ids[target_id - 1])
            else:
                if target_id in ids:
                    valid_ids.append(target_id)
        ids = valid_ids
    if len(ids) == 0:
        log.error("No targets found.")
        return
    for id in ids:
        log.debug(f"Removing target: {id}")
        del targets[id]
        log.info(f"Target removed")
    update_target_db(targets)