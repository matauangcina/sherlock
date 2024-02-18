from globals import AVAILABLE_RULES
from progress import progress_bar
from rich import box
from rich.align import Align
from rich.console import Console, Group
from rich.panel import Panel
from rich.padding import Padding
from rich.layout import Layout
from rich.syntax import Syntax
from rich.table import Table
from rich.text import Text

console = Console(width=150, height=28)

def scan_layout(dataflow):
    layout = Layout(name="root")
    layout.split(
        Layout(name="content"),
    )
    layout["content"].split_row(
        Layout(name="description", ratio=1),
        Layout(name="code", ratio=1)
    )
    if dataflow:
        layout["code"].split(
            Layout(name="source"),
            Layout(name="sink")
        )
    return layout

def get_code_snippet(component, line):
    syntax = Syntax.from_path(
        component, 
        theme="github-dark",
        line_numbers=True,
        line_range=[line-3,line+8],
        highlight_lines={line},
        word_wrap=True
    )
    return syntax

def display_scan_summary(finding, keys):
    rules = keys["rules"]
    for i, rule in enumerate(rules):
        progress_bar(0.005)
        dataflow = False
        message = keys["message"]
        severity = keys["severity"]
        rule_id = rule["rule_id"]
        component = rule["location"]["component"]
        line_num = rule["location"]["line"]["end"]
        snippet = rule["location"]["snippet"].strip()
        table = Table.grid(padding=(0,1))
        table.add_column(style="bold white", ratio=10)
        table.add_column(style="bold white", ratio=1)
        table.add_column(style="white", ratio=10)
        table.add_row(Panel("Summary", box=box.DOUBLE))
        table.add_row("Rule id", ":", rule_id)
        table.add_row("Message", ":", message)
        table.add_row("Severity", ":", severity)
        if rule["location"].get("sink") is not None:
            vuln_code = rule["location"]["sink"]
            table.add_row("")
            table.add_row(Panel("Sink", box=box.DOUBLE))
            table.add_row("Sink", ":", vuln_code)
        table.add_row("Snippet", ":", snippet)
        table.add_row("Component", ":", component.split("/")[-1])
        table.add_row("Line", ":", str(line_num))
        if rule.get("source") is not None:
            dataflow = True
            source_component = rule["source"]["component"]
            source_line_num = rule["source"]["line"]["end"]
            source_snippet = rule["source"]["source"]
            table.add_row("")
            table.add_row(Panel("Source", box=box.DOUBLE))
            table.add_row("Snippet", ":", source_snippet)
            table.add_row("Component", ":", source_component.split("/")[-1])
            table.add_row("Line", ":", str(source_line_num))
        summary_panel = Panel(
            Align.center(
                Group(Align.center(table)),
                vertical="middle",
            ),
            box=box.ROUNDED,
            title="[bold white]Summary[/]",
            border_style="white",
            padding=(0,3)
        )
        layout = scan_layout(dataflow)
        layout["description"].update(summary_panel)
        if dataflow:
            layout["source"].update(
                Panel(
                    Align.center(
                        get_code_snippet(source_component, source_line_num), 
                        vertical="middle"
                    ), 
                    title="Source", 
                    border_style="blue", 
                    padding=(1)
                )
            )
            layout["sink"].update(
                Panel(
                    Align.center(
                        get_code_snippet(component, line_num), 
                        vertical="middle"
                    ), 
                    title="Sink", 
                    border_style="red", 
                    padding=(1)
                )
            )
        else:
            layout["code"].update(
                Panel(
                    Align.center(
                        get_code_snippet(component, line_num), 
                        vertical="middle"
                    ), 
                    title="Snippet", 
                    border_style="red",
                    padding=(1)
                )
            )
        if i % 2 == 0:
            if i == 0:
                console.print(
                    Padding(
                        Panel(
                            layout, 
                            box=box.ROUNDED, 
                            title=finding, 
                            title_align="center", 
                            style="bold yellow", 
                            padding=(0,1)
                        ), 
                        (0,10,0,10)
                    )
                )
            else:
                console.print(
                    Padding(
                        Panel(
                            layout, 
                            box=box.ROUNDED, 
                            title=finding, 
                            title_align="right", 
                            style="bold yellow", 
                            padding=(0,1)
                        ), 
                        (0,2,0,20)
                    )
                )
        else:
            console.print(
                Padding(
                    Panel(
                        layout, 
                        box=box.ROUNDED, 
                        title=finding, 
                        title_align="left", 
                        style="bold cyan", 
                        padding=(0,1)
                    ), 
                    (0,20,0,2)
                )
            )

def get_rules(keys):
    rules = list()
    for rule in keys:
        if rule not in AVAILABLE_RULES:
            continue
        else:
            rules.append(rule)
    return rules

def scan_output(summary):
    targets = list(summary["targets"])
    for i, target in enumerate(targets):
        print("\n")
        console.print(
            Panel.fit(
                Text(
                    f"Target #{i+1}: {target}", 
                    style="bold white", 
                    justify="center"
                ), 
                box=box.DOUBLE, 
                border_style="bold magenta"
            )
        )
        target_id = summary["targets"][target]
        target_details = list(target_id)
        rules = get_rules(target_details)
        for rule in rules:
            console.rule(f"[bold red]{rule}[/]", align="center")
            findings = target_id[rule]["findings"]
            finding_ids = list(findings)
            for id in finding_ids:
                details = findings[id]
                display_scan_summary(id, details)
    print("")