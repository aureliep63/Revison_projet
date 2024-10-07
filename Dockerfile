# Utiliser une image de base contenant JDK
FROM openjdk:11-jre-slim

# Créer un répertoire de travail dans l'image Docker
WORKDIR /app

# Copier le JAR généré dans l'image Docker
COPY target/StringProcessor.jar /app/StringProcessor.jar

# Spécifier la commande à exécuter pour démarrer l'application
ENTRYPOINT ["java", "-jar", "StringProcessor.jar"]
