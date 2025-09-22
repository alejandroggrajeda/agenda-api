FROM gradle:8.3-jdk21 AS builder
WORKDIR /app
COPY . /app
RUN gradle clean build --no-daemon
FROM openjdk:21-jdk-slim
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar /app/agenda.jar
EXPOSE 8080
CMD ["java", "-jar", "agenda.jar"]
