package com.edteam.cursospring.services;

import com.edteam.cursospring.dao.UserDao;
import com.edteam.cursospring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;


   public List<User> getAll(){ 
        return userDao.getAll();
    }

    public User get( long id){
        return userDao.get(id);
    }

    public User register( User user){
        return userDao.register(user);
    }

    public User update(@RequestBody User user){
        return userDao.update(user);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable long id){
        userDao.delete(id);
    }

}
