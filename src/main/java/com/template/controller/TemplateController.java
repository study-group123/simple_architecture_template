package com.template.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.template.entity.User;
import com.template.service.IUserService;

@Controller
public class TemplateController {
	private static Logger logger = Logger.getLogger(TemplateController.class);  

	/*@Resource  
    private IUserService userService;
	
	@RequestMapping(value="/service",method=RequestMethod.GET)  
    public void test1() {  
        User user = userService.getUserById(1);  
        
        System.out.println(new Gson().toJson(user));  
    }  
	 	
	
	@RequestMapping(value="/index",method=RequestMethod.GET)   
    public ModelAndView getFirstPage() {  
        ModelAndView mv = new ModelAndView(); 
        mv.setViewName("template.ftl"); 
        mv.addObject("name", "王大锤");  
        return mv;  
    } */
	
	@RequestMapping(value="/template",method=RequestMethod.GET)   
    public ModelAndView getFirstPage() {  
        ModelAndView mv = new ModelAndView(); 
        mv.setViewName("template.ftl"); 
        mv.addObject("name", "王大锤");  
        logger.info("##########################");
        return mv;  
    } 
	 	
	 	
}
