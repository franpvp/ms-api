# Use an official OpenJDK image to run the application
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the previous stage
COPY target/*.jar reactProject.jar

EXPOSE 3050
# Specify the command to run the JAR file
CMD ["java", "-jar", "reactProject.jar"]

