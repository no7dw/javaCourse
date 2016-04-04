run under folder:

    dengwei@dengweis-MacBook-Pro:~/project/github/javaCourse$javac callback/TimerTest.java 
    dengwei@dengweis-MacBook-Pro:~/project/github/javaCourse$java callback/TimerTest 

otherwise, you'll get error:

    Exception in thread "main" java.lang.NoClassDefFoundError: TimerTest (wrong name: callback/TimerTest)


because your package :

    package callback;


