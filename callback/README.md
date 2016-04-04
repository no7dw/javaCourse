＃例子说明 java.lang.NoClassDefFoundError 的原因

正确的例子：

run under folder:

    dengwei@dengweis-MacBook-Pro:~/project/github/javaCourse$javac callback/TimerTest.java 
    dengwei@dengweis-MacBook-Pro:~/project/github/javaCourse$java callback/TimerTest 

if not in the right foler, you'll get error:

	dengwei@dengweis-MacBook-Pro:~/project/github/javaCourse/callback$ javac TimerTest.java
	dengwei@dengweis-MacBook-Pro:~/project/github/javaCourse/callback$ java TimerTest
	Exception in thread "main" java.lang.NoClassDefFoundError: TimerTest (wrong name: callback/TimerTest)

    Exception in thread "main" java.lang.NoClassDefFoundError: TimerTest (wrong name: callback/TimerTest)


because your package :

    package callback;

究其直接原因：package 定位失败，参考javaCourse/Package4 的各种package 的定位

这种错误很常见，另外一些类似原因的总结的link：
[为什么执行JAVA程序时，会出现Exception in thread"main" java.lang.NoClassDefFoundError的错][1]
[exception in thread 'main' java.lang.NoClassDefFoundError][2] 


  [1]: http://zhangjf.blog.51cto.com/264589/50630
  [2]: http://stackoverflow.com/questions/6334148/exception-in-thread-main-java-lang-noclassdeffounderror