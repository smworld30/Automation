package com.pepsico.etools.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping(value = {"index.do"},method = {org.springframework.web.bind.annotation.RequestMethod.GET})
		public String homeView() {
			
			return "home";
			
		}

}
