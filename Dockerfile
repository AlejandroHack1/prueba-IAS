FROM gradle:8.10-jdk AS builder

WORKDIR /app

COPY settings.gradle build.gradle gradlew ./

COPY . .

RUN ./gradlew clean build --info || true

FROM openjdk:18-alpine

WORKDIR /app

COPY --from=builder /app/applications/app-service/build/libs/app-service.jar /app/app.jar

EXPOSE 8787

ENTRYPOINT ["java", "-jar", "/app/app.jar"]