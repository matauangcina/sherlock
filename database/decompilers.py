from settings.decompiler import (
    jadx,
    cfr,
    fernflower
)


DECOMPILERS = {
    "jadx": {
        "desc": "JADX decompiler (used by default)",
        "author": "",
        "link": "",
        "exec": jadx
    },
    "cfr": {
        "desc": "CFR decompiler",
        "author": "",
        "link": "",
        "exec": cfr
    },
    "fernflower": {
        "desc": "Fernflower decompiler",
        "author": "",
        "link": "",
        "exec": fernflower
    }
}