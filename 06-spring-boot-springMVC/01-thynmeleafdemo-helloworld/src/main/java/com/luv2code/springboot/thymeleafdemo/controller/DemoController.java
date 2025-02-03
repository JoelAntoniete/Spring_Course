package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model theModel){
        //o valor theDate do atributo é o mesmo que temos que colocar no html ${theDate}
        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
        return "Helloworld";
    }

}
