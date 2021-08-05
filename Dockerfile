FROM gradle:7-jdk11
ADD build/libs/bharosa_safecrop_be_0.1-0.0.1-SNAPSHOT.jar bharosa_safecrop_be_0.1-0.0.1-SNAPSHOT.jar
EXPOSE 3010
ENTRYPOINT ["java", "-jar", "safecrop.jar"]


