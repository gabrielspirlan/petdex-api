FROM eclipse-temurin:21

COPY . .
RUN mvn clean install
COPY --from=build /target/deploy_render-1.0.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]