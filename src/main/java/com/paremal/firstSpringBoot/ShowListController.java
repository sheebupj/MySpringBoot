package com.paremal.firstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.paremal.firstSpringBoot.service.LoginService;
import com.paremal.firstSpringBoot.service.ShowList;


@Controller
public class ShowListController {
	
	@Autowired
	ShowList service;
	
	
	
	@RequestMapping ("/showlist" )
	public String showlist(ModelMap model) {
		
		model.put("list",service.getList());
		return "showlist";
	}

}
