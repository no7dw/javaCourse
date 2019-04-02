### web with rest 


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

