package br.com.ousadiasefeminices.portal.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("/admin/dashboard")
	public String dashboard(){
		return "admin/dashboard";
	}
	
}
