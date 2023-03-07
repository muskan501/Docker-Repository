FROM openjdk:11
EXPOSE 8080
ADD target/DockerProject-0.0.1-SNAPSHOT.jar DockerProject-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","/DockerProject-0.0.1-SNAPSHOT.jar"]