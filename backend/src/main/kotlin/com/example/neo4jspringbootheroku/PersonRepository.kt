package com.example.neo4jspringbootheroku

import org.springframework.data.neo4j.repository.Neo4jRepository

interface PersonRepository: Neo4jRepository<Person, String> {
    fun findOneByName(name: String): Person
}
