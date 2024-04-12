import json
import settings.utils as utils

from globals import RULE_PATH

from semgrep.constants import OutputFormat
from semgrep.output import OutputHandler
from semgrep.output import OutputSettings
from semgrep.run_scan import run_scan

from settings.logger import get_logger


log = get_logger(__name__)


def get_rules_path_by_action(action):
    match action:
        case "mod":
            return RULE_PATH + "/mods/"
        case "manifest":
            return RULE_PATH + "/manifest-analysis/"
        case "code":
            return RULE_PATH + "/code-analysis/"
        case _:
            return None


def run_engine(target, action, fix=False):
    rules = get_rules_path_by_action(action)
    if rules != None and utils.is_path_exists(rules):
        findings = init_engine(target, rules, fix)
        if len(findings["results"]) == 0:
            return None
        return format_scan(findings)
    else:
        log.error(f"Rules not found: {rules}\n")
        return None
    

def init_engine(target_paths, rules, fix, **kwargs):
    output_settings = OutputSettings(output_format=OutputFormat.JSON)
    output_handler = OutputHandler(output_settings)
    (
        rule_matches,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _,
        _
    ) = run_scan(
        output_handler=output_handler,
        target=[path for path in target_paths],
        pattern=None,
        lang=None,
        configs=[rules],
        autofix=fix,
        timeout=10,
        **kwargs
    )
    output_handler.rule_matches = [
        match
        for matches_of_one_rule in rule_matches.values()
        for match in matches_of_one_rule
    ]
    return json.loads(output_handler._build_output())


def format_scan(findings):
    summary = {
        "findings": dict(),
        "errors": list()
    }
    findings_summary = summary["findings"]
    for finding in findings["results"]:
        dataflow = False
        rule_id = finding["check_id"].split(".")[-1]
        category = "-".join(rule_id.split("-")[0:-1])
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
        metadata = finding["extra"]["metadata"]
        rule = {
            "rule_id": rule_id,
            "message": message,
            "location": location
        }
        if dataflow:
            rule.update({
                "source": taint_source
            })
        if category not in findings_summary:
            findings_summary[category] = {
                "severity": severity,
                "metadata": metadata,
                "rules": [rule]
            }
        else:
            findings_summary[category]["rules"].append(rule)
    errors = findings["errors"]
    if errors:
        summary["errors"] = errors
    return summary