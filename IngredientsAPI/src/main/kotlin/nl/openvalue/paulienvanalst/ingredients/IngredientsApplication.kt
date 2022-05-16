package nl.openvalue.paulienvanalst.ingredients

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class IngredientsApplication

fun main(args: Array<String>) {
    runApplication<IngredientsApplication>(*args)
}