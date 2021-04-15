package com.ram.orders.processorders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/wish")
public class HelloController {

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello Mr./Ms. "+name;
    }

    @GetMapping("/v1")
    public String v1() {
        return "Returning from v1";
    }

    @GetMapping("/v2")
    public String v2() {
        return "Returning from v2";
    }
}
