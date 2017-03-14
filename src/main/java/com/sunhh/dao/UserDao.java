package com.sunhh.dao;

import com.sunhh.domain.User;

/** 
 * 功能概要：User的DAO类 
 *  
 * @author sunhh
 * @since 2017年3月14日 
 */  
public interface UserDao {  
    /** 
     *  
     * @author sunhh 
     * @since 2017年3月14日 
     * @param userId 
     * @return 
     */  
    public User selectUserById(Integer userId);  
  
}  