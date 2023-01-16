package com.example.eurekaclient.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/main")
class TestController {

    @Value("\${eureka.instance.instance-id}")
    private lateinit var id: String

    @GetMapping("/test")
    fun test(): String {
        return id
    }
}