#FROM openjdk:11.0.11-jdk-oraclelinux7
#VOLUME /tmp
#ADD docker-maven-plugin:1.0.0.jar app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

FROM adoptopenjdk/openjdk11
COPY *jar /app.jar
CMD["--server.port=10270"]
EXPOSE 10270
ENTRYPOINT ["java","-jar","/app.jar"]