FROM openjdk:8-alpine
EXPOSE 8080:8080
ADD /target/springboot-docker.jar springboot-docker.jar
ENTRYPOINT ["java","-jar","springboot-docker.jar"]
