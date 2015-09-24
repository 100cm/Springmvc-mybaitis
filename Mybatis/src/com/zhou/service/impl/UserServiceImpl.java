package com.zhou.service.impl;

import com.zhou.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zhou.dao.UserDAO;
import com.zhou.service.UserService;
 
 
 
@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    @Qualifier("userDAO")
    private UserDAO userDAO;
     
    public int insertUser(Users users) {
        // TODO Auto-generated method stub
        return userDAO.insertUser(users);
    }

    @Override
    public int updateUser() {
        return userDAO.updateUser();
    }

}