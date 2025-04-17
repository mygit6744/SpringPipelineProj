FROM openjdk:21-jdk
EXPOSE 9091
ADD target/SpringPipelineProj.jar SpringPipelineProj.jar
ENTRYPOINT ["java","-jar","/SpringPipelineProj.jar"]