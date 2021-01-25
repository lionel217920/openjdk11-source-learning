# openJDK11-source-learning

openJDK11源码学习

## 编译JDK

略，有时间补充

## 项目配置

1. 选择编译完成的JDK

/Users/lionel/Environment/openjdk/11/openjdk/build/macosx-x86_64-normal-server-slowdebug/images/jdk

![1](image/屏幕快照%202021-01-25%20下午4.49.40.png)
![2](image/屏幕快照%202021-01-25%20下午4.49.49.png)

2. 修改源代码路径

将/Users/lionel/Environment/openjdk/11/openjdk/build/macosx-x86_64-normal-server-slowdebug/images/jdk目录下src.zip移除

添加openjdk源码路径

![3](image/屏幕快照%202021-01-25%20下午4.58.29.png)

## 修改源码后重新编译

```shell
cd /Users/lionel/Environment/openjdk/11/openjdk
make images
```
