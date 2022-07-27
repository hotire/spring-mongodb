package com.github.hotire.springmongodb.ex

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
internal class CustomerRepositoryTest(private val customerRepository: CustomerRepository) {

    @Test
    fun findByFirstName() {
        val result = customerRepository.findByFirstName("ho")
    }
}