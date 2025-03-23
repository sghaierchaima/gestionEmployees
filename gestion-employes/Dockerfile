# Étape 1: Utilisation de l'image Maven pour construire l'application
FROM maven:3.8.1-jdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

# Étape 2: Construction de l'image avec OpenJDK 17
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/gestion-employes-0.0.1-SNAPSHOT.jar gestion-employes.jar

# Commande pour démarrer l'application
CMD ["java", "-jar", "gestion-employes.jar"]

# Exposer le port de l'application Spring Boot
EXPOSE 8080
