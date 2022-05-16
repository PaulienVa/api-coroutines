package nl.openvalue.paulienvanalst.ingredients.api

data class Ingredient(val name: String, val unitOfMeasure: UnitOfMeasure)

enum class UnitOfMeasure {
    L, KG, THEASPOON, TABLESPOON
}