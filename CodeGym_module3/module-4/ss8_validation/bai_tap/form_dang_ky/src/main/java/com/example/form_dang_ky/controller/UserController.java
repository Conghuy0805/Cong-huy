package com.example.form_dang_ky.controller;

import com.example.form_dang_ky.model.User;
import com.example.form_dang_ky.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/form")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("")
    public String showListUser(Model model) {
        List<User> list = iUserService.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("user", new User());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute(name = "user") User user, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes, Model model) {
//        new User().validate(user, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("user", user);
            return "create";
        }
        iUserService.add(user);
        redirectAttributes.addFlashAttribute("mess", "1");
        return "redirect:/form";
    }
}
