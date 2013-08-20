package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.imaginea.Hibernate.*;
 
@Controller
@RequestMapping("/trail")
public class TrailController {
 
	@RequestMapping(method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		Cric cric = new Cric();
		CreateTables create = new CreateTables();
		create.createTables();
		model.addAttribute("message", "Maven Web Project + Spring 3 MVC - welcome()...");
		model.addAttribute("BallResults", cric.returnBallResults());
		model.addAttribute("BatResults", cric.returnBatResults());
		model.addAttribute("Team1",cric.returnTeam1());
		model.addAttribute("Team2",cric.returnTeam2());
		return "trail";
	}
}

