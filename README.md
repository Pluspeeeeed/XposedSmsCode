# XposedSmsCode
![Total Downloads](https://img.shields.io/github/downloads/Pluspeeeeed/XposedSmsCode/total) ![Total Stars](https://img.shields.io/github/stars/Pluspeeeeed/XposedSmsCode?style=social) [![Latest Release](https://img.shields.io/github/v/release/Pluspeeeeed/XposedSmsCode?label=Latest%20Release)](https://github.com/Pluspeeeeed/XposedSmsCode/releases)

An Xposed module which can recognize, parse SMS code and copy it to clipboard when a new message arrives. It can also input SMS code automatically.

[中文版说明](/README-CN.md)

# Features
- Copy verification code to clipboard when a new message arrives.
- Show toast when the verification code is copied.
- Show notification when verification SMS parsed.
- Mark verification SMS as read(experimental).
- Delete verification SMS when it's extracted successfully(experimental).
- Block verification SMS if it's extracted successfully.
- Custom keywords about verification code message (regular expressions allowed).
- Support the SMS code match rules customization, importation and exportation.
- Auto-input SMS code.
- Various theme color to choose.

# Screenshots
<img src="/art/en/01.png" width="180"/><img src="/art/en/02.png" width="180"/><img src="/art/en/03.png" width="180"/>

# Usage
1. Root your device and install Xposed Framework.
2. Install and activate this xposed module and then reboot.
3. Enjoy it!

# Building
1. Install latest version of Android Studio.
2. Open this repo in Android Studio.
3. Use build tool in Android Studio.


# Attention
- **This module is suitable for AOSP ROM, it may not work well on other 3rd-party Rom.**
- **Compatibility: Requires Android api level ≥ 25.**
- **Support Xposed, EdXposed, LSPosed and TaiChi·Magisk**
- **Read the FAQ in app first if you encounter any problems.**

# Known issues
- Contents in About scection can not detect installed apps on the phone (adaptation with bumped target SDK version has not yet been finished).

Feel free to join in the development of this app via Issues and Pull Requests.

# Release Log
[Release Logs](/CHANGELOG.md)

# Thanks To
- [Xposed](https://github.com/rovo89/Xposed)
- [NekoSMS](https://github.com/apsun/NekoSMS)
- [ButterKnife](https://github.com/JakeWharton/butterknife)
- [Material Dialogs](https://github.com/afollestad/material-dialogs)
- [EventBus](https://github.com/greenrobot/EventBus)
- [GreenDao](https://github.com/greenrobot/greenDAO)
- [GreenDaoUpgradeHelper](https://github.com/yuweiguocn/GreenDaoUpgradeHelper)
- [Gson](https://github.com/google/gson)
- [dagger](https://github.com/google/dagger)
- [rxjava](https://github.com/ReactiveX/RxJava)
- [rxandroid](https://github.com/ReactiveX/RxAndroid)
- [Cyanea](https://github.com/jaredrummler/Cyanea)
- [Origional Version](https://github.com/tianma8023/XposedSmsCode)

# License
All code is licensed under [GPLv3](https://www.gnu.org/licenses/gpl-3.0.txt) 