import os
import shutil
import subprocess
import settings.utils as utils

from globals import TEMP_PATH, JADX_BIN, APKTOOL_BIN, CFR_BIN,FERNFLOWER_BIN, DEX2JAR_BIN
from settings.logger import get_logger


log = get_logger(__name__)


def get_dex_files(path):
    files = os.listdir(path)
    dex_files = list()
    for file in files:
        if file.endswith(".dex"):
            dex_files.append(os.path.join(path, file))
    return dex_files


def decompile(apk):
    re_path = apktool(apk)
    if re_path is None:
        if utils.is_path_exists(TEMP_PATH):
            shutil.rmtree(TEMP_PATH)
        return None
    dex_files = get_dex_files(re_path)
    if len(dex_files) == 0:
        if utils.is_path_exists(TEMP_PATH):
            shutil.rmtree(TEMP_PATH)
        return None
    jar_files = dex2jar(dex_files)
    if len(jar_files) == 0:
        if utils.is_path_exists(TEMP_PATH):
            shutil.rmtree(TEMP_PATH)
        return None
    return re_path, jar_files


def dex2jar(dex_files):
    jar_files = list()
    for dex in dex_files:
        apk_jar = dex.replace(".dex", ".jar")
        dex2jar_cmd = [DEX2JAR_BIN, dex, "-o", apk_jar]
        try:
            subprocess.call(dex2jar_cmd, stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL, text=True)
            jar_files.append(apk_jar)
        except Exception as e:
            log.error(f"Dex2jar convertion failed: {e}, skipping: {os.path.basename(dex)}")
    return jar_files


def apktool(apk):
    id = os.path.basename(apk).split(".apk")[0]
    output_path = os.path.join(TEMP_PATH, id)
    apktool_cmd = [APKTOOL_BIN, "d", apk, "-o", output_path, "-s"]
    try:
        subprocess.call(apktool_cmd, stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL, text=True)
        return output_path
    except Exception as e:
        log.error(f"Apktool failed: {e}, skipping: {id}")
        return None
    

def post_decompile(re_path, apk_java, output_path):
    if utils.is_path_exists(output_path):
        shutil.rmtree(output_path)
    main_dir = os.path.join(output_path, "app", "src", "main")
    if not utils.is_path_exists(main_dir):
        os.makedirs(main_dir)
    re_list = os.listdir(re_path)
    for content in re_list:
        dest = os.path.join(main_dir, content)
        if os.path.isdir(dest) and utils.is_path_exists(dest):
            shutil.rmtree(dest)
        shutil.move(os.path.join(re_path, content), dest)
    shutil.move(apk_java, os.path.join(main_dir, "java"))
    if utils.is_path_exists(TEMP_PATH):
        shutil.rmtree(TEMP_PATH)


def cfr(apk, output_path):
    log.debug(f'Executing CFR..')
    re_path, jar_files = decompile(apk)
    apk_java = os.path.join(TEMP_PATH, "java")
    for jar in jar_files:
        cfr_cmd = [
            CFR_BIN, jar, 
            "--outputdir", 
            apk_java, 
            "--caseinsensitivefs", 
            "true", 
            "--comments", 
            "false", 
            "--silent", 
            "true", 
            "--rename", 
            "true", 
            "--renameillegalidents", 
            "--renameenumidents", 
            "--sugarretrolambda", 
            "true"
        ]
        try:
            subprocess.call(cfr_cmd, text=True)
        except Exception as e:
            log.error(f"Decompilation failed: {e}, skipping: {os.path.basename(jar)}")
            return
    post_decompile(re_path, apk_java, output_path)


def fernflower(apk, output_path):
    log.debug(f'Executing fernflower..')
    re_path, jar_files = decompile(apk)
    apk_java = os.path.join(TEMP_PATH, "java")
    if not utils.is_path_exists(apk_java):
        os.makedirs(apk_java)
    for jar in jar_files:
        fernflower_cmd = [
            FERNFLOWER_BIN,
            '-hes=0',
            '-hdc=0',
            '-dgs=1',
            '-ren=1',
            jar,
            apk_java,
        ]
        try:
            _ = subprocess.check_output(fernflower_cmd, text=True)
        except Exception as e:
            log.error(f"Decompilation failed: {e}, skipping: {os.path.basename(jar)}")
            return
    extract_jar(apk_java)
    post_decompile(re_path, apk_java, output_path)


def extract_jar(path):
    decompiled_jars = os.listdir(path)
    for jar in decompiled_jars:
        jar = os.path.join(path, jar)
        if jar.endswith(".jar"):
            extract_cmd = [
                'jar', 
                '--extract', 
                '--file', 
                jar
            ]
            try:
                os.chdir(path)
                subprocess.call(extract_cmd, text=True)
            except Exception as e:
                log.error(f"Jar file extraction failed: {e}, skipping: {jar}")
            finally:
                os.chdir(path)


def jadx(apk, output_path):
    log.debug(f'Executing JADX..')
    jadx_cmd = [
        JADX_BIN, 
        "--deobf", 
        apk, 
        "-d", 
        output_path, 
        "--comments-level", 
        "none", 
        "--export-gradle"
    ]
    try:
        subprocess.call(jadx_cmd, stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL, text=True)
    except Exception as e:
        log.error(f"Decompilation failed: {e}, skipping: \'{os.path.basename(apk)}\'")