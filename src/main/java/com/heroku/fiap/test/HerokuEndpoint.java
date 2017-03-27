package com.heroku.fiap.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuEndpoint {

    @RequestMapping(path = "/")
    public String hello25ASO() {
        return "Hello 25ASO from ariielm on Heroky PaaS ;)";
    }
}
