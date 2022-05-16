package nl.openvalue.paulienvanalst.cooks.api

data class Cook(val name: String, val age: Int, val levelOfExperience: LevelOfExperience)

enum class LevelOfExperience {
    BEGINNER, INTERMEDIATE, ADVANCED
}