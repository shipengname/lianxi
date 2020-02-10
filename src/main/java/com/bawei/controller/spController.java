package com.bawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class spController {
	
	@RequestMapping("zy")
	public String zy() {
		return "list";
	}
}
