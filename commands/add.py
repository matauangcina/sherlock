import os
import settings.utils as utils

from settings.config import post_process
from settings.logger import get_logger
from settings.target_info import get_target_db, add_target_to_db


log = get_logger(__name__)


def target(args):
    print("")
    targets = get_target_db()
    valid_path = list()
    for arg in args:
        if utils.is_path_exists(arg):
            log.info(f"Target found: '{arg}'")
            valid_path.append(arg)
        else:
            log.error(f"Path not found, skipping: '{arg}'")
    if len(valid_path) == 0:
        log.error("No valid path found.\n")
        return
    log.debug("Post processing..")
    for path in valid_path:
        add_target_to_db(targets, path)
        post_process(targets, os.path.basename(path))
    log.info(f"Target(s) added to workspace.\n")