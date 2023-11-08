package com.edteam.cursospring.dao;

import com.edteam.cursospring.models.User;


import java.util.ArrayList;
import java.util.List;

public interface UserDao {

    List<User> getAll();

    User get(long id);

    User register(User user);

    User update(User user);

    void delete(long id);

}

