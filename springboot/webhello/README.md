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

`
    {"code":503,"message":"500000003啊"}
`

#### 简化getter setter 等系列繁杂

 用lombok包的@Data

#### log

 用lombok包的@Log

#### 不同环境配置

 不同于其他网络文章,觉得[这个](https://blog.csdn.net/a15705952175/article/details/82385933)比较整洁的方案
 不同的开发环境,使用的环境变量,配置不一样:
 - 在resource/maven_build配置不同的prod/dev 的环境变量properties file
 - 在pom.xml 配置不同的 properties
 - application.properties  配置 envCode=${mvn.common.code}

 为什么这么做:
 - prod 的配置通常为了安全是与 dev 的配置不一样,并且prod 不可见的。
 - 通常有个 template file 供给大家去修改
 - 大项目很多配置不一样, 不想看到一堆注释掉一堆,然后paste 另外一堆
