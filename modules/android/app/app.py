import os
import re
import settings.utils as utils
import shutil
import subprocess

from globals import ROOT_PATH, POC_PATH
from settings.logger import get_logger
from state.device import device_state
from state.options import option_state
from time import sleep


log = get_logger(__name__)


class App:

    def __init__(self):
        self._package = "sherlock.poc"
        self._manifest = utils.get_poc_manifest()
        self._main = utils.get_poc_main()
        self._layout = utils.get_poc_layout()


    def app_init(self):
        if self._manifest is not None and self._main is not None and self._layout is not None:
            manifest_old = self._manifest + ".old"
            main_old = self._main + ".old"
            layout_old = self._layout.replace("activity_main", "activity_main_old")
            if not utils.is_path_exists(manifest_old):
                shutil.copy(self._manifest, manifest_old)
            if not utils.is_path_exists(main_old):
                shutil.copy(self._main, main_old)
            if not utils.is_path_exists(layout_old):
                shutil.copy(self._layout, layout_old)


    def format_id(self, id, package):
        return id + "_" + package.replace(".", "_")


    def format_package_name(self, package):
        return package.title().replace(".", "")


    def format_activity_name(self, id):
        return id.title().replace("_", "")


    def activity_name(self, id, package):
        return self.format_activity_name(id) + self.format_package_name(package)


    def button_id(self, id, package):
        return self.format_id(id, package)


    def bind_button_id(self, id, package):
        return self.format_bind_button_id(self.button_id(id, package))
    

    def format_bind_button_id(self, id):
        formatted = ""
        for i, c in enumerate(id):
            if i > 0 and id[i-1] == "_":
                formatted += c.upper()
            elif c != "_":
                formatted += c
        return formatted


    def placeholder(self, ext="java", is_permission=False):
        if ext == "xml":
            if is_permission:
                return "<!-- (( permission )) -->"
            return "<!-- (( placeholder )) -->"
        return "// (( placeholder ))"


    def get_options_value(self):
        options = option_state.get_all_options()
        opts = dict()
        for k,v in options.items():
            opts[k] = v.default
        return opts


    def update_option_status(self, stat, opts):
        for key,val in stat.items():
            if key.upper() in opts.keys():
                is_required = opts[key.upper()].default
                pos = val.get("pos")
                neg = val.get("neg")
                if len(pos) != 0:
                    for p in pos:
                        k = p.upper()
                        v = opts.get(k)
                        if v:
                            v.required = is_required
                        option_state.update(k, v)
                if len(neg) != 0:
                    for n in neg:
                        k = n.upper()
                        v = opts.get(k)
                        if v:
                            v.required = not is_required
                        option_state.update(k, v)
            else:
                log.warning(f"Option not found, skipping: '{key.upper()}'")


    def print_option_template(self):
        opts = option_state.get_all_options()
        opt_str = "set"
        for key in opts.keys():
            opt_str += f' {key.lower()}='
        log.debug(f"Command: '{opt_str}'")


    def replace_placeholder(self, file, content):
        if content is None:
            return
        permission = False
        if file == "permission":
            file = self._manifest
            permission = True
        ext = os.path.basename(file).split(".")[-1]
        with open(file, "r") as f:
            file_content = f.read()
        if content.replace(self.placeholder(ext, permission), "") not in file_content:
            replace_placeholder = file_content.replace(self.placeholder(ext, permission), content)
            with open(file, "w") as f:
                f.write(replace_placeholder)


    def create_file(self, file):
        filename = os.path.join(POC_PATH["code"], file["name"])
        with open(filename, "w") as f:
            f.write(file["content"])


    def run_gradle(self):
        gradle = os.path.join(POC_PATH["root"], "gradlew")
        os.chdir(POC_PATH["root"])
        cmd = ["sh", gradle, "assembleDebug"]
        try:
            run_gradle = subprocess.check_output(cmd, stderr=subprocess.STDOUT, text=True).splitlines()
            for line in run_gradle:
                if re.match(r"^BUILD SUCCESSFUL.*$", line):
                    log.info("Build successful.")
                    break
        except Exception as e:
            log.error(f"Build failed: {e}")
            return False
        os.chdir(ROOT_PATH)
        return True


    def install_and_run_app(self):
        log.debug("Launching app to device..")
        apk = os.path.join(POC_PATH["apk"], "app-debug.apk")
        install_apk = utils.run_adb(device_state.device_id, ["install", apk]).splitlines()
        if install_apk is None:
            log.error(f"Failed to install app.")
            return False
        for line in install_apk:
            if line == "Success":
                log.info(f"App installed on device: '{device_state.device_id}'")
                break
        _ = utils.run_adb(device_state.device_id, ["am", "start", "-n", "sherlock.poc/.MainActivity", "-S"], shell=True)
        log.info("App launched.")
        return True


    def check_logcat(self):
        stat_dict = self.log_stat()
        log.debug("Init logcat..")
        cmd = ["logcat", "--clear"]
        _ = utils.run_adb(device_state.device_id, cmd)
        cmd.pop()
        ps_cmd = ["ps", "|", "grep", "sherlock.poc", "|", "awk", "'{print $2}'"]
        sleep(2)
        ps = utils.run_adb(device_state.device_id, ps_cmd, shell=True).split('\n')[0]
        sleep(2)
        cmd.extend(["|", "grep", ps])
        logcat = utils.run_adb(device_state.device_id, cmd, realtime=True)
        if logcat is None:
            log.error("Process failed, terminating..\n")
            return
        try:
            exception = list()
            succeed = False
            provider_data = ""
            for line in logcat.stdout:
                if succeed and not re.match(stat_dict["succeed"]["regex"], line):
                    logcat.terminate()
                    break
                if re.match(stat_dict["succeed"]["regex"], line):
                    succeed = True
                    match = re.search(stat_dict["succeed"]["data"], line)
                    if match:
                        data = re.search(stat_dict["succeed"]["data"], line).group()
                        provider_data += data.replace("BINGO!", "").replace(" ", "").replace(":", "")
                    continue
                for err in stat_dict["exception"]:
                    if re.match(err["regex"], line):
                        match = re.search(err["msg"], line)
                        if match:
                            msg = match.group()
                            if msg not in exception:
                                log.error(f"ERR: {msg}")
                                exception.append(msg)
                        break
            logcat.wait()
            if succeed:
                log.info(f"BINGO: '{provider_data}'\n")
        except KeyboardInterrupt:
            print("")
            log.error("Terminating logcat..\n")
            logcat.terminate()

    
    def log_stat(self):
        return {
            "exception": [
                {
                    "regex": r"^.*java\.lang\.SecurityException:.*$",
                    "msg": r"java\.lang\.SecurityException:.*"
                },
                {
                    "regex": r"^.*java\.lang\.NullPointerException:.*$",
                    "msg": r"java\.lang\.NullPointerException:.*"
                },
                {
                    "regex": r"^.*java\.lang\.RuntimeException:.*$",
                    "msg": r"java\.lang\.RuntimeException:.*"
                }
            ],
            "succeed": {
                "regex": r"^.*BINGO!.*$",
                "data": r"BINGO!.*"
            }
        }
    

    def check_component_log(self, opts):
        if opts.get('IS_EXPORTED') is not None:
            if not opts['IS_EXPORTED']:
                log.warning("Press the button displayed to execute the exploit module.")
            else:
                log.warning(f'Navigate to target class: \"{opts["TARGET_CLASS"]}\" and trigger the implicit intent.')
        if opts.get('LEAK_PROVIDER') is None:
            return
        if not opts['LEAK_PROVIDER']:
            log.info(f'Check whether the protected component: \"{opts["COMPONENT_CLASS"]}\" is successfully accessed.')


    def build(self, app):
        log.debug("Executing module..")
        self.app_init()
        replacement_map = {
            self._manifest: app["manifest"],
            self._layout: app["layout"],
            self._main: app["bind_button"],
            "component": app["component"],
            "permission": app["permission"] if app.get("permission") is not None else None,
        }
        for key,val in replacement_map.items():
            if isinstance(val, list):
                for v in val:
                    if isinstance(v, dict):
                        self.create_file(v)
                    else:
                        self.replace_placeholder(key, v)
            else:
                self.replace_placeholder(key, val)
        log.debug("Building app..")
        try:
            succeed = self.run_gradle()
            if succeed:
                succeed = self.install_and_run_app()
            return succeed
        except KeyboardInterrupt:
            print("")
            log.error("Terminating module..")
            return False