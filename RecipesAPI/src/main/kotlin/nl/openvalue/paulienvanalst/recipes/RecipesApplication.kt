package nl.openvalue.paulienvanalst.recipes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class RecipesApplication

fun main(args: Array<String>) {
    runApplication<RecipesApplication>(*args)
}