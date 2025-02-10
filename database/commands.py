from commands import (
    add,
    analyze,
    clear,
    decompile,
    execute,
    print,
    set,
    show,
    remove,
    search,
    use
)


COMMANDS = {
    "show": {
        "desc": "Work with the 'show' command",
        "device": {
            "desc": "Show connected device(s)",
            "exec": show.device_info
        },
        "target": {
            "desc": "Show target app(s) from workspace",
            "opts": ["--component", "--activity", "--provider", "--receiver", "--service"],
            "exec": show.target_info
        },
        "module": {
            "desc": "Show selected exploit module",
            "options": {
                "desc": "Show options for selected exploit module",
                "exec": show.module_options

            }
        }
    },
    "decompile": {
        "desc": "Work with the 'decompile' command",
        "opts": ["--output", "--file", "--decompiler"],
        "exec": decompile.decompile
    },
    "add": {
        "desc": "Work with the 'add' command",
        "target": {
            "desc": "Add target to workspace",
            "exec": add.target
        }
    },
    "analyze": {
        "desc": "Work with the 'analyze' command",
        "manifest": {
            "desc": "Analyze manifest",
            "opts": ["--target", "--output", "--json"],
            "exec": analyze.manifest
        },
        "code": {
            "desc": "Analyze codebase",
            "opts": ["--target", "--output", "--json"],
            "exec": analyze.codebase
        },
        "*": {
            "desc": "Analyze both manifest and codebase",
            "opts": ["--target", "--output", "--json"],
            "exec": analyze.all
        }
    },
    "use": {
        "desc": "Work with the 'use' command",
        "device": {
            "desc": "Use a device connected to host",
            "exec": use.device
        },
        "module": {
            "desc": "Use an exploit module",
            "exec": use.module
        }
    },
    "remove": {
        "desc": "Work with the 'remove' command",
        "target": {
            "desc": "Remove target from workspace",
            "opts": ["--target", "--remove-dir"],
            "exec": remove.target
        }
    },
    "search": {
        "desc": "Work with the 'search' command",
        "module": {
            "desc": "Search exploit module",
            "exec": search.module
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
    "print": {
        "desc": "Work with the 'print' command",
        "option": {
            "desc": "Print option input template",
            "exec": print.options
        }
    },
    "clear": {
        "desc": "Clear terminal",
        "exec": clear.prompt
    },
    "exit": {
        "desc": "Exit terminal"
    }
}