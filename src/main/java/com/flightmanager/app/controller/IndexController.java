package com.flightmanager.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Darius Gaurilka
 **/

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
