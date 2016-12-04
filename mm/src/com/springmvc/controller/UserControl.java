package com.springmvc.control;  
  
import javax.annotation.Resource;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.Produces;  
  
import org.springframework.context.annotation.Scope;  
import org.springframework.stereotype.Controller;  
import org.springframework.stereotype.Repository;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.ResponseBody;  
import org.springframework.web.servlet.ModelAndView;  
  
import com.springmvc.model.User;  
import com.springmvc.service.UserService;  
  
/** 
 * Scope：表示实例是原型，这样会对每一个请求实例化，保证线程安全 Spring中使用 Controller注解表示该类是控制器 
 * Repository注解Dao访问类 Service注解业务逻辑处理类 Resource注解表示使用某个bean资源 
 * RequestMapping：表示对该类所有方法的请求URL，前面必须接上/user，如/user/login 表示对login方法的请求访问 
 *  
 * @author Administrator 
 *  
 */  
@Scope("prototype")  
@Controller  
@RequestMapping("/user")  
public class UserControl {  
  
    @Resource(name = "userService")  
    private UserService userService;  
    private String message;  
  
    /** 
     *  
     * Spring MVC中使用RequestMapping处理URL请求， 
     *     GET：表示查询；POST：表示添加操作 
     *     PUT：表示修改操作；DELETE：表示删除操作 
     * ResponseBody：表示返回对象或者值; 
     * consumes: 表示前端传过来的数据格式; 
     * produces：表示返回数据格式 
     */  
    @RequestMapping(value = "/login", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")  
    @ResponseBody  
    public User login(User user, Model model) {  
        // System.out.println(user.getUsername());  
        User u = userService.findUserByNameAndPassword(user);  
        return u;  
    }  
  
    @RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = "application/json")  
    @ResponseBody  
    public String addUser(User user) {  
        boolean flag = userService.addUser(user);  
        if (flag) {  
            message = "success";  
        } else {  
            message = "error";  
        }  
        return message;  
    }  
  
    /** 
     * PathVariable:注解方法参数，表示该参数变量值是通过URL传递的 
     * URL中必须包含该参数变量名，变量名需要相同才能完成变量传递注入 
     */  
    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE, produces = "application/json")  
    @ResponseBody  
    public String deleteUser(@PathVariable Integer id) {  
        boolean flag = userService.deleteUser(id);  
        if (flag) {  
            message = "success";  
        } else {  
            message = "error";  
        }  
        return message;  
    }  
  
    public void setUserService(UserService userService) {  
        this.userService = userService;  
    }  
  
    public UserService getUserService() {  
        return userService;  
    }  
}  