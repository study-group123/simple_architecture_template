package com.template.ServiceImplTest;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.template.dao.IUserDao;
import com.template.entity.User;
import com.template.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService{

	@Resource    
    private IUserDao userDao; 
	
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
    
}