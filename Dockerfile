FROM openjdk:8-jre-alpine
WORKDIR /tmp
COPY build/libs/process-orders-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]