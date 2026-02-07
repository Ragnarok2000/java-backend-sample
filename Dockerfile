# Use official OpenJDK image
FROM openjdk:21-jdk

# Set working directory inside container
WORKDIR /app

# Copy everything from repo into container
COPY . .

# Build the project with Maven wrapper
RUN ./mvnw clean install -DskipTests

# Run the JAR file
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]