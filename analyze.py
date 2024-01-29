import utils

from get import get_app_details_from_manifest
from globals import (
    INVALID_COMMAND, 
    TARGET_PATH
)
from logger import init_logger
from scan import run_engine

log = init_logger(__name__)

def get_target_list(args):
    target_list = list()
    for arg in args:
        target_path = list()
        target = TARGET_PATH + "/" + arg
        if utils.is_path_exists(target):
            package = get_app_details_from_manifest(target + "/resources/AndroidManifest.xml")["package"].replace(".", "/")
            codebase = target + "/sources/" + package
            if utils.is_path_exists(codebase):
                target_path.append(codebase)
                target_list.append(target_path)
            else:
                continue
        else:
            continue
    return target_list

def get_codebase_list(paths):
    codebase_list = list()
    for path in paths:
        target = list()
        if utils.is_path_exists(path):
            target.append(path)
            codebase_list.append(target)
        else:
            codebase_list = list()
            break
    return codebase_list

def get_rules_list(args, valid_rules):
    rules = list()
    for arg in args:
        if arg in valid_rules:
            rules.append(arg)
        else:
            rules = list()
            break
    return rules

def get_summary(targets, rules):
    summary = {
        "targets": dict()
    }
    target_summary = summary["targets"]
    for target in targets:
        focus = target[0]
        if focus not in target_summary:
            target_summary[focus] = {}
        for rule in rules:
            result = run_engine(target, rule)
            if rule not in target_summary[focus]:
                target_summary[focus][rule] = result
    return summary

def analyze(args):
    print("")
    if len(args) > 0 and len(args) <= 3:
        all_valid_rules = ["manifest", "code"]
        summary = dict()
        if len(args) == 1 and args[0] == "target":
            # analyze target
            codebase = utils.get_codebase_path()
            targets = get_codebase_list(codebase)
            if len(targets) == 0:
                log.error(INVALID_COMMAND)
            else:
                summary = get_summary(targets, all_valid_rules)
        else:
            if args[0] == "target":
                if len(args) == 2:
                    # analyze target [manifest,code]
                    # analyze target [target,target]
                    second_args = args[1].split(",")
                    targets = get_target_list(second_args)
                    if len(targets) == 0:
                        # analyze target [manifest,code]
                        rules = get_rules_list(second_args, all_valid_rules)
                        if len(rules) == 0:
                            log.error(INVALID_COMMAND)
                        else:
                            codebase = utils.get_codebase_path()
                            all_targets = get_codebase_list(codebase)
                            if len(all_targets) == 0:
                                log.error(INVALID_COMMAND)
                            else:
                                summary = get_summary(all_targets, rules)
    
                    else:
                        # analyze target [target,target]
                        summary = get_summary(targets, all_valid_rules)
                else:
                    # analyze target [target,target] [manifest,code]
                    second_args = args[1].split(",")
                    targets = get_target_list(second_args)
                    if len(targets) != 0:
                        third_args = args[2].split(",")
                        rules = get_rules_list(third_args, all_valid_rules)
                        if len(rules) == 0:
                            log.error(INVALID_COMMAND)
                        else:
                            summary = get_summary(targets, rules)
                    else:
                        log.error(INVALID_COMMAND)
            else:
                log.error(INVALID_COMMAND)
        if len(summary) != 0:
            print(summary)
    else:
        log.error(INVALID_COMMAND)

# analyze(["target"])
# analyze(["target", "base,InsecureShop,test,injuredandroid", "manifest,code"])
# analyze(["target", "InsecureShop,ulala,base"])
# analyze(["target", "InsecureShop,base"])
# analyze(["target", "manifest,blabla,code"])
# analyze(["target", "code,manifest"])