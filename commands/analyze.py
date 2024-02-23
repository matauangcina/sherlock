import os
import settings.utils as utils

from globals import TARGET_PATH
from output.analyze import display_scan_result
from settings.logger import get_logger
from settings.scan import run_engine


log = get_logger(__name__)


def is_target_specified(args):
    return len(args) > 0 and "--target" in args


def should_output_json(args):
    return len(args) > 0 and "--json" in args


def should_write_output(args):
    return len(args) > 0 and "--output" in args


def write_output(args, summary):
    dest = args[args.index("--output") + 1]
    log.debug(f"Writing scan summary to: {dest}")
    with open(dest, "w") as file:
        display_scan_result(summary, should_output_json(args), file)
    log.info(f"Scan summary wrote to: {dest}\n")


def get_targets(args):
    target_ids = os.listdir(TARGET_PATH)
    if is_target_specified(args):
        specified_targets = args[args.index("--target") + 1].split(",")
        target_ids = [target for target in specified_targets]
    targets = list()
    for target_id in target_ids:
        target_path = utils.get_target_path_by_id(target_id)
        if target_path is not None:
            targets.append(target_path)
            continue
        log.warning(f"Target invalid, skipping: {target_id}.")
    return targets


def get_manifests(targets):
    manifests = list()
    for target in targets:
        manifest = utils.get_manifest_file(target)
        if utils.is_path_exists(manifest):
            manifests.append(manifest)
            continue
        log.warning(f"Manifest file not found, skipping: {target.split('/')[-1]}")
    return manifests


def get_codebases(targets):
    codebases = list()
    for target in targets:
        codebase = utils.get_codebase_path(target)
        if utils.is_path_exists(codebase):
            codebases.append(codebase)
            continue
        log.warning(f"Target codebase not found, skipping: {target.split('/')[-1]}")
    return codebases


def get_scan_summary(target_paths, rules, target_ids):
    summary = {
        "targets": dict()
    }
    target_summary = summary["targets"]
    for i,path in enumerate(target_paths):
        manifest = os.path.join(path, "AndroidManifest.xml")
        if "AndroidManifest.xml" in path:
            manifest = path
        package = utils.get_app_details(manifest)["package"]
        id = target_ids[i].split("/")[-1]
        if id not in target_summary:
            target_summary[id] = {
                "package": package,
                "path": path
            }
        for rule in rules:
            result = run_engine([path], rule)
            if result is not None:
                if rule not in target_summary[id]:
                    target_summary[id][rule] = result
            else:
                return None
    return summary


def manifest(args=None):
    print("")
    if not utils.is_path_exists(TARGET_PATH):
        log.error("Workspace is empty. Please decompile target apps to workspace.\n")
        return
    targets = get_targets(args)
    manifests = get_manifests(targets)
    if len(manifests) == 0:
        log.error("No manifest files can be found. Terminating..\n")
        return
    log.debug("Initiating engine..")
    summary = get_scan_summary(manifests, ["manifest"], targets)
    if summary is None:
        log.info("No vulnerabilities discovered!\n")
        return
    log.info("Scan completed.")
    if should_write_output(args):
        write_output(args, summary)
        return
    log.debug("Displaying scan result..\n")
    display_scan_result(summary, should_output_json(args))


def codebase(args=None):
    print("")
    if not utils.is_path_exists(TARGET_PATH):
        log.error("Workspace is empty. Please decompile target apps to workspace.\n")
        return
    targets = get_targets(args)
    codebases = get_codebases(targets)
    if len(codebases) == 0:
        log.error("No target codebase can be found. Terminating..\n")
        return
    log.debug("Initiating engine..")
    summary = get_scan_summary(codebases, ["code"], targets)
    if summary is None:
        log.info("No vulnerabilities discovered!\n")
        return
    log.info("Scan completed.")
    if should_write_output(args):
        write_output(args, summary)
        return
    log.debug("Displaying scan result..\n")
    display_scan_result(summary, should_output_json(args))


def all(args=None):
    print("")
    if not utils.is_path_exists(TARGET_PATH):
        log.error("Workspace is empty. Please decompile target apps to workspace.\n")
        return
    targets = get_targets(args)
    codebases = get_codebases(targets)
    if len(codebases) == 0:
        log.error("No target codebase can be found. Terminating..\n")
        return
    log.debug("Initiating engine..")
    summary = get_scan_summary(codebases, ["manifest", "code"], targets)
    if summary is None:
        log.info("No vulnerabilities discovered!\n")
        return
    log.info("Scan completed.")
    if should_write_output(args):
        write_output(args, summary)
        return
    log.debug("Displaying scan result..\n")
    display_scan_result(summary, should_output_json(args))