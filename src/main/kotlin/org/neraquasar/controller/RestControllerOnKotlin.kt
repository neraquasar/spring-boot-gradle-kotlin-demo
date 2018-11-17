package org.neraquasar.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RestControllerOnKotlin {

    @RequestMapping("rest-kotlin")
    fun rest(@RequestParam(value = "name", required = false, defaultValue = "qqq") name: String): String {
        return "zxcvb $name"
    }
}
