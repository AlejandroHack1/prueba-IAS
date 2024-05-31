FROM gradle:7.4.0-jdk-alpine as builder

WORKDIR /app

COPY settings.gradle build.gradle gradlew ./

COPY . .

RUN ./gradlew clean build

FROM openjdk:17-alpine

WORKDIR /app

COPY --from=builder /app/applications/app-service/build/libs/app-service.jar /app/app.jar

EXPOSE 8787

ENTRYPOINT ["java", "-jar", "/app/app.jar"]