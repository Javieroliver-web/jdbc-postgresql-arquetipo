FROM maven:3.9.6-eclipse-temurin-25 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución
FROM eclipse-temurin:25-jdk
WORKDIR /app
# Copia el jar con dependencias generado por el assembly plugin
COPY --from=build /app/target/*-jar-with-dependencies.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]



