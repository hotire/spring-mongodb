package com.github.hotire.springmongodb.ex

import org.springframework.data.annotation.Id

class Customer(
    @Id
    val id: String,
    val firstName: String,
    val lastName: String
)
