import os

VERSION = "Sherlock - 1.0.0"
ROOT_PATH = os.path.dirname(os.path.abspath(__file__))
TARGET_PATH = ROOT_PATH + "/target"
RULES_PATH = ROOT_PATH + "/rules"
MODULE_PATH = ROOT_PATH + "/modules"
POC_MAIN_ACTIVITY = ROOT_PATH + "/poc/app/src/main/java/sherlock/poc/MainActivity.java"
POC_MANIFEST = ROOT_PATH + "/poc/app/src/main/AndroidManifest.xml"
JADX_BIN = ROOT_PATH + "/tools/jadx/bin/jadx"
INVALID_COMMAND = "Invalid command. Type 'help' for assistance\n"
ADB_BIN = None
AVAILABLE_RULES = ["manifest", "code"]