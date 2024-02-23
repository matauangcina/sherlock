import os

VERSION = "v1.0.0"

ROOT_PATH = os.path.dirname(os.path.abspath(__file__))
TARGET_PATH = os.path.join(ROOT_PATH, "targets")
RULE_PATH = os.path.join(ROOT_PATH, "rules")
MODULE_PATH = os.path.join(ROOT_PATH, "modules")
DB_PATH = os.path.join(ROOT_PATH, "database")

JADX_BIN = os.path.join(ROOT_PATH, "tools/jadx/bin/jadx")
ADB_BIN = None

INVALID_CMD = "Invalid command. Use the 'help' command for assistance."

banner = """                        
       _____ _           _         _   
      |   __| |_ ___ ___| |___ ___| |_ 
      |__   |   | -_|  _| | . |  _| '_|
      |_____|_|_|___|_| |_|___|___|_,_|

                                ({0})
""".format(VERSION)