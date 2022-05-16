FROM maven:3.8.5-openjdk-11 as builder

WORKDIR code

COPY pom.xml pom.xml
COPY ./IngredientsAPI/pom.xml ingredients/pom.xml
COPY ./IngredientsAPI/src ingredients/src

WORKDIR ingredients

RUN mvn package
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM openjdk:11.0.15-slim as runner
ARG DEPENDENCY=/code/ingredients/target/dependency
COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app

EXPOSE 9092

ENTRYPOINT ["java","-cp","app:/app/lib/*","nl.openvalue.paulienvanalst.ingredients.IngredientsApplicationKt"]


