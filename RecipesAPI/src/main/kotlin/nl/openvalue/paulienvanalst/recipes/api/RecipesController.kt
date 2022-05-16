package nl.openvalue.paulienvanalst.recipes.api

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/recipes")
class RecipesController {

    @GetMapping(
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun retrieveIngredients(): List<Recipe> {
        return listOf(
            Recipe("RE-PAN-001","pancakes", listOf("FL-001", "EG-003", "MI-001")),
            Recipe("RE-CAKE-021","cake", listOf("FL-001", "BU-001", "EG-003")),
        )
    }
}