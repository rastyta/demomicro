FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demomicro-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","demomicro-0.0.1-SNAPSHOT.jar"] CMD ["-start"]