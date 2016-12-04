package com.springmvc.service;  
  
import java.util.List;  
  
import javax.annotation.Resource;  
  
import org.springframework.stereotype.Service;  
  
import com.springmvc.dao.UserDao;  
import com.springmvc.model.User;  
  
@Service(value="userService")  
public class UserService {  
  
    @Resource(name="userDao")  
    private UserDao userDao;  
      
    public User findUserByNameAndPassword (User user) {  
        List<User> listUsers = userDao.findByNameAndPassword(user);  
          
        if(listUsers.size() > 0) {  
            return listUsers.get(0);  
        }  
        return null;  
    }  
      
    public User findUserByName (String name) {  
        List<User> listUsers = userDao.findUserByName(name);  
        if(listUsers.size() > 0) {  
            return listUsers.get(0);  
        }  
        return null;  
    }  
      
    public boolean deleteUser(Integer id) {  
        return userDao.deleteUser(id);  
    }  
      
    public boolean addUser(User user) {  
        return userDao.addUser(user);  
    }  
      
    public UserDao getUserDao() {  
        return userDao;  
    }  
    public void setUserDao(UserDao userDao) {  
        this.userDao = userDao;  
    }  
}  