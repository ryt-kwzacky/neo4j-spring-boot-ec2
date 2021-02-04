package com.example.neo4jspringbootheroku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Neo4jSpringBootHerokuApplication

fun main(args: Array<String>) {
	runApplication<Neo4jSpringBootHerokuApplication>(*args)
}
