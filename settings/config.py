import os
import ruamel.yaml
import shutil
import settings.utils as utils
import sys

from globals import RULE_PATH, MODULE_PATH
from ruamel.yaml import YAML
from settings.scan import run_engine


def init_config():
    code_rules_path = RULE_PATH + "/code-analysis"
    for rule in os.listdir(code_rules_path):
        rule_path = os.path.join(code_rules_path, rule)
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


def post_decompile(db):
    target_ids = list(db)
    codebases = list()
    for id in target_ids:
        path = db[id]["path"]
        manifest = utils.get_manifest_file(path)
        codebase = utils.get_codebase_path(path)
        shutil.copy(manifest, codebase)
        codebases.append(codebase)
    _ = run_engine(codebases, "mod", True)


def extend_search_path(module_name):
    module_dirname = os.path.dirname(module_name)
    module_location = [os.path.join(MODULE_PATH, module_dirname)]
    sys.path.extend(module_location)


def reset():
    pass