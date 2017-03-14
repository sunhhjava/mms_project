package com.sunhh.service;

import com.sunhh.domain.User;

/** 
 * 功能概要：UserService接口类 
 *  
 * @author sunhh 
 * @since  2017年3月14日  
 */  
public interface UserService {  
    User selectUserById(Integer userId);  
  
}  