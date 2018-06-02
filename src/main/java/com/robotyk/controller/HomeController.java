package com.robotyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Robotyk on 2018-06-01.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showMainPage() {
        return "index";
    }
}
