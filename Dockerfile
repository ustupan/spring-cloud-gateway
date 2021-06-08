FROM openjdk:8
ARG DEPENDENCY=/workspace/app/target/dependency
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "docker"]
