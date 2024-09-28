package com.example.demo.minus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;

@Controller
@RequestMapping("/minus")
public class MinusController {

    @Autowired
    private MinusService minusService;

    @GetMapping
    public String minus() {
        return "minus";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2,
                            Model model) {
        int result = minusService.subtract(num1, num2);
        model.addAttribute("result", result);
        return "minus";
    }
}
