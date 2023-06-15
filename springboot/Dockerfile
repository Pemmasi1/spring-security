FROM openjdk:18.0-slim
EXPOSE 5010
ARG JAR_FILE=target/springboot-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]