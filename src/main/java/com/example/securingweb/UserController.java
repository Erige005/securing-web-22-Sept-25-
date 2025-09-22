package com.example.securingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String adminPage() {
        return "hello"; // trỏ tới admin.html trong templates
    }
}
