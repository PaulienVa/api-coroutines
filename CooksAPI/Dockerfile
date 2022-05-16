FROM maven:3.8.5-openjdk-11 as builder

WORKDIR code

COPY pom.xml pom.xml
COPY ./CooksAPI/pom.xml cooks/pom.xml
COPY ./CooksAPI/src cooks/src

WORKDIR cooks

RUN mvn package
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM openjdk:11.0.15-slim as runner
ARG DEPENDENCY=/code/cooks/target/dependency
COPY --from=builder ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=builder ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=builder ${DEPENDENCY}/BOOT-INF/classes /app
EXPOSE 9091
ENTRYPOINT ["java","-cp","app:/app/lib/*","nl.openvalue.paulienvanalst.cooks.CooksApplicationKt"]


