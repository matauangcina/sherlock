from commands import analyze
from commands import clear
from commands import decompile
from commands import execute
from commands import set
from commands import show
from commands import remove
from commands import search
from commands import use


COMMANDS = {
    "show": {
        "desc": "Work with the 'get' command",
        "cmds": {
            "device": {
                "desc": "Show connected device(s)",
                "cmds": {
                    "info": {
                        "desc": "Get connected device(s) info",
                        "exec": show.device_info
                    }
                }
            },
            "target": {
                "desc": "Show target app(s) from workspace",
                "cmds": {
                    "info": {
                        "desc": "Show information from target app(s) in workspace",
                        "flags": ["--component", "--activity", "--provider", "--receiver", "--service"],
                        "exec": show.target_info
                    }
                }
            },
            "module": {
                "desc": "Show selected exploit module",
                "cmds": {
                    "options": {
                        "desc": "Show options for selected exploit module",
                        "exec": show.module_options
                    }
                }
            }
        }
    },
    "decompile": {
        "desc": "Work with the 'decompile' command",
        "flags": ["--output", "--file"],
        "exec": decompile.decompile
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
                        "exec": analyze.manifest
                    },
                    "code": {
                        "desc": "Analyze codebase",
                        "flags": ["--target", "--output", "--json"],
                        "exec": analyze.codebase
                    },
                    "*": {
                        "desc": "Analyze both manifest and codebase",
                        "flags": ["--target", "--output", "--json"],
                        "exec": analyze.all
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
                "exec": use.device
            },
            "module": {
                "desc": "Use an exploit module",
                "exec": use.module
            }
        }
    },
    "remove": {
        "desc": "Work with the 'remove' command",
        "cmds": {
            "target": {
                "desc": "Remove target from workspace",
                "flags": ["--target"],
                "exec": remove.target
            }
        }
    },
    "search": {
        "desc": "Work with the 'search' command",
        "cmds": {
            "module": {
                "desc": "Search exploit module",
                "exec": search.module
            }
        }
    },
    "set": {
        "desc": "Set options value for selected exploit module",
        "exec": set.option_value
    },
    "execute": {
        "desc": "Execute an exploit module",
        "exec": execute.module
    },
    "clear": {
        "desc": "Clear terminal",
        "exec": clear.prompt
    },
    "exit": {
        "desc": "Exit terminal"
    }
}