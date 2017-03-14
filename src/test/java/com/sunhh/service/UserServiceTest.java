package com.sunhh.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sunhh.baseTest.SpringTestCase;
import com.sunhh.domain.User;

/** 
 * 功能概要：UserService单元测试 
 *  
 * @author sunhh 
 * @since  2017年3月14日  
 */  
public class UserServiceTest extends SpringTestCase {  
    @Autowired  
    private UserService userService;  
    Logger logger = Logger.getLogger(UserServiceTest.class);  
      
    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(10);  
        logger.debug("查找结果" + user);  
    }  
}  