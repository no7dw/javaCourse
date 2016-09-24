### why java

### why dependency Injection

    为什么初始化、定制class 不直接参数形式在代码传进去给constructor or set 参数给class 变量。需要变动的时候修改代码就ok了。而需要一套xml 的维护工具？ 
    -- 其中一个原因：因为java 是静态编译的语言，修改代码是需要重新编译的，不想动态语言，可以通过配置配置文件、代码里代码直接更改就可以上了。

### autowired

    好处是通过简单的配置，自动解决对象与对象之间的依赖于初始化。

    ```
      package com.caveofprogramming.spring.test;
      import org.springframework.beans.factory.annotation.Autowired;
      /*
       * Dummy implementation of logger.
       */
      public class Logger {
        @Autowired
        private ConsoleWriter consoleWriter;
        @Autowired
        private FileWriter fileWriter;        
      //  @Autowired
      //  public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
      //    super();
      //    this.consoleWriter = consoleWriter;
      //    this.fileWriter = fileWriter;
      //  }
      //  @Autowired
      //  public void setConsoleWriter(ConsoleWriter writer) {
      //    this.consoleWriter = writer;
      //  }
      //  @Autowired
      //  public void setFileWriter(FileWriter fileWriter) {
      //    this.fileWriter = fileWriter;
      //  }
      //  
        public void writeFile(String text) {
          fileWriter.write(text);
        }      
        public void writeConsole(String text) {
          consoleWriter.write(text);
        }
      }
    ```

    上述代码中constructor & setter 都可以不用的时候，就可以被其他外部使用。免去了初始化的过程：不用再client 端初始化:
    ```
    Logger logger = new Logger(new FileWriter())
    logger.writeFile("Hi again");
    ```
    而是直接使用：
    ```
    Logger logger = (Logger)context.getBean("logger");        
    logger.writeFile("Hi again");
    ```
    
