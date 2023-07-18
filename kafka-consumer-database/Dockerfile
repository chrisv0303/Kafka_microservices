FROM openjdk:20
VOLUME /tmp
EXPOSE 8081
ARG JAR_FILE=target/kafka-consumer-database-docker.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]