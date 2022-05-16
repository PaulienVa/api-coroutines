package nl.openvalue.paulienvanalst.ingredients.api

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import nl.openvalue.paulienvanalst.ingredients.api.UnitOfMeasure.*
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController("/ingredients")
class IngredientsController {

    @GetMapping(
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun retrieveIngredients(): List<Ingredient> {
        return listOf(
            Ingredient("FL-001","flour", KG),
            Ingredient("MI-001","milk", L),
            Ingredient("SA-011","salt", THEASPOON),
            Ingredient("SU-003","sugar", TABLESPOON)
        )
    }

    @GetMapping(
        path = ["ingredients/{identifier}"],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun retrieveIngredient(@PathVariable("identifier") identifier: String): Ingredient {
        val ingredients = listOf(
            Ingredient("FL-001","flour", KG),
            Ingredient("MI-001","milk", L),
            Ingredient("SA-011","salt", THEASPOON),
            Ingredient("SU-003","sugar", TABLESPOON),
            Ingredient("EG-001","eggs", NR),
            Ingredient("BU-001","butter", KG)
        )

        return runBlocking {
            delay(100)
            return@runBlocking ingredients.first { it.identifier == identifier }
        }
    }
}