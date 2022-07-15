package com.github.hotire.springmongodb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringMongodbApplication

fun main(args: Array<String>) {
    runApplication<SpringMongodbApplication>(*args)
}
