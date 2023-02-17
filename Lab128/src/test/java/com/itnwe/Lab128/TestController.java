package com.itnwe.Lab128;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value="/TableSpace")
	public String TableSpace() {
		return "TableSpace.html";
	}
}
