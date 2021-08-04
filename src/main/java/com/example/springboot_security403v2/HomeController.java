package com.example.springboot_security403v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/secure")
    public String secure(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("user", userRepository.findByUsername(username));
        return "secure";

    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/course")
    public String coursePage() {
        return "course";
    }
    @RequestMapping("/admin")
    public String teacherPage() {
        return "admin";
    }
    @RequestMapping("/student")
    public String studenPage() {
        return "student";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/logout")
    public String logout() {
        return  "redirect:/login?logout=true";
    }
}
