FROM amazoncorretto:17
EXPOSE 8080
ADD target/aws-gitflow-SNAPSHOT.jar aws-gitflow-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/aws-gitflow-SNAPSHOT.jar"]