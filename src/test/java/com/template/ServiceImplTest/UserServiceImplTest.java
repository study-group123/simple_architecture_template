package com.template.ServiceImplTest;

import javax.annotation.Resource;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.template.baseTest.AppBaseTest;
import com.template.entity.User;
import com.template.service.IUserService;


public class UserServiceImplTest extends AppBaseTest{

	//private static Logger logger = Logger.getLogger(UserServiceImplTest.class);  
	
	private Gson gson = new Gson();
    
	@Resource  
    private IUserService userService;
	
	
	@Test  
    public void test1() {  
        User user = userService.getUserById(1);  
        
        System.out.println("*********************"+gson.toJson(user));  
    }  
	
 

	
    
}