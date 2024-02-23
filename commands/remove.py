import settings.utils as utils
import shutil

from globals import TARGET_PATH
from settings.logger import get_logger


log = get_logger(__name__)


def is_target_specified(args):
    return len(args) > 0 and "--target" in args


def target(args=None):
    print("")
    if not utils.is_path_exists(TARGET_PATH):
        log.error("Workspace is empty. Terminating..\n")
        return
    if is_target_specified(args):
        specified_targets = args[args.index("--target") + 1].split(",")
        target_ids = [target for target in specified_targets]
        targets = list()
        for target_id in target_ids:
            target_path = utils.get_target_path_by_id(target_id)
            if target_path is not None:
                targets.append(target_path)
                continue
            log.warning(f"Target invalid, skipping: {target_id}.")
        if len(targets) == 0:
            log.error("No targets found. Terminating..\n")
            return
        for target in targets:
            log.debug(f"Removing target: {target.split('/')[-1]}")
            shutil.rmtree(target)
            log.info(f"Target removed: {target.split('/')[-1]}")
        print("")
    else:
        log.debug("Removing workspace..")
        shutil.rmtree(TARGET_PATH)
        log.info("Workspace removed\n")