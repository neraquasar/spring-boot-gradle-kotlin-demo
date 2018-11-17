package org.neraquasar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/rest")
    public String rest(@RequestParam(value = "name", required = false, defaultValue = "Aa") String name) {
        return "qwerty " + name;
    }
}
