# Use an official Maven image with Java 17
FROM maven:3.8.6-openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the project files into the container
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package

# Create a new image with just the JRE and your JAR file
FROM adoptopenjdk:17-jre-hotspot-focal

# Set the working directory
WORKDIR /app

# Copy the JAR file from the previous stage
COPY --from=build /app/target/westerholmbookstore-0.0.1-SNAPSHOT.jar .

# Expose the port your application listens on (default is 8080)
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "westerholmbookstore-0.0.1-SNAPSHOT.jar"]
