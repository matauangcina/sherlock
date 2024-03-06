import os
import re
import settings.utils as utils
import shutil
import subprocess

from globals import ROOT_PATH, POC_PATH
from settings.logger import get_logger
from state.device import device_state
from state.options import option_state


log = get_logger(__name__)


class App:
    
    def __init__(self):
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

    def format(self, id):
        formatted = ""
        for i in range(len(id)):
            if id[i-1] == "_":
                continue
            if id[i] == "_":
                formatted += id[i+1].upper()
                continue
            formatted += id[i]
        return formatted

    def placeholder(self, ext="java"):
        return "<!-- (( placeholder )) -->" if ext == "xml" else "// (( placeholder ))"

    def get_options_value(self):
        options = option_state.get_all_options()
        opts = dict()
        for k,v in options.items():
            opts[k] = v.default
        return opts
    
    def replace_map(self):
        pass
    
    def replace_placeholder(self, file, content):
        ext = os.path.basename(file).split(".")[-1]
        with open(file, "r") as f:
            file_content = f.read()
        if content not in file_content:
            replace_placeholder = file_content.replace(self.placeholder(ext), content)
            with open(file, "w") as f:
                f.write(replace_placeholder)

    def generate_component_files(self, *files):
        for file in files:
            filename = os.path.join(POC_PATH["code"], file["name"])
            with open(filename, "w") as f:
                f.write(file["content"])

    def build(self, app, *comps):
        status = True
        replacement_map = {
            self._manifest: app["manifest"],
            self._layout: app["layout"],
            self._main: app["bind_button"]
        }
        for k,v in replacement_map.items():
            self.replace_placeholder(k,v)
        self.generate_component_files(*comps)
        gradle = os.path.join(POC_PATH["root"], "gradlew")
        os.chdir(POC_PATH["root"])
        cmd = ["sh", gradle, "assembleDebug"]
        try:
            run_gradle = subprocess.check_output(cmd, stderr=subprocess.STDOUT, text=True).splitlines()
        except Exception as e:
            status = False
            log.error(f"Error: {e}")
            return status
        for line in run_gradle:
            if re.match(r"^BUILD SUCCESSFUL.*$", line):
                log.info("Build successful.")
                break
        os.chdir(ROOT_PATH)
        log.debug("Launching app to device..")
        apk = os.path.join(POC_PATH["apk"], "app-debug.apk")
        install_apk = utils.run_adb(device_state.device_id, ["install", apk]).splitlines()
        if install_apk is None:
            status = False
            log.error(f"Failed to install app.")
            return status
        for line in install_apk:
            if line == "Success":
                log.info(f"App installed on device: '{device_state.device_id}'")
                break
        _ = utils.run_adb(device_state.device_id, ["am", "start", "-n", "sherlock.poc/.MainActivity"], shell=True)
        log.warning("PRESS THE BUTTON TO EXECUTE THE EXPLOIT MODULE!")
        return status