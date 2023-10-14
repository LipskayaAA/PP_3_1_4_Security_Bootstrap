package ru.kata.spring.boot_security.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityAuthController {
    @RequestMapping(name = "/login")
    public String loginPage() {
        return "login";
    }

}