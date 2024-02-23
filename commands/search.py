import json

from output.search import display_modules
from settings.logger import get_logger


log = get_logger(__name__)


def get_modules_info():
    with open("database/modules.json", "r") as file:
        modules = json.load(file)
    module_names = list(modules)
    summary = list()
    for i,id in enumerate(module_names):
        data = dict()
        data["idx"] = str(i+1)
        data["id"] = id
        data["name"] = modules[id]["name"]
        data["category"] = modules[id]["category"]
        data["type"] = modules[id]["type"]
        data["status"] = modules[id]["status"]
        data["desc"] = modules[id]["description"]
        data["rule_id"] = modules[id]["rule_id"]
        summary.append(data)
    return summary


def filter_modules(keyword):
    modules = get_modules_info()
    if keyword == "*":
        return modules
    filtered_modules = list()
    for module in modules:
        if keyword in module["name"]:
            filtered_modules.append(module)
    return filtered_modules


def module(args=None):
    print("")
    modules = filter_modules(args[0])
    if len(modules) == 0:
        log.error("No modules found. Terminating..\n")
        return
    log.debug("Displaying modules..\n")
    display_modules(modules)