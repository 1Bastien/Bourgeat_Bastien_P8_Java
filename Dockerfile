FROM openjdk:17-jdk-alpine

WORKDIR /TourGuide

# Copie du JAR principal de votre application
COPY target/TourGuide.jar TourGuide.jar

# Copie des fichiers JAR externes depuis le répertoire 'libs'
COPY libs/gpsUtils.jar libs/RewardCentral.jar libs/TripPricer.jar libs/

ENTRYPOINT ["java", "-jar", "TourGuide.jar"]
