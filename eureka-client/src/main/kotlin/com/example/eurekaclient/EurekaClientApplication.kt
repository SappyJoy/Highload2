package com.example.eurekaclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EurekaClientApplication

fun main(args: Array<String>) {
	runApplication<EurekaClientApplication>(*args)
}
