FROM openjdk:11
MAINTAINER metrontechnologies
COPY target/myportfolio-0.0.1-SNAPSHOT.jar metrontechnologies.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]
