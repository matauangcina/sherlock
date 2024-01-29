targets = [
    "est", 
    "insecureshop"
]
rules = ["manifest", "code"]
summary = {
    "targets": dict()
}
test = {
    "test":{
    },
    "errors": []
}

target_sum = summary["targets"]
for target in targets:
    if target not in target_sum:
        target_sum[target] = {}
    for rule in rules:
        if rule not in target_sum[target]:
            target_sum[target][rule] = {
                "ulala": "mamacita"
            }
print(summary)
