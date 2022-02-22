FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} pruebatecnica.jar
ENTRYPOINT ["java","-jar","/pruebatecnica.jar"]
