FROM gradle:7-jdk11
VOLUME /tmp
ARG JAR_FILE
COPY $(JAR_FILE) bharosa_safecrop_be_0.1-0.0.1-SNAPSHOT.jar
EXPOSE 3010
ENTRYPOINT ["java", "-jar", "/bharosa_safecrop_be_0.1-0.0.1-SNAPSHOT.jar"]


