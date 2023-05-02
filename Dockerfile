FROM amazoncorretto:17
EXPOSE 8080
ADD target/aws-gitflow.jar aws-gitflow.jar
ENTRYPOINT ["java", "-jar", "/aws-gitflow.jar"]