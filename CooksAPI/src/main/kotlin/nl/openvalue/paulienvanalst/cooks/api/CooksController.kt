package nl.openvalue.paulienvanalst.cooks.api

import nl.openvalue.paulienvanalst.cooks.api.LevelOfExperience.*
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cooks")
class CooksController {

    @GetMapping(
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun retrieveCooks(): List<Cook> {
        return listOf(
            Cook("Gordon Ramsey", 53, ADVANCED),
            Cook("Peter Pan", 12, BEGINNER),
            Cook("Jane Doe", 24, INTERMEDIATE),
            Cook("Captain Hook", 55, BEGINNER),
            Cook("Marry Poppins", 24, INTERMEDIATE),
        )
    }
}