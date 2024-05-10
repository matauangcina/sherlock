import json
import os

from globals import DB_PATH
from state.module import module_state


def get_modules_info():
    with open(os.path.join(DB_PATH, "modules.json"), "r") as file:
        modules = json.load(file)
    module_ids = list(modules)
    summary = list()
    for id in module_ids:
        data = dict()
        data["id"] = id
        data["name"] = modules[id]["name"]
        data["platform"] = modules[id]["platform"]
        data["category"] = modules[id]["category"]
        data["status"] = modules[id]["status"]
        data["path"] = modules[id]["path"]
        data["desc"] = modules[id]["description"]
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


def store_module_info(args):
    modules_info = get_modules_info()
    for module_info in modules_info:
        if args == module_info["name"]:
            for k,v in module_info.items():
                module_state.store(k, v)
            break