package fgiaquintaruiz.dev.unitvsintegration.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name){
        return String.format("Hello, %s", name);
    }
}
