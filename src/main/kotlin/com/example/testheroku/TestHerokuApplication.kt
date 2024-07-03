package com.example.testheroku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestHerokuApplication

fun main(args: Array<String>) {
    runApplication<TestHerokuApplication>(*args)
}
