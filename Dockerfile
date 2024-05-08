FROM openjdk:17

WORKDIR /app

# Copy the JAR file from the local system to the Docker image
COPY target/achat-1.0.jar /app/app.jar

EXPOSE 8089

ENTRYPOINT ["java", "-jar", "app.jar"]
