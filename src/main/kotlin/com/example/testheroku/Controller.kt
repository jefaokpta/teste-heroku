package com.example.testheroku

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 03/07/2024
 */
@RestController
@RequestMapping("/api")
class Controller {

    @GetMapping
    fun hello() = "Hello Heroku em dev!"
}