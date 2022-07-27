package com.github.hotire.springmongodb.ex

import org.springframework.data.mongodb.repository.MongoRepository

interface CustomerRepository : MongoRepository<Customer, String> {
    fun findByFirstName(firstName: String): Customer?
}
