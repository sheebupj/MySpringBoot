package com.paremal.firstSpringBoot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ShowList {
	static List<String> names;
	static {
		names= new ArrayList<String>();
		names.add("Sheebu");
		names.add("merin");
		names.add("rameeha");
		
	}
	public List<String> getList(){
		return names;
	}

}
