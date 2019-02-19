package com.example.webjava;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StartController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false,
            defaultValue="Arnur") String name, Map<String, Object> model)
    {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(@RequestParam(name="name", required=false,
            defaultValue="Arnur") String name, Map<String, Object> model)
    {
        model.put("name", name);
        return "main";
    }
    @RequestMapping("/toCheckPage")
    public String redirect(){
        return ("check");
    }
    @RequestMapping("/gpo")
    public String redirectToGpo(){
        return("gpo");
    }
    @RequestMapping("/results")
    public String redirectToResults(){
        return("results");
    }
    @RequestMapping("/toMain")
    public String redirectToMain(){
        return("main");
    }

}