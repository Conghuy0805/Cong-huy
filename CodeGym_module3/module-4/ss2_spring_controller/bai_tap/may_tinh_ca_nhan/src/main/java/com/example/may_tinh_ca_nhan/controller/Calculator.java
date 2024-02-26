package com.example.may_tinh_ca_nhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator {
    @RequestMapping("/caculator")
    public String calculate(Model model, @RequestParam(name = "num1", defaultValue = "0") double num1, @RequestParam(name = "num2", defaultValue = "0") double num2, @RequestParam(name = "calculation", defaultValue = "") String cal) {
        double result = 0;
        switch (cal) {
            case "Addition(+)":
                result = num1 + num2;
                cal = "Addition";
                break;
            case "Subtraction(-)":
                result = num1 - num2;
                cal = "Subtraction";
                break;
            case "Multiplication(X)":
                result = num1 * num2;
                cal = "Multiplication";
                break;
            case "Division(/)":
                result = num1 / num2;
                cal = "Division";
                break;
        }
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("cal", cal);
        model.addAttribute("result", result);
        return "index";
    }
}
