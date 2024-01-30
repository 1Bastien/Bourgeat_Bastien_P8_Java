FROM maven:3.9.6-eclipse-temurin-17-alpine

WORKDIR /TourGuide

COPY target/tourguide-1.0.0.jar TourGuide.jar

ENTRYPOINT ["java", "-jar", "TourGuide.jar"]
