FROM eclipse-temurin:21 AS build

COPY . .
RUN mvn clean install -DskipTests

FROM eclipse-temurin:21

EXPOSE 8080

COPY --from=build /target/deploy_render-1.0.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]