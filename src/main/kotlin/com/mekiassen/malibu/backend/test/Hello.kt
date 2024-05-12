package com.mekiassen.malibu.backend.test

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping
class Hello {

    @GetMapping("/hello")
    fun helloWorld() = "Hello world";
}