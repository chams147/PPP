# Utiliser une image de base avec Java
FROM openjdk:17-jdk-slim AS base

# Ajouter l'application Spring Boot au conteneur
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Exposer le port que votre application utilise (par défaut, 8080 pour Spring Boot)
EXPOSE 8080

# Commande pour démarrer l'application
ENTRYPOINT ["java", "-jar", "/app.jar"]