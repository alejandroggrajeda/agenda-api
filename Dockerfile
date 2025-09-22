FROM openjdk:21-jdk-slim
WORKDIR /app
COPY build/libs/*.jar /app/agenda.jar
EXPOSE 8080
CMD ["java", "-jar", "agenda.jar"]
