package com.example.neo4jspringbootheroku

import org.neo4j.driver.AuthTokens
import org.neo4j.driver.Driver
import org.neo4j.driver.GraphDatabase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.neo4j.config.AbstractNeo4jConfig
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableTransactionManagement
@EnableNeo4jRepositories
class Neo4jConfig: AbstractNeo4jConfig() {
    @Bean
    override fun driver(): Driver {
        return GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j","neo4j-heroku"))
    }
}
