FROM openjdk:8
ARG DEPENDENCY=/workspace/app/target/dependency
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker"]
