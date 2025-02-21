# Sherlock
An Android application static analyzer framework powered by SemGrep OSS Engine. Sherlock currently focuses on identifying insecure ICC implementations in Android applications and provides exploitation modules for the identified vulnerabilities.

## Features
* Taint analysis with Semgrep OSS Engine
* Support multiple decompilers to obtain various decompiled code
* Maintain and analyze multiple APKs in one go
* Exploitation module for identified vulnerabilities
* Do all of the above in a single workflow

## Requirements
* OpenJDK < 22 (for Gradle dependencies)
* Python3
* ADB installed and set up on the path environment

## Vulnerabilities
* Insecure setResult
* Intent Redirection
* Mutable PendingIntent
* Insecure Broadcast
* ...more to come

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

## Usage
```bash
python3 sherlock.py
```

## Future Improvement
* Fix identified bugs and errors
* Add more rules and exploitation module

## Project Status
* Completed - occasionally developed and maintained

## Demo
[![Demo](https://img.youtube.com/vi/9X5R90VvhP8/maxresdefault.jpg)](https://youtu.be/9X5R90VvhP8)

## Acknowledgements
* [SemGrep](https://semgrep.dev/)
* [JADX](https://github.com/skylot/jadx)
* [CFR](https://github.com/leibnitz27/cfr)
* [Fernflower](https://github.com/fesh0r/fernflower)
* [Apktool](https://github.com/iBotPeaches/Apktool)
* [Dex2jar](https://github.com/pxb1988/dex2jar)