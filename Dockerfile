FROM maven:3.8.6-jdk-11 as MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package

FROM openjdk:11-jre-slim-buster

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/code-0.1.0.jar /app/

ENTRYPOINT ["java", "-jar", "code-0.1.0.jar"]