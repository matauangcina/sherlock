import os
import platform


VERSION = "v1.0.0"

ROOT_PATH = os.path.dirname(os.path.abspath(__file__))
RULE_PATH = os.path.join(ROOT_PATH, "rules")
MODULE_PATH = os.path.join(ROOT_PATH, "modules")
DB_PATH = os.path.join(ROOT_PATH, "database")
POC_PATH = {
    "root": os.path.join(ROOT_PATH, "poc"),
    "main": os.path.join(ROOT_PATH, "poc", "app", "src", "main"),
    "layout": os.path.join(ROOT_PATH, "poc", "app", "src", "main", "res", "layout"),
    "code": os.path.join(ROOT_PATH, "poc", "app", "src", "main", "java", "sherlock", "poc"),
    "apk": os.path.join(ROOT_PATH, "poc", "app", "build", "outputs", "apk", "debug")
}

JADX_BIN = os.path.join(ROOT_PATH, "tools", "jadx", "bin", "jadx.bat" if platform.system() == "Windows" else "jadx")
ADB_BIN = None

INVALID_CMD = "Invalid command. Use 'help' for assistance."

banner = """[bold yellow]                        


       _____ _           _         _   
      |   __| |_ ___ ___| |___ ___| |_ 
      |__   |   | -_|  _| | . |  _| '_|
      |_____|_|_|___|_| |_|___|___|_,_|

                                [/][bold blue]({0})[/]

                                
                                
""".format(VERSION)