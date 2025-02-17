# Sherlock
An Android application static analyzer framework powered by SemGrep OSS Engine. Sherlock provides the option to use multiple decompilers for decompiling and analyzing APKs in a black box environment. Sherlock currently focuses on identifying insecure ICC implementations in Android applications and provides exploitation modules for the identified vulnerabilities.

## Requirements
* OpenJDK < 22
* Python3
* ADB installed and set up on the path environment

## Vulnerabilities
* Insecure setResult
* Intent Redirection
* Mutable PendingIntent
* Insecure Broadcast

## Tested On
* Ubuntu
* Kali Linux
* OSX

## Installation
```bash
git clone https://github.com/matauangcina/sherlock.git
cd sherlock
pip install -r requirements.txt
```

## Getting Started
```bash
python3 sherlock.py
```

## Demo
[Demo](https://drive.google.com/file/d/1KQz2UOnxwmHHFsKZcxZQaQ67pAU5WHqx/view?usp=sharing)

## Acknowledgements
* [SemGrep](https://semgrep.dev/)
* [JADX](https://github.com/skylot/jadx)
* [CFR](https://github.com/leibnitz27/cfr)
* [Fernflower](https://github.com/fesh0r/fernflower)
* [Apktool](https://github.com/iBotPeaches/Apktool)
* [Dex2jar](https://github.com/pxb1988/dex2jar)