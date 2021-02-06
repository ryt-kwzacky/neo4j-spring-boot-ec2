package com.example.neo4jspringbootheroku

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/people")
class PersonController(
    @Autowired private val personRepository: PersonRepository
) {
    companion object {
        private val LOGGER = LoggerFactory.getLogger(this::class.java)
    }

    @GetMapping(value = ["", "/"])
    fun getMovies(): String {
        LOGGER.info("test!!!!!!!!!!!!!!!!!!!!!")
        (personRepository.findAll().map { LOGGER.info(it.name) })
        val test = personRepository.findAll()
        return test.first().name
    }
}
