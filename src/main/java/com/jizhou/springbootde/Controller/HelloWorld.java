package com.jizhou.springbootde.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloWorld {
    //@RequestMapping(value = "/Hello",method = RequestMethod.GET)
    @GetMapping("/Hello")
    public String Hello() {
        return "Hello World!";
    }

    @GetMapping("/Person")
    public Object getPerson(){
        Map<String,Object> person = new HashMap<>();
        person.put("name","Leo");
        person.put("age",18);
        return person;
    }
}
