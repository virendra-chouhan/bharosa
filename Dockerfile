FROM gradle:7-jdk11
VOLUME /tmp
ARG JAR_FILE
COPY $(JAR_FILE) test.jar
EXPOSE 3010
ENTRYPOINT ["java", "-jar", "/test.jar"]


