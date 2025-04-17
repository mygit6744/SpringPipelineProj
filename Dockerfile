FROM openjdk:21-jdk
EXPOSE 9091
ADD target/SpringPipelineProj-0.0.1-SNAPSHOT.jar SpringPipelineProj-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringPipelineProj-0.0.1-SNAPSHOT.jar"]