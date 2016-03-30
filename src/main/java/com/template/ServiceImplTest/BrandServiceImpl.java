package com.template.ServiceImplTest;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.template.dao.IBrandDao;
import com.template.entity.Brand;
import com.template.service.IBrandService;

@Service("brandService")  
public class BrandServiceImpl implements IBrandService{

	@Resource    
    private IBrandDao brandDao;

	public Brand getBranById(long brandId) {
		return brandDao.selectByPrimaryKey(brandId);
	} 
	
	

	
    
}