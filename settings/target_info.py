import json
import os
import settings.utils as utils

from defusedxml.minidom import parse
from globals import DB_PATH


def get_target_db():
    target_file = os.path.join(DB_PATH, "targets.json")
    if utils.is_path_exists(target_file):
        with open(target_file, "r") as f:
            return json.load(f)
    return None


def update_target_db(target_dict):
    target_file = os.path.join(DB_PATH, "targets.json")
    if utils.is_path_exists(target_file):
        with open(target_file, "w") as f:
            json.dump(target_dict, f, indent=4, sort_keys=True)
    else:
        return


def get_app_details(manifest_file):
    ns = "android"
    dom = parse(manifest_file)
    manifest = dom.getElementsByTagName("manifest")
    sdk = dom.getElementsByTagName("uses-sdk")
    package_name = manifest[0].getAttribute("package")
    app_version = manifest[0].getAttribute(f"{ns}:versionName")
    min_sdk_version = sdk[0].getAttribute(f"{ns}:minSdkVersion")
    target_sdk_version = sdk[0].getAttribute(f"{ns}:targetSdkVersion")
    return {
        "package": package_name,
        "version": app_version,
        "min_sdk": min_sdk_version,
        "target_sdk": target_sdk_version
    }


def get_app_name(strings_file):
    if strings_file is None:
        return "Not Found"
    dom = parse(strings_file)
    strings = dom.getElementsByTagName("string")
    for string in strings:
        if string.getAttribute("name") == "app_name":
            app_name = string.firstChild.nodeValue
            return app_name
    return "Not found"


def get_app_components(manifest):
    ns = "android"
    dom = parse(manifest)
    component = {
        "act": list(),
        "prov": list(),
        "recv": list(),
        "serv": list()
    }
    activities = dom.getElementsByTagName("activity")
    for activity in activities:
        name = activity.getAttribute(f"{ns}:name")
        is_exported = activity.getAttribute(f"{ns}:exported")
        intent_filters = activity.getElementsByTagName("intent-filter")
        if intent_filters:
            f = list()
            for filter in intent_filters:
                action = filter.getElementsByTagName("action")
                action_name = action[0].getAttribute(f"{ns}:name")
                data = filter.getElementsByTagName("data")
                if data:
                    scheme = data[0].getAttribute(f"{ns}:scheme")
                    host = data[0].getAttribute(f"{ns}:host")
                    path = data[0].getAttribute(f"{ns}:path")
                f.append({
                    "action": action_name if action else None,
                    "deeplink": f"{scheme}://{host}/{path}" if data and scheme else None,
                })
        if intent_filters and not is_exported:
            is_exported = "true"
        sum = {
            "name": name,
            "exported": is_exported if is_exported else "false",
            "intent_filters": f if intent_filters else None
        }
        component["act"].append(sum)
    providers = dom.getElementsByTagName("provider")
    for provider in providers:
        name = provider.getAttribute(f"{ns}:name")
        is_exported = provider.getAttribute(f"{ns}:exported")
        authorities = provider.getAttribute(f"{ns}:authorities")
        permission = provider.getAttribute(f"{ns}:permission")
        read_permission = provider.getAttribute(f"{ns}:readPermission")
        write_permission = provider.getAttribute(f"{ns}:writePermission")
        grant_uri_permission = provider.getAttribute(f"{ns}:grantUriPermissions")
        sum = {
            "name": name,
            "exported": is_exported if is_exported else "false",
            "authorities": authorities,
            "permission": permission if permission else None,
            "read_permission": read_permission if read_permission else None,
            "write_permission": write_permission if write_permission else None,
            "grant_uri_permission": grant_uri_permission if grant_uri_permission else None
        }
        component["prov"].append(sum)
    receivers = dom.getElementsByTagName("receiver")
    for receiver in receivers:
        name = receiver.getAttribute(f"{ns}:name")
        is_exported = receiver.getAttribute(f"{ns}:exported")
        permission = receiver.getAttribute(f"{ns}:permission")
        intent_filters = receiver.getElementsByTagName("intent-filter")
        if intent_filters:
            f = list()
            for filter in intent_filters:
                action = filter.getElementsByTagName("action")
                action_name = action[0].getAttribute(f"{ns}:name")
                f.append(action_name if action else None)
        if intent_filters and not is_exported:
            is_exported = "true"
        sum = {
            "name": name,
            "exported": is_exported,
            "permission": permission if permission else None,
            "action": f if intent_filters else None
        }
        component["recv"].append(sum)
    services = dom.getElementsByTagName("service")
    for service in services:
        name = service.getAttribute(f"{ns}:name")
        is_exported = service.getAttribute(f"{ns}:exported")
        permission = service.getAttribute(f"{ns}:permission")
        intent_filters = service.getElementsByTagName("intent-filter")
        if intent_filters:
            f = list()
            for filter in intent_filters:
                action = filter.getElementsByTagName("action")
                action_name = action[0].getAttribute(f"{ns}:name")
                f.append(action_name if action else None)
        if intent_filters and not is_exported:
            is_exported = "true"
        sum = {
            "name": name,
            "exported": is_exported,
            "permission": permission if permission else None,
            "action": f if intent_filters else None
        }
        component["serv"].append(sum)
    return component