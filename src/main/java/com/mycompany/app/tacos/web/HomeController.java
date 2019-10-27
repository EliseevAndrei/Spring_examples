package com.mycompany.app.tacos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;


@Controller
public class HomeController {

    @GetMapping("/")
    public String getGreeting() {
        return "home";
    }

}
