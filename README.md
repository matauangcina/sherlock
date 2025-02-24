# Sherlock
An Android application static analyzer and exploitation framework powered by SemGrep OSS Engine.

## Features
* Taint analysis with Semgrep OSS Engine
* Support multiple decompilers to obtain various decompiled code
* Maintain and analyze multiple APKs in one go
* Exploitation module for identified vulnerabilities
* Do all of the above in a single workflow

## Requirements
* OpenJDK < 22 (for Gradle dependencies)
* Python3
* ADB binary set up on path environment
* Supports only UNIX systems

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

## Demo
[![Demo](https://img.youtube.com/vi/9X5R90VvhP8/maxresdefault.jpg)](https://youtu.be/9X5R90VvhP8)

## Future Improvement
* Fix identified bugs and errors
* Add more rules and exploitation module for the identified vulnerability (if possible)
* Add ADB binary to the tools directory and use the added ADB instead of the host system's

## Project Status
* Completed - occasionally developed and maintained

## Challenges & Lesson Learnt
* Rules with minimum false positives and/or false negatives is a challenge due to Semgrep OSS Engine's taint analysis limitations and the various ways a code is developed to perform the same functionality
* Robust exploitation module is a challenge due to the various unique cases to trigger the desired code snippet

## Acknowledgements
* [SemGrep](https://semgrep.dev/)
* [JADX](https://github.com/skylot/jadx)
* [CFR](https://github.com/leibnitz27/cfr)
* [Fernflower](https://github.com/fesh0r/fernflower)
* [Apktool](https://github.com/iBotPeaches/Apktool)
* [Dex2jar](https://github.com/pxb1988/dex2jar)