package nl.openvalue.paulienvanalst.recipes.api

data class Recipe(
    val identifier: String,
    val name: String,
    val ingredients: List<String>
)