import json

from semgrep.constants import OutputFormat
from semgrep.output import OutputHandler
from semgrep.output import OutputSettings
from semgrep.run_scan import run_scan

def call_engine(target_paths, rules, fix, **kwargs):
    """
        Call semgrep engine
    """
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
        **kwargs
    )
    output_handler.rule_matches = [
        match
        for matches_of_one_rule in rule_matches.values()
        for match in matches_of_one_rule
    ]
    return json.loads(output_handler._build_output())