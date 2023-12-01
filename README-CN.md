# XposedSmsCode
![Total Downloads](https://img.shields.io/github/downloads/Pluspeeeeed/XposedSmsCode/total) ![Total Stars](https://img.shields.io/github/stars/Pluspeeeeed/XposedSmsCode?style=social) [![Latest Release](https://img.shields.io/github/v/release/Pluspeeeeed/XposedSmsCode?label=Latest%20Release)](https://github.com/Pluspeeeeed/XposedSmsCode/releases)

识别短信验证码的Xposed模块，并将验证码拷贝到剪切板，亦可以自动输入验证码。

[English README](/README-EN.md)

# 功能
- 收到验证码短信后将验证码复制到系统剪贴板
- 收到验证码时显示Toast
- 收到验证码时显示通知
- 将验证码短信标记为已读（实验性）
- 验证码提取成功后，删除验证码短信（实验性）
- 拦截验证码短信
- 自定义验证码短信关键字（正则表达式）
- 自定义验证码匹配规则，并支持规则导入导出
- 自动输入验证码
- 主题换肤

# 应用截图
<img src="/art/cn/01.png" width="180"/><img src="/art/cn/02.png" width="180"/><img src="/art/cn/03.png" width="180"/>

# 使用
1. Root你的设备，安装Xposed框架；
2. 安装本模块，激活并重启；
3. Enjoy it！

# 构建
1. 安装最新版 Android Studio。
2. 在 Android Studio 中打开此项目。
3. 使用 Android Studio 中的 build 工具进行构建。

# 注意
- **此模块适用于偏原生的系统，其他第三方定制Rom可能不适用。**
- **兼容性：兼容 Android api 等级 ≥ 25 的设备。**
- **支持 Xposed、EdXposed、LSPosed 以及 太极·magisk**
- **遇到问题请先阅读模块中的"常见问题"**

# 已知问题
- “关于” 一栏无法拉起其他应用（升完 targetSDK 还没做适配）。

欢迎反馈Issue和发起PR。

# 更新日志
[更新日志](/CHANGELOG.md)

# 感谢
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


# 协议
所有的源码均遵循 [GPLv3](https://www.gnu.org/licenses/gpl-3.0.txt) 协议