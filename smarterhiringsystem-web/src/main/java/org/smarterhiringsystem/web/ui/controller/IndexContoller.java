package org.smarterhiringsystem.web.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexContoller {

	@GetMapping(value= {"/","index"})
	public String indexPage() {
		return "index";
	}
}
