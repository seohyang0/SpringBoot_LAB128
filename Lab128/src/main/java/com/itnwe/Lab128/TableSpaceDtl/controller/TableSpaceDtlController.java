package com.itnwe.Lab128.TableSpaceDtl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //컨트롤러 선언
public class TableSpaceDtlController {
	@RequestMapping("/TableSpaceDtl")
    public String index() {
		return "TableSpaceDtl"; // tamplates/index.html
    }
}
