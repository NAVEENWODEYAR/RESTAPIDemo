#Dockerfile, an blueprint to create docker image,
FROM openjdk:21
RUN mkdir /usr/app/
COPY target/RestAPIDemo.jar/ usr/app
WORKDIR /usr/app/  
ENTRYPOINT ["java","-jar","RestAPIDemo.jar"]