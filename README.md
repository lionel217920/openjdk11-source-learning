# openJDK11-source-learning

openJDK11源码学习

## 相关网站链接

- [openjdk官网](http://openjdk.java.net/)
- [openjdk11源码下载](http://jdk.java.net/java-se-ri/11)
- [openjdkGithub](https://github.com/openjdk)
- [清华大学openjdk镜像](https://mirrors.tuna.tsinghua.edu.cn/AdoptOpenJDK/)

## 编译JDK

1. 在执行`configure`的时候，如果系统缺失一些编译工具，根据提示缺少什么就安装什么。
2. 在mac上编译BootJDK要下载mac系统的，可以在清华大学镜像下载。
3. mac要安装 **Homebrew** 和 **Xcode Command Line Tools**

我的电脑上一些配置版本

|  command  |   version |
| :-------:  | :--------:|
| clang --version | Apple LLVM version 10.0.1 (clang-1001.0.46.4) |
| clang++ --version | Apple LLVM version 10.0.1 (clang-1001.0.46.4) |
| autoconf --version | autoconf (GNU Autoconf) 2.69 |
| make --version | GNU Make 3.81 |
| gcc --version | gcc-7 (Homebrew GCC 7.5.0) 7.5.0 |
| ccache --version | ccache version 3.7.6 |
| freetype-config --version | 23.1.17 |

### Running Configure

```shell
bash configure --with-toolchain-type=clang --with-debug-level=slowdebug --enable-dtrace --with-jvm-variants=server --with-target-bits=64 --enable-ccache --with-num-cores=8 --with-memory-size=8000 --disable-warnings-as-errors --with-sysroot=/Library/Developer/CommandLineTools/SDKs/MacOSX10.14.sdk --with-boot-jdk=/Users/lionel/Environment/openjdk10/jdk-10.jdk/Contents/Home
```

### Running Make

```shell
make all
```
**make all** - Build all images(product, docs and test)

我的电脑CPU配置： 2.7 GHz Intel Core i7，使用八核编译，13分钟完成。

```shell
make images
```
**make images** - Build the JDK image

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

![4](image/屏幕快照%202021-01-25%20下午5.13.16.png)
