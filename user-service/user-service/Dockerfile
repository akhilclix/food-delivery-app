# Use OpenJDK 17 as base image
FROM eclipse-temurin:21

# Add a label (optional)
LABEL maintainer="user-service"

# Add the JAR file into the image
COPY target/user-service-0.0.1-SNAPSHOT.jar user-service.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8081

# Run the JAR file
ENTRYPOINT ["java", "-jar", "user-service.jar"]
