import os
import ruamel.yaml
import shutil
import utils

from ruamel.yaml import YAML

from globals import RULES_PATH

def init_config():
    code_rules_path = RULES_PATH + "/code-analysis"
    for rule in os.listdir(code_rules_path):
        rule_path = code_rules_path + "/" + rule
        yaml = YAML()
        with open(rule_path, "r") as file:
            yaml_data = yaml.load(file)
        for rule_id in yaml_data["rules"]:
            for ref in rule_id["join"]["refs"]:
                ref["rule"] = ruamel.yaml.scalarstring.SingleQuotedScalarString(
                    ref["rule"].replace("(( rules_path ))", RULES_PATH)
                )
        with open(rule_path, "w") as file:
            yaml.dump(yaml_data, file)

def manifest_post_process():
    manifest_files = utils.get_manifest()
    codebase = utils.get_codebase_path()
    for i, manifest in enumerate(manifest_files):
        if utils.is_path_exists(manifest):
            shutil.copy(manifest, codebase[i])