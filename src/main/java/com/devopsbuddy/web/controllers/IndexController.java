package com.devopsbuddy.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by adminuser on 7/6/17.
 */
@Controller
public class IndexController {

    /* The application logger*/
    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping("/")
    public String home(){
        LOG.info("home()");
        return "index";
    }
}
