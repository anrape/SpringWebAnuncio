
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {
    public static final String INDEX_VIEW = "index";

    @GetMapping("/index")
    public String indexString() {
	System.out.println("hola");
	return INDEX_VIEW;
    }

    @GetMapping("/indexMAV")
    public ModelAndView indexMAV() {
	return new ModelAndView(INDEX_VIEW);
    }
}
