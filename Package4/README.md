# java 定位package练习并手动编译运行多个java文件

---
## case 1, 有层级import:
 

    import com.wade.Human.*;

Package/

    dengwei@dengweis-MacBook-Pro:~/project/github/javaCourse/Package$ tree
    .
    ├── README.md
    ├── Test.class
    ├── Test.java
    └── com
        └── wade
            └── Human
                ├── Baby.class
                └── Baby.java
            

### compile & run            
    dengwei@dengweis-MacBook-Pro:~/project/github/javaCourse/Package$ javac Test.java && java Test
    My name is Wade
    1



## case 2,class 直接在当前目录:

    dengwei@dengweis-MacBook-Pro:~/project/github/javaCourse/Package2$ tree
    .
    ├── A.class
    ├── A.java
    ├── Test.class
    └── Test.java

### compile & run   

    dengwei@dengweis-MacBook-Pro:~/project/github/javaCourse/Package2$ javac Test.java && java Test
    10

## case 3, 交错目录:

    dengwei@dengweis-MacBook-Pro:~/project/github/javaCourse/Package4$ tree
.
├── classes
│   ├── main
│   │   └── Test.class
│   ├── package1
│   │   └── A.class
│   ├── package2
│   │   └── B.class
│   └── package3
│       └── C.class
└── src
    ├── Makefile
    ├── main
    │   └── Test.java
    ├── package1
    │   └── A.java
    ├── package2
    │   └── B.java
    └── package3
        └── C.java

Test.java:
注意，不在当前目录，需要compile时指定classpath:

    import package1.*;
    import package2.*;
    import package3.*;
    
//Makefile    

    target: 
        javac ./package1/A.java -d ../classes
        javac ./package2/B.java -d ../classes
        javac ./package3/C.java -d ../classes
        javac ./main/Test.java  -d ../classes/main/ -classpath ../classes
    run:
        java -classpath ../classes/main:../classes Test
        
    

### 注意坑
classpath 多个classpath时， linux/Mac 下用:分割。貌似windows下用;分割。

具体src 见：[javaCourse][1]


  [1]: https://github.com/no7dw/javaCourse/
