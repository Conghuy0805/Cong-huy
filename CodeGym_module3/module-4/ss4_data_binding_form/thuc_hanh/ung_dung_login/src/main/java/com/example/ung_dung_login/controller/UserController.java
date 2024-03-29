package com.example.ung_dung_login.controller;

import com.example.ung_dung_login.dto.UserDTO;
import com.example.ung_dung_login.model.Login;
import com.example.ung_dung_login.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home", "login", new Login());
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = UserDTO.checkLogin(login);
        if (user==null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }else{
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
}
