FROM openjdk:8
ADD target/api-gateway-service.jar api-gateway-service.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "docker
