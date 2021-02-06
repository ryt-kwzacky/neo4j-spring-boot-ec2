package com.example.neo4jspringbootheroku

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node

@Node("Person")
class Person(
    @Id
    val id: String,
    private val name: String,
    private val born: String?
) {

    fun toDTO(): DTO = DTO(
        id = this.id,
        name = this.name,
        born = this.born
    )

    data class DTO(
        val id: String,
        val name: String,
        val born: String?
    )
}
