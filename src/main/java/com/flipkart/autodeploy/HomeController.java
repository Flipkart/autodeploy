package com.flipkart.autodeploy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	  @RequestMapping("/home")
	    public ModelAndView home() {
	    	ModelAndView mv = new ModelAndView("home");
	    	return mv;
	    }
	    
	    @RequestMapping(value="/GetUserServlet",method=RequestMethod.GET)
	    @ResponseBody
	    public String manipulate(@RequestParam("userName")String userName) {
	    	System.out.println("Here in UserServlet");
	    	return "Manipulated "+userName;
	    }
	    
	    @RequestMapping("/settings")
	    public ModelAndView homeSettings() {
	    	
	    	ModelAndView mv = new ModelAndView("settings");
	    	return mv;
	    	
	    }
	
}
