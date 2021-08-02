package com.example.springboot_security403v2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/course")
    public String coursePage() {
        return "course";
    }
    @RequestMapping("/teacher")
    public String teacherPage() {
        return "teacher";
    }
    @RequestMapping("/student")
    public String studenPage() {
        return "student";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
