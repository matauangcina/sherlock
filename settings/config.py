import os
import ruamel.yaml
import shutil

from globals import TARGET_PATH, RULE_PATH
from ruamel.yaml import YAML

from settings.utils import get_manifest_file, get_codebase_path
from settings.scan import run_engine

def init_config():
    code_rules_path = RULE_PATH + "/code-analysis"
    for rule in os.listdir(code_rules_path):
        rule_path = code_rules_path + "/" + rule
        yaml = YAML()
        with open(rule_path, "r") as file:
            yaml_data = yaml.load(file)
        for rule_id in yaml_data["rules"]:
            for ref in rule_id["join"]["refs"]:
                ref["rule"] = ruamel.yaml.scalarstring.SingleQuotedScalarString(
                    ref["rule"].replace("(( rules_path ))", RULE_PATH)
                )
        with open(rule_path, "w") as file:
            yaml.dump(yaml_data, file)


def post_decompile():
    target_ids = os.listdir(TARGET_PATH)
    codebases = list()
    for id in target_ids:
        target_path = os.path.join(TARGET_PATH, id)
        manifest = get_manifest_file(target_path)
        codebase = get_codebase_path(target_path)
        codebases.append(codebase)
        shutil.copy(manifest, codebase)
    _ = run_engine(codebases, "mod", True)