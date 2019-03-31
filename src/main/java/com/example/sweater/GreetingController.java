package com.example.sweater;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World")
                                       String name, Map<String,Object> model) {
        model.put("name", name);
        return "greeting";
    }
    @GetMapping
    public String main(Map <String,Object> model){
        model.put("some","hello, let's Code!");
        model.put("second","вроде поняла, как это работает");
        return "main";
    }

    @GetMapping("/another")
    public String my(@RequestParam(name="sex", required=false, defaultValue="male")
                                   String sex, Map<String,Object> model) {
        model.put("sex", sex);
        return "sex";
    }

}