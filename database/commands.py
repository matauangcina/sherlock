from commands import analyze
from commands import decompile
from commands import get
from commands import remove
from commands import search
from commands import use

COMMANDS = {
    "get": {
        "desc": "Work with the 'get' command",
        "cmds": {
            "device": {
                "desc": "Get connected device(s)",
                "cmds": {
                    "info": {
                        "desc": "Get connected device(s) info",
                        "execute": get.device_info
                    }
                }
            },
            "target": {
                "desc": "Get target app(s) from workspace",
                "cmds": {
                    "info": {
                        "desc": "Get information from target app(s) in workspace",
                        "flags": ["--target"],
                        "execute": get.target_info
                    }
                }
            }
        }
    },
    "decompile": {
        "desc": "Work with the 'decompile' command",
        "cmds": {
            "apk": {
                "desc": "Decompile target apk(s) to workspace",
                "flags": ["--quiet"],
                "execute": decompile.apk
            }
        }
    },
    "analyze": {
        "desc": "Work with the 'analyze' command",
        "cmds": {
            "target": {
                "desc": "Get target app(s) from workspace",
                "cmds": {
                    "manifest": {
                        "desc": "Analyze manifest",
                        "flags": ["--target", "--output", "--json"],
                        "execute": analyze.manifest
                    },
                    "code": {
                        "desc": "Analyze codebase",
                        "flags": ["--target", "--output", "--json"],
                        "execute": analyze.codebase
                    },
                    "all": {
                        "desc": "Analyze both manifest and codebase",
                        "flags": ["--target", "--output", "--json"],
                        "execute": analyze.all
                    }
                }
            }
        }
    },
    "use": {
        "desc": "Work with the 'use' command",
        "cmds": {
            "device": {
                "desc": "Use a device connected to host",
                "execute": use.device
            },
            "module": {
                "desc": "Use an exploit module",
                "execute": use.module
            }
        }
    },
    "remove": {
        "desc": "Work with the 'remove' command",
        "cmds": {
            "target": {
                "desc": "Remove target from workspace",
                "flags": ["--target"],
                "execute": remove.target
            }
        }
    },
    "search": {
        "desc": "Work with the 'search' command",
        "cmds": {
            "module": {
                "desc": "Search exploit module",
                "execute": search.module
            }
        }
    },
    "exit": {
        "desc": "Exit terminal"
    }
}