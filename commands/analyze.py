import os
import settings.utils as utils

from output.analyze import display_scan_result
from settings.logger import get_logger
from settings.scan import run_engine
from settings.target_info import get_target_db, get_app_details


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


def get_target_paths(args):
    targets = get_target_db()
    if targets is None:
        log.error("Target file not found.\n")
        return
    ids = list(targets)
    if is_target_specified(args):
        is_range = False
        if "-" in args[args.index("--target") + 1]:
            specified = args[args.index("--target") + 1].split("-")
            if specified[0].isdigit() and specified[1].isdigit():
                is_range = True
        valid_ids = list()
        if is_range:
            start = int(specified[0])
            end = int(specified[1]) + 1
            for i in range(start, end):
                valid_ids.append(ids[i-1])
        else:
            specified = args[args.index("--target") + 1].split(",")
            for id in specified:
                target_id = id
                if id.isdigit():
                    target_id = int(id)
                    if target_id < 1 or target_id > len(ids):
                        log.error("Invalid target index.\n")
                        return
                    valid_ids.append(ids[target_id - 1])
                else:
                    if target_id in ids:
                        valid_ids.append(target_id)
        ids = valid_ids
    if len(ids) == 0:
        return None
    paths = list()
    for id in ids:
        target_path = targets[id]["path"]
        if target_path is not None:
            paths.append(target_path)
            continue
        log.warning(f"Target invalid, skipping: {id}.")
    return paths


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
        package = get_app_details(manifest)["package"]
        id = target_ids[i].split("/")[-1]
        log.debug(f"Scanning: '{id} ({package})'")
        for rule in rules:
            result = run_engine([path], rule)
            if result is not None:
                if id not in target_summary:
                    target_summary[id] = {
                        "package": package,
                        "path": path
                    }
                if rule not in target_summary[id]:
                    target_summary[id][rule] = result
    return summary if len(list(target_summary)) != 0 else None


def manifest(args=None):
    print("")
    targets = get_target_paths(args)
    if targets is None:
        log.error("No targets found.\n")
        return
    manifests = get_manifests(targets)
    if len(manifests) == 0:
        log.error("No manifest files can be found.\n")
        return
    log.debug("Initiating engine..")
    summary = get_scan_summary(manifests, ["manifest"], targets)
    log.info("Scan completed.")
    if summary is None:
        log.info("No vulnerabilities discovered for all targets!\n")
        return
    if should_write_output(args):
        write_output(args, summary)
        return
    log.debug("Displaying scan result..\n")
    display_scan_result(summary, should_output_json(args))


def codebase(args=None):
    print("")
    targets = get_target_paths(args)
    if targets is None:
        log.error("No targets found.")
        return
    codebases = get_codebases(targets)
    if len(codebases) == 0:
        log.error("No target codebase can be found.")
        return
    log.debug("Initiating engine..")
    summary = get_scan_summary(codebases, ["code"], targets)
    log.info("Scan completed.")
    if summary is None:
        log.info("No vulnerabilities discovered for all targets!\n")
        return
    if should_write_output(args):
        write_output(args, summary)
        return
    log.debug("Displaying scan result..\n")
    display_scan_result(summary, should_output_json(args))


def all(args=None):
    print("")
    targets = get_target_paths(args)
    if targets is None:
        log.error("No targets found.\n")
        return
    codebases = get_codebases(targets)
    if len(codebases) == 0:
        log.error("No target codebase can be found.\n")
        return
    log.debug("Initiating engine..")
    summary = get_scan_summary(codebases, ["manifest", "code"], targets)
    log.info("Scan completed.")
    if summary is None:
        log.info("No vulnerabilities discovered for all targets!\n")
        return
    if should_write_output(args):
        write_output(args, summary)
        return
    log.debug("Displaying scan result..\n")
    display_scan_result(summary, should_output_json(args))