package com.springmvc.dao;  
  
import java.util.ArrayList;  
import java.util.List;  
  
import javax.annotation.Resource;  
  
import org.springframework.orm.hibernate4.HibernateTemplate;  
import org.springframework.stereotype.Repository;  
  
import com.springmvc.model.User;  
  
@Repository(value="userDao")  
public class UserDao {  
  
    //hibernateTemplate是Spring提供的Hibernate Dao操作类，在applicationContext中已经完成bean注入，所以此处直接  
    //可以拿过来使用  
    @Resource(name="hibernateTemplate")  
    private HibernateTemplate hibernateTemplate;  
      
    //根据用户名和密码查询  
    public List<User>  findByNameAndPassword (User user) {  
       String queryString = "from User where username = :username and password = :password";  
       String paramNames[] = {"username" , "password"};  
       String paramValues[] = {user.getUsername(),user.getPassword()};  
         
       //findByNamedParam方法提供hql方法参数查询，避免Sql注入漏洞  
       @SuppressWarnings("unchecked")  
       List<User> listUsers = (List<User>) hibernateTemplate.findByNamedParam(queryString, paramNames, paramValues);  
       return listUsers;          
    }  
      
    @SuppressWarnings("unchecked")  
    public  List<User> findUserByName(String name) {  
        List<User> userList = new ArrayList<User>();  
        String queryString = "from User where username like:name";  
        userList = (List<User>) hibernateTemplate.findByNamedParam(queryString,"name",name);  
        return userList;  
    }  
      
    public boolean  addUser(User user) {  
        try {  
            hibernateTemplate.save(user);     
        } catch (Exception e) {  
           return false;              
        }  
        return true;  
    }  
      
    public boolean deleteUser(Integer id) {  
        try {  
            User user = hibernateTemplate.get(User.class, id);  
            hibernateTemplate.delete(user);  
        } catch (Exception e) {  
            return false;  
        }  
        return true;  
    }  
    public HibernateTemplate getHibernateTemplate() {  
        return hibernateTemplate;  
    }  
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {  
        this.hibernateTemplate = hibernateTemplate;  
    }  
} 