FROM openjdk:11
COPY target/*.jar demomicro-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","demomicro-0.0.1-SNAPSHOT.jar"] CMD ["-start"]