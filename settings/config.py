import os
import ruamel.yaml
import shutil
import settings.utils as utils
import sys

from globals import RULE_PATH, MODULE_PATH, POC_PATH
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
            if rule_id.get("join") is not None:
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


def reset():
    manifest = utils.get_poc_manifest()
    main = utils.get_poc_main()
    layout = utils.get_poc_layout()
    old_layout = layout.replace("activity_main", "activity_main_old")
    for root, _, files in os.walk(POC_PATH["code"]):
        for file in files:
            path = os.path.join(root, file)
            if path == main + ".old" or path == main:
                continue
            os.remove(path)
    if utils.is_path_exists(manifest) and utils.is_path_exists(manifest + ".old"):
        os.remove(manifest)
        os.rename(manifest + ".old", manifest)
    if utils.is_path_exists(main) and utils.is_path_exists(main + ".old"):
        os.remove(main)
        os.rename(main + ".old", main)
    if utils.is_path_exists(layout) and utils.is_path_exists(old_layout):
        os.remove(layout)
        os.rename(old_layout, old_layout.replace("activity_main_old", "activity_main"))