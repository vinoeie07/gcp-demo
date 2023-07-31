FROM openjdk:17-jdk-alpine
MAINTAINER gcp.springboot
RUN mkdir -p /opt/springboot-gcp-0.0.1/lib
# Setting application source code working directory
WORKDIR /opt/springboot-gcp-0.0.1/
COPY target/springboot-gcp-0.0.1-SNAPSHOT.jar /opt/springboot-gcp-0.0.1/lib/springboot-gcp-0.0.1-SNAPSHOT.jar

RUN sh -c 'touch springboot-gcp-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java"]
CMD ["-jar", "/opt/springboot-gcp-0.0.1-SNAPSHOT/lib/springboot-gcp-0.0.1-SNAPSHOT.jar"]