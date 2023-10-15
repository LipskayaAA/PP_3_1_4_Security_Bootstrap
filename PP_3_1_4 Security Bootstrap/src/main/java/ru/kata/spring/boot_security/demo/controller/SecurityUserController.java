package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class SecurityUserController {

    @GetMapping(value = "/login")
    public String loginPage() {
        return "user/login";
    }

    @GetMapping("/")
    public String show(@AuthenticationPrincipal User user, ModelMap model) {
        model.addAttribute("user", user);
        return "user/user_page";
    }
}