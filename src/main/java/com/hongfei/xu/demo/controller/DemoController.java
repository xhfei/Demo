package com.hongfei.xu.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class DemoController {
	
    private static final Log logger = LogFactory.getLog(DemoController.class);
    
	@RequestMapping(value = "/testget",method=RequestMethod.GET)
	public ModelAndView testget(HttpServletRequest request,@RequestParam(value="a",required=false)String a) {
		logger.info("=======testget======="+request.getQueryString());
		logger.info("a:"+a);
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "test get method!");
		mv.setViewName("hello");
		return mv; 
	}
	
	@RequestMapping(value = "/testpost",method=RequestMethod.POST)
	public ModelAndView testpost(HttpServletRequest request) {
		logger.info("=======testget======="+request.getQueryString());
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "test post method!");
		mv.setViewName("hello");
		return mv; 
	}
	
	@RequestMapping(value = "/testdelete",method=RequestMethod.DELETE)
	public ModelAndView testdelete(HttpServletRequest request) {
		logger.info("=======testdelete======="+request.getQueryString());
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "test delete method!");
		mv.setViewName("hello");
		return mv; 
	}
	
	@RequestMapping(value = "/testput",method=RequestMethod.PUT)
	public ModelAndView testput(HttpServletRequest request) {
		logger.info("=======testput======="+request.getQueryString());
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "test put method!");
		mv.setViewName("hello");
		return mv; 
	}
	
	@RequestMapping(value = "/testhead",method=RequestMethod.HEAD)
	public ModelAndView testhead(HttpServletRequest request) {
		logger.info("=======testhead======="+request.getQueryString());
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "test head method!");
		mv.setViewName("hello");
		return mv; 
	}
	
	@RequestMapping(value = "/testoptions",method=RequestMethod.OPTIONS)
	public ModelAndView testoptions(HttpServletRequest request) {
		logger.info("=======testoptions======="+request.getQueryString());
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "test options method!");
		mv.setViewName("hello");
		return mv; 
	}
	
	@RequestMapping(value = "/testtrace",method=RequestMethod.TRACE)
	public ModelAndView testtrace(HttpServletRequest request) {
		logger.info("=======testtrace======="+request.getQueryString());
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "test trace method!");
		mv.setViewName("hello");
		return mv; 
	}
	
	@RequestMapping(value = "/test")
	public ModelAndView test(HttpServletRequest request) {
		logger.info("=======test======="+request.getQueryString());
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "just test method!");
		mv.setViewName("hello");
		return mv; 
	}
}
