# Étape de build avec Maven
FROM maven:3.8.1 AS build
WORKDIR /app
COPY . /app
RUN mvn clean install -DskipTests

# Étape de runtime avec OpenJDK
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copier l'artefact généré depuis l'étape de build
COPY --from=build /app/target/gestion-employes-0.0.1-SNAPSHOT.jar gestion-employes.jar

# Exécuter l'application
CMD ["java", "-jar", "gestion-employes.jar"]

# Exposer le port 8086
EXPOSE 8086
