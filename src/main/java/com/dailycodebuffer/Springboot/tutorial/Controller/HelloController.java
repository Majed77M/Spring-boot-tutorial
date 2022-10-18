package com.dailycodebuffer.Springboot.tutorial.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {
   // @RequestMapping(value = "/", method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping("/")
    public String helloworld(){
        return "Welcome to dailyCodeBuffer!! MAJED";
    }
}
