package com.template.ServiceImplTest;

import javax.annotation.Resource;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.template.baseTest.AppBaseTest;
import com.template.entity.Brand;
import com.template.service.IBrandService;


public class BrandServiceImplTest extends AppBaseTest{

	//private static Logger logger = Logger.getLogger(UserServiceImplTest.class);  
	
	private Gson gson = new Gson();
    
	
	@Resource  
    private IBrandService brandService;
	
	
	@Test  
    public void test2() {  
		Brand brand = brandService.getBranById(85);  
        
		logger.info("*********************"+gson.toJson(brand));  
    }  

	
    
}