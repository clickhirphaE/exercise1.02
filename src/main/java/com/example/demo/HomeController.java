package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String passingVariable(Model model){
        model.addAttribute("myvar1","the first variable passed to the template!");
        model.addAttribute("myvar2","the second variable passed to the template!");
        return "Hometemplate";

    }
}
