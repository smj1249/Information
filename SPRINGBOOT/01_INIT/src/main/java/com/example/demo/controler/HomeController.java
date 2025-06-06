package com.example.demo.controler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping(value = "/")
    public String home(){

        log.info("GET /");
        return "index";
    }
}
