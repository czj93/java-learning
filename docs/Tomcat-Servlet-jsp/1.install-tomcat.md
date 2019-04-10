## Tomcat 在 Mac 下的安装

### 参考文章
[MAC下安装配置Tomcat](https://www.jianshu.com/p/69496fb3495e)

### 安装步骤


1. 打开终端，进入安装目录
```sh
    cd /Library
```


2. 下载 解压 tomcat

    进入 [Tomcat官网](https://tomcat.apache.org/)

    选择你要下载的 Tomcat 版本，要于你的 java 版本匹配
    由于我装的是 java8, 所以选择 Tomcat 8

    Mac 选择 tar.gz 的安装包
    http://mirrors.shu.edu.cn/apache/tomcat/tomcat-8/v8.5.39/bin/apache-tomcat-8.5.39.tar.gz


```sh
    ## 下载
    sudo curl -O  http://mirrors.shu.edu.cn/apache/tomcat/tomcat-8/v8.5.39/bin/apache-tomcat-8.5.39.tar.gz

    ## 解压
    sudo tar -zxvf mongodb-osx-x86_64-3.4.2.tgz

    ## 重命名
    sudo mv apache-tomcat-8.5.39 tomcat
    ## 你也可以不选择通过命令行的形式安装，直接官网上下载对应的版本，解压，拷贝到 /Library 目录下可以
```

3.启动 关闭Tomcat
```sh
    ## 进入 tomcat 下的 bin 目录
    cd tomcat/bin

    ## 如果无法进入， 提示 Permission denied， 去要修改权限

    sudo chmod -R 755 /Library/tomcat

    ## 启动

    sudo sh startup.sh

    ## 关闭

    sh shutdown.sh

    ## 启动成功提示
    Using CATALINA_BASE:   /Library/tomcat
    Using CATALINA_HOME:   /Library/tomcat
    Using CATALINA_TMPDIR: /Library/tomcat/temp
    Using JRE_HOME:        /Library/Java/JavaVirtualMachines/jdk1.8.0_60.jdk/Contents/Home
    Using CLASSPATH:       /Library/tomcat/bin/bootstrap.jar:/Library/tomcat/bin/tomcat-juli.jar
    Tomcat started.

    ## 这时候打开浏览器进入 http://localhost:8080/

```


### 注意
安装  启动过程有可能会遇到 权限不足的情况 Permission denied
只需修改权限即可

```sh
    sudo chmod -R 755 /Library/tomcat
```

Idea 在配置 Tomcat 的遇上 application server libraries not found 提示，也是权限问题，修改权限即可
