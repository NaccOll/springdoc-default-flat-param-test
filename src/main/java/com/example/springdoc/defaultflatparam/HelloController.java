package com.example.springdoc.defaultflatparam;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test1")
public class HelloController {

    @GetMapping
    public String test1(RequestObject object) {
        return null;
    }

    @PostMapping
    public String test2(@RequestBody RequestObject obj) {
        return null;
    }
}
