package org.launchcode.hellospringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class HelloController {

    /*
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }
    */

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    @RequestMapping(value= "hello", method= {RequestMethod.GET, RequestMethod.POST})
    public String hello(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloQueryWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

}
