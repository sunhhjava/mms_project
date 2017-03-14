package com.sunhh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunhh.dao.UserDao;
import com.sunhh.domain.User;
import com.sunhh.service.UserService;

/** 
 * 功能概要：UserService实现类 
 *  
 * @author sunhh 
 * @since  2017年3月14日  
 */  
@Service  
public class UserServiceImpl implements UserService{  
    @Autowired  
    private UserDao userDao;  
  
    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    }  
  
}
