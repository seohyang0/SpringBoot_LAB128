package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableSpaceController {

	@RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}