package com.example.neo4jspringbootheroku

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node

@Node("Person")
class Person(
    @field:Id
    val name: String,
    private val born: Int?
)
