package com.schmauder

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KotlinSpringExampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringExampleApplication::class.java, *args)
}
