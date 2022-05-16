# Three different kind of endpoints

Three api's are build in this project:

- cooksAPI exposing all the cooks on port 9091
- recipesAPI exposing all the recipes on port 9092
- ingredientsAPI exposing all the ingredients on port 9093

## Different endpoints:

CooksAPI:
`GET http://localhost:9091/cooks`

RecipesAPI:
`GET http://localhost:9092/recipes`

IngredientsAPI:
`GET http://localhost:9092/ingredients`
`GET http://localhost:9092/ingredients/{{identifier}}`

## Run it all together

```shell
docker-compose up --build
```

Bring everything down
```shell
docker-compose down
```

