### springboot 极速web入门


#### json obj 

 - 直接返回object对象, 只要带@RestController 就可以了
 - 使用JsonProperty annotation 简化json 输出

#### 自定义错误返回

默认访问错误会返回

`
Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.

Tue Apr 02 21:30:14 CST 2019
There was an unexpected error (type=Not Found, status=404).
No message available
`
TODO:

 - 自定义自己的exception 的返回,留下 message or code 自定义
 - 定一个ExceptionHandler接exception.class 处理 ,并以@ResponseBody 包成json

再试试访问

`
    {"code":503,"message":"500000003啊"}
`

#### 简化getter setter 等系列繁杂

 用lombok包的@Data

#### log

 用lombok包的@Slf4j

 IntelliJ IDEA 配置compile 报错, can not find symble Slf4j, 解决参考[这里](https://stackoverflow.com/questions/14866765/building-with-lomboks-slf4j-and-intellij-cannot-find-symbol-log
), 要重启!


#### 不同环境配置

 不同于其他网络文章,觉得[这个](https://blog.csdn.net/a15705952175/article/details/82385933) and [这个](http://dolszewski.com/spring/spring-boot-properties-per-maven-profile/)比较整洁的方案
 不同的开发环境,使用的环境变量,配置不一样:
 - 在resource配置不同的prod/dev 的环境变量properties file
 - 在pom.xml 配置不同的 properties
 - application.properties  配置 启用的环境

 为什么这么做:
 - prod 的配置通常为了安全是与 dev 的配置不一样,并且prod 不可见的。
 - 通常有个 template file 供给大家去修改
 - 大项目很多配置不一样, 不想看到一堆注释掉一堆,然后paste 另外一堆
 - //透过intellij IDEA 这样的maven projects 插件,可视化地、 很方便的切换环境

留意log

`
    2019-04-02 23:17:10.107  INFO 2460 --- [           main] com.example.demo.WebhelloApplication     : The following profiles are active: dev
`

http://localhost:8080/Hey

`
    {"code":503,"message":"dev"}
`

#### 校验参数

#### redis 操作

#### mongodb 操作

 in mongodemo

#### MyBatis


### part 2

#### mq 操作

#### rpc 操作

#### 异步

#### 线程
