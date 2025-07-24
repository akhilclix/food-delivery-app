# Use OpenJDK 17 as base image
FROM eclipse-temurin:21

# Add a label (optional)
LABEL maintainer="restaurant-service"

# Add the JAR file into the image
COPY target/restaurant-service-0.0.1-SNAPSHOT.jar restaurant-service.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "restaurant-service.jar"]
