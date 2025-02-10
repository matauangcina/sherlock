import json

from output.progress import progress_bar
from rich import box
from rich.align import Align
from rich.console import Console, Group
from rich.panel import Panel
from rich.padding import Padding
from rich.layout import Layout
from rich.syntax import Syntax
from rich.table import Table
from rich.text import Text


def output_layout(dataflow):
    layout = Layout(name="root")
    layout.split(
        Layout(name="content"),
    )
    layout["content"].split_row(
        Layout(name="description"),
        Layout(name="code")
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
        line_range=[line-2,line+15],
        highlight_lines={line},
    )
    return syntax


def display_layout(console, findings_id, type, keys):
    rules = keys["rules"]
    for i, rule in enumerate(rules):
        progress_bar("Loading panel")
        dataflow = False
        metadata = keys["metadata"]
        severity = metadata["score"].split("/")[-1].strip()
        rule_id = rule["rule_id"]
        message = rule["message"].strip()
        component = rule["location"]["component"]
        line_num = rule["location"]["line"]["end"]
        snippet = rule["location"]["snippet"].strip()
        table = Table.grid(padding=(0,1))
        table.add_column(style="bold white", ratio=2)
        table.add_column(style="bold white", ratio=1)
        table.add_column(style="bright_white", ratio=10, overflow="fold")
        table.add_row("[underline]Summary[/]")
        table.add_row("Rule id", ":", rule_id)
        table.add_row("Message", ":", message)
        table.add_row("Severity", ":", f"[bold red]{severity}[/]" if severity.lower() == "high" else (f"[bold yellow]{severity}[/]" if severity.lower() == "medium" else f"[bold green]{severity}[/]"))
        table.add_row("")
        table.add_row("[underline]Metadata[/]")
        table.add_row("CWE", ":", metadata["cwe"])
        table.add_row("CVSS Score", ":", metadata["score"])
        table.add_row("CVSS Vector", ":", metadata["cvss"])
        if rule["location"].get("sink") is not None:
            vuln_code = rule["location"]["sink"]
            table.add_row("")
            table.add_row("[underline]Sink[/]")
            table.add_row("Sink", ":", f"[bold]{vuln_code}[/]")
        table.add_row("Snippet", ":", f"[bright_red]{snippet}[/]")
        table.add_row("Component", ":", component)
        table.add_row("Line", ":", str(line_num))
        if rule.get("source") is not None:
            dataflow = True
            source_component = rule["source"]["component"]
            source_line_num = rule["source"]["line"]["end"]
            source_snippet = rule["source"]["source"]
            table.add_row("")
            table.add_row("[underline]Source[/]")
            table.add_row("Snippet", ":", f"[bright_cyan]{source_snippet}[/]")
            table.add_row("Component", ":", source_component.split("/")[-1])
            table.add_row("Line", ":", str(source_line_num))
        summary_panel = Panel(
            Align.center(
                Group(Align.center(table)),
                vertical="middle",
            ),
            box=box.ROUNDED,
            title="Summary",
            border_style="bold white",
            padding=(0,3)
        )
        layout = output_layout(dataflow)
        layout["description"].update(summary_panel)
        if dataflow:
            layout["source"].update(
                Panel(
                    Align.center(
                        get_code_snippet(source_component, source_line_num), 
                        vertical="middle"
                    ), 
                    title="Source", 
                    border_style="bold blue", 
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
                    border_style="bold red", 
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
                    border_style="bold red",
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
                            title=f"[bold]{findings_id}[/]", 
                            title_align="center",
                            subtitle=f"[bold]{type}-analysis[/]",
                            subtitle_align="right",
                            border_style="bold orange3", 
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
                            title=f"[bold]{findings_id}[/]", 
                            title_align="right",
                            subtitle=f"[bold]{type}-analysis[/]",
                            subtitle_align="left",
                            border_style="bold yellow", 
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
                        title=f"[bold]{findings_id}[/]", 
                        title_align="left",
                        subtitle=f"[bold]{type}-analysis[/]",
                        subtitle_align="right",
                        border_style="bold cyan", 
                        padding=(0,1)
                    ), 
                    (0,20,0,2)
                )
            )


def get_rules(keys):
    rules = list()
    for rule in keys:
        if rule not in ["manifest", "code"]:
            continue
        rules.append(rule)
    return rules


def display_scan_result(summary, output_json=False, file=None):
    console = Console(file=file, width=172, height=36)
    if output_json:
        console.print_json(json.dumps(summary))
        console.print("")
        return
    targets = list(summary["targets"])
    for i, target in enumerate(targets):
        console.print(
            Panel.fit(
                Text(
                    f"Target #{i+1}: {target} ({summary['targets'][target]['package']})", 
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
            findings = target_id[rule]["findings"]
            finding_ids = list(findings)
            for id in finding_ids:
                details = findings[id]
                display_layout(console, id, rule, details)
    console.print("")
