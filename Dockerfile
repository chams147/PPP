# Utiliser une image de base avec Java
FROM openjdk:17-jdk-slim AS base

# Ajouter l'application Spring Boot au conteneur
ARG JAR_FILE=target/*.jar
COPY target/calculator-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port que votre application utilise (par défaut, 8080 pour Spring Boot)
EXPOSE 9090

# Commande pour démarrer l'application
ENTRYPOINT ["java", "-jar", "/app.jar"]