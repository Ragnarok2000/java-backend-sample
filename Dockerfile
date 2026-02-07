# Use official Eclipse Temurin JDK image (Java 21)
FROM eclipse-temurin:21-jdk

WORKDIR /app
COPY . .

# Ensure mvnw is executable
RUN chmod +x mvnw

# Build the project
RUN ./mvnw clean install -DskipTests

# Run the JAR
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]