package com.example.webjava;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/check")
    public String showForm(PersonForm personForm)
    {
        return "form";
    }

    @PostMapping("/check")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "results";
    }
    @RequestMapping("/redirect")
    public String redirect(@RequestParam(name="name", required=false,defaultValue="Arnur") String name, Map<String, Object> model){
        model.put("name", name);
        return ("greeting");
    }




}