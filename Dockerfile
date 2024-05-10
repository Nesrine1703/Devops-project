# Use AdoptOpenJDK 17 as base image
FROM openjdk:17
  
  # Set working directory inside the container
WORKDIR /app
  
  # Copy the compiled JAR file and application.properties into the container
COPY target/achat-1.0.jar /app/
COPY src/main/resources/application.properties /app/
  
  # Expose port 8089
EXPOSE 8089
  
  # Command to run the application
CMD ["java", "-jar", "achat-1.0.jar"]
