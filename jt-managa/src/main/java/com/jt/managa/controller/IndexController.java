package com.jt.managa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/page/{moduleName}")
    public String index(@PathVariable String moduleName) {
        return moduleName;
    }

}
