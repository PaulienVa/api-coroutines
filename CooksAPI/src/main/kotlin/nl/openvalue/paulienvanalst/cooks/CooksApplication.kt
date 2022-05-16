package nl.openvalue.paulienvanalst.cooks

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CooksApplication

fun main(args: Array<String>) {
    runApplication<CooksApplication>(*args)
}