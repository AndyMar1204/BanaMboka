package com.andy.banamboka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BanambokaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BanambokaApplication.class, args);

    }

    @GetMapping("/")
    public String home() {
        return "Bana Mboka 2022";
    }
}
