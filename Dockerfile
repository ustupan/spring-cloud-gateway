FROM openjdk:11
EXPOSE 8081
ARG JAR_FILE=target/api-gateway-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]