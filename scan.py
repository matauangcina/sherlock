import utils

from engine import call_engine
from globals import RULES_PATH
from logger import get_logger

log = get_logger(__name__)

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
        # print(findings)
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
            "component": finding["path"],
            "column": {
                "start": finding["start"]["col"],
                "end": finding["end"]["col"]
            },
            "line": {
                "start": finding["start"]["line"],
                "end": finding["end"]["line"]
            },
            "snippet": finding["extra"]["lines"]
        }
        if finding["extra"].get("dataflow_trace") is not None:
            dataflow = True
            trace = finding["extra"]["dataflow_trace"]
            taint_source = {
                "component": trace["taint_source"][-1][0]["path"],
                "column": {
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
        rule = {
            "rule_id": category,
            "location": location
        }
        # metavars = finding["extra"]["metavars"]
        # metadata = {
        #     "class": metavars["$CLASSNAME"]["abstract_content"],
        #     "result_code": metavars["$CODE"]["abstract_content"]
        # }
        if dataflow:
            rule.update({
                "source": taint_source
            })
        if rule_id not in findings_summary:
            findings_summary[rule_id] = {
                "message": message,
                "severity": severity,
                "rules": [rule]
            }
        else:
            findings_summary[rule_id]["rules"].append(rule)
    errors = findings["errors"]
    if errors:
        summary["errors"] = errors
    return summary

# print(run_engine(["/home/finechina/Project/sherlock/target/base/sources/com/test/test"], "code"))