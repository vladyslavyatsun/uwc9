package com.uwc9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dog on 3/18/16.
 */
@Controller
public class Main {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(){
        return "index";
    }
}
