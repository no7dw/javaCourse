### 这些年来java 的改进

哪些TMD烦人的java

 - 起个项目太TMD复杂了,太TMD多配置了 --> spring boot
 - 太多TMD垃圾没用代码了 hashcode get/seter  --> IDE 自动生成; lombok 注解; @getter @setter 等注解
 - XML配置TMD是上个世纪的产物 --> .properties or yaml or json
 - pom.xml 太TMD的冗长了 --> IDE 自动提示 or gradle
 - bean 太TMD复杂无用了
 - 语法太TMD复杂无用了，起个简单项目，需要写太多代码了 --》 java要背锅，减缓：

    - 使用spring boot ，用starter配置
    - 用其他动态语言:
      - Python
      - Javacript(Node.js/Typescript)
      - Ruby
      - Golang

 - 编译真太TMD慢了，倒杯咖啡都没搞定 --》买个大点的杯子装☕️ or :

    - 增量构建
    - 把项目拆小，类微服务方向
    - 我TMD就一个文件，要几秒！！！：
      - 买个大点的杯子装☕️  :-(

 - Eclipse太TMD卡了 --> Intellij IDEA or ... 升级硬件吧
 - even Intellij IDEA 也太卡了，load 个稍大的项目太TMD慢了, index 个老半天，这个锅 java 背部分, idea 减缓：
 
    - 配置 /Applications/IntelliJ\ IDEA.app/Contents/bin/idea.vmoptions , (加大Xms Xmx内存)[https://blog.csdn.net/qq_27093465/article/details/81947933]  
    - [最佳配置](http://blog.oneapm.com/apm-tech/426.html)
    - 去除部分你不太用的plugin: setting->plugins->xxx

 - 为毛这么多对象写hashCode, equals 方法 --> 见[this](https://mp.weixin.qq.com/s/qt9g-NrMf1LvN9Q07hW2Vw)
 
 - 框架太重了
 - maven 下载太TMD慢了 --> 这个锅。。。, 改 conf/settings.xml:

  `
    <mirror>
      <id>nexus-aliyun</id>
      <mirrorOf>*</mirrorOf>
      <name>Nexus aliyun</name>
      <url>http://maven.aliyun.com/nexus/content/groups/public</url>
    </mirror>
  `




[https://meetsnehal.wordpress.com/2015/09/12/yaml-an-alternative-to-properties-file-with-spring-boot/](https://meetsnehal.wordpress.com/2015/09/12/yaml-an-alternative-to-properties-file-with-spring-boot/)
[http://javajee.com/a-quick-comparison-of-yaml-with-properties-file](http://javajee.com/a-quick-comparison-of-yaml-with-properties-file)
