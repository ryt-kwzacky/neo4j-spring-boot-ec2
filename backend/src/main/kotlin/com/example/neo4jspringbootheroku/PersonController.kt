package com.example.neo4jspringbootheroku

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
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

    @GetMapping("/get")
    fun getMovies(): List<Person.DTO> {
        LOGGER.info("test!!!!!!!!!!!!!!!!!!!!!")
        // データの変換などアプリケーション的な手続きはユースケース層でやるようにする。
        return personRepository.findAll().map { it.toDTO() }
    }

    @PostMapping("/post")
    fun create(@RequestBody newPerson: Person): Person {
        return personRepository.save(newPerson)
    }

    @PostMapping("/remove")
    fun remove(@RequestBody id: String) {
        return personRepository.deleteById(id)
    }
}
