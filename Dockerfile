# Use Java 21
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy everything
COPY . .

# Give execute permission to mvnw
RUN chmod +x mvnw

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose port (Render will map this automatically)
EXPOSE 8081

# Run the Spring Boot app
CMD ["java", "-jar", "target/movieapi-0.0.1-SNAPSHOT.jar"]
