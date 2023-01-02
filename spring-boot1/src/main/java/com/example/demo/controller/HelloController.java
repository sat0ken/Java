package com.example.demo.controller;

import com.example.demo.model.Inquiry;
import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(@ModelAttribute Inquiry inquiry) {
        return "index";
    }

    @PostMapping("/")
    public String confirm(@Validated @ModelAttribute Inquiry inquiry, BindingResult result) {
        if (result.hasErrors()) {
            return "index";
        }
        return "confirm";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(required = false)String message, Model model) {
        model.addAttribute("sample", message);
        return "hello";
    }

//    @PostMapping("/confirm")
//    public String confirm(@RequestParam String message, Model model) {
//        model.addAttribute("message", message);
//        return "confirm";
//    }

    @GetMapping("/form")
    private String readForm(@ModelAttribute User user) {
        return "form";
    }

    @PostMapping("/form")
    private String postForm(@ModelAttribute User user) {
        return "confirm";
    }
}
