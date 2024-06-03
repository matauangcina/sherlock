# from commands.use import module, device
# from commands.show import module_options
# from commands.set import option_value
from commands.decompile import decompile
# import commands.execute

# from settings.decompiler import cfr, jadx, decompiler_map


# decompile(["/home/finechina/ubereats.apk", "--output", "/home/finechina/Labs/android/workspace"])




# module(["android/app/access-protected-components/intent-redirection/implicit"])
# module_options([])
# option_value(["target_package=sherlock.test", "target_class=sherlock.test.intent_redirection.BasicActivity", "parcel_extra=extra_intent", "component_class=sherlock.test.protected_components.ProtectedActivity"])
# device(["1"])
# commands.execute.module([])
from rich.progress import BarColumn
from rich.progress import Progress
from rich.progress import SpinnerColumn
from rich.progress import TaskProgressColumn
from rich.progress import TimeRemainingColumn, TimeElapsedColumn
from time import sleep


def progress_bar(message, exec_method):
    with Progress(
        "{task.description}", 
        SpinnerColumn(spinner_name="circleHalves"), 
        BarColumn(), 
        TaskProgressColumn(),
        TimeElapsedColumn()
    ) as progress:
        task = progress.add_task(f"[green]{message}", total=None)
        exec(exec_method)
        while not progress.finished:
            progress.update(task, advance=0.111, total=100)
            sleep(0.00111)

progress_bar("test", 'decompile(["/home/finechina/Labs/android/APK/ovaa.apk", "--output", "/home/finechina/Labs/android/workspace"])')