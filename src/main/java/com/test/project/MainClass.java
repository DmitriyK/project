package com.test.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainClass {

    @RequestMapping(value = "/he", method = RequestMethod.GET)
    public String abc(ModelMap model) {
        model.addAttribute("message", "hello world");
        return "hello";
    }
}
