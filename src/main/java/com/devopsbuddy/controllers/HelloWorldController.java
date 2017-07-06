package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by adminuser on 7/6/17.
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }

}
