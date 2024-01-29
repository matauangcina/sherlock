import os

VERSION = "Sherlock - 1.0.0"
ROOT_PATH = os.path.dirname(os.path.abspath(__file__))
TARGET_PATH = ROOT_PATH + "/target"
RULES_PATH = ROOT_PATH + "/rules"
JADX_BIN = ROOT_PATH + "/tools/jadx/bin/jadx"
INVALID_COMMAND = "Invalid command. Type 'help' for assistance\n"
ADB_BIN = None