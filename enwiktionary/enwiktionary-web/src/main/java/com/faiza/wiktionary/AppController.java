package com.faiza.wiktionary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@RequestMapping(value = {"/", "/word/*", 
			"/about", "/contact",
			"/user"}, method = RequestMethod.GET)
	public String welcome (ModelMap model) {
		return "index";
	}
}
