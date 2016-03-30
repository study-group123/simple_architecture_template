package com.template.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/reagent")
public class LISMainController {
	private static Logger logger = Logger.getLogger(LISMainController.class);  

	
	
	@RequestMapping(value="/index")
    public ModelAndView Index() {  
        ModelAndView mv = new ModelAndView("index.ftl"); 
        mv.addObject("name", "王大锤");  
        return mv; 
    }
	
	@RequestMapping(value="/in_stock")
    public ModelAndView InStock() {  
        ModelAndView mv = new ModelAndView("index.ftl"); 
        mv.addObject("name", "王大锤");  
        return mv; 
    } 
	 	
	 	
}
