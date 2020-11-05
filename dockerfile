FROM balenalib/armv7hf-openjdk:11-bullseye
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
CMD ["java","-jar","/app.jar"]