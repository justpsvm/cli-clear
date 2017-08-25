```java
public class JniTest {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        JniClear.clear();

        System.out.println("Hello World");
    }
}
```

![](https://ws3.sinaimg.cn/large/006tKfTcgy1fivwox8rwlg30o4074myn.gif)

for Mac
```sh
gcc -dynamiclib -o ./libJniClear.jnilib JniClear.c -framework JavaVM -I/$JAVA_HOME/include -I/$JAVA_HOME/include/darwin
```

for Linux
```sh
gcc -I$JAVA_HOME/include -I$JAVA_HOME/include/linux -fPIC -shared JniClear.c -o libJniClear.so
```

for Windows
```sh
cl -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -LD JniClear.c -JniClear.dll
```

> Mac 和 Linux 编译需要单独加上 lib 前缀 JniClear -> libJniClear 否则系统无法识别

请保证  `JAVA_HOME` 是正确的环境变量 否则找不到 `jni.h` 会出现如下错误:

```sh
JniClear.c:2:10: fatal error: 'jni.h' file not found
#include <jni.h>
         ^
1 error generated.
```

把编译好的 jni 文件放到 java 加载路径中即可。

查看 java 加载路径

```java
String libraryDirs = System.getProperty("java.library.path");  
System.out.println(libraryDirs);
```

> 另外直接在 idea 或者 eclipse 中运行看不出来效果，它们运行并不是使用 terminal (打包成 jar 或者 java 手动执行)

更多信息: <http://justpsvm.com/2016/12/24/JNI-terminal-clear/>