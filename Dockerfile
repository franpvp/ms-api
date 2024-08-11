# Use an official Maven image to build the project
FROM maven:3.8.7-openjdk-21 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the project files to the container
COPY . .

# Build the Java application
RUN mvn clean package -DskipTests

# Use an official OpenJDK image to run the application
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the previous stage
COPY --from=build /app/target/*.jar /app/reactProject.jar

# Specify the command to run the JAR file
CMD ["java", "-jar", "/app/reactProject.jar"]

