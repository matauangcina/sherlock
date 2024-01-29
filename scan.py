import utils

from engine import call_engine
from globals import RULES_PATH
from logger import init_logger

log = init_logger(__name__)

def get_rules_path_by_action(action):
    match action:
        case "mod":
            return RULES_PATH + "/mods/"
        case "manifest":
            return RULES_PATH + "/manifest-analysis/"
        case "code":
            return RULES_PATH + "/code-analysis/"
        case _:
            return None

def run_engine(target, action, fix=False):
    rules = get_rules_path_by_action(action)
    if rules != None and utils.is_path_exists(rules):
        findings = call_engine(target, rules, fix)
        return get_summary(findings)
    else:
        log.error(f"Rules not found: {rules}")
        return None
    
def get_summary(findings):
    summary = {
        "findings": dict(),
        "errors": list()
    }
    findings_summary = summary["findings"]
    for finding in findings["results"]:
        dataflow = False
        category = finding["check_id"].split(".")[-1]
        check_id = category.split("-")[0:-1]
        rule_id = ""
        for i in range(len(check_id)):
            if i == len(check_id) - 1:
                rule_id += check_id[i]
            else:
                rule_id += check_id[i] + "-"
        location = {
            "component": finding["path"].split("/")[-1],
            "position": {
                "start": finding["start"]["col"],
                "end": finding["end"]["col"]
            },
            "line": {
                "start": finding["start"]["col"],
                "end": finding["end"]["col"]
            },
            "snippet": finding["extra"]["lines"]
        }
        if finding["extra"].get("dataflow_trace") is not None:
            dataflow = True
            trace = finding["extra"]["dataflow_trace"]
            taint_source = {
                "component": trace["taint_source"][-1][0]["path"].split("/")[-1],
                "position": {
                    "start": trace["taint_source"][-1][0]["start"]["col"],
                    "end": trace["taint_source"][-1][0]["end"]["col"]
                },
                "line": {
                    "start": trace["taint_source"][-1][0]["start"]["line"],
                    "end": trace["taint_source"][-1][0]["end"]["line"]
                },
                "source": trace["taint_source"][-1][-1]
            }
            location.update({
                "sink": trace["taint_sink"][-1][-1]
            })
        message = finding["extra"]["message"]
        severity = finding["extra"]["severity"]
        if rule_id not in findings_summary:
            findings_summary[rule_id] = {
                "message": message,
                "severity": severity
            }
        if category not in findings_summary[rule_id]:
            findings_summary[rule_id][category] = {
                "locations": [location]
            }
            if dataflow:
                findings_summary[rule_id][category].update({
                    "sources": [taint_source]
                })
        else:
            findings_summary[rule_id][category]["locations"].append(location)
            if dataflow:
                findings_summary[rule_id][category]["sources"].append(taint_source)
    errors = findings["errors"]
    if errors:
        summary["errors"] = errors
    return summary