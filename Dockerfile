FROM gradle:7-jdk11
EXPOSE 3010
ENTRYPOINT ["java", "-jar", "safecrop.jar"]


