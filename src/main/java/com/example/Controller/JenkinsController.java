package com.example.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class JenkinsController {
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String requestMethodName(@RequestParam String param) {

        String rtStr = "test";

        return rtStr;
    }
    

}
