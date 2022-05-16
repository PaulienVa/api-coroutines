package nl.openvalue.paulienvanalst.ingredients.api

import nl.openvalue.paulienvanalst.ingredients.api.UnitOfMeasure.*
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/ingredients")
class IngredientsController {

    @GetMapping(
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun retrieveIngredients(): List<Ingredient> {
        return listOf(
            Ingredient("flour", KG),
            Ingredient("milk", L),
            Ingredient("salt", THEASPOON),
            Ingredient("sugar", TABLESPOON)
        )
    }
}