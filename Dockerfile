
FROM amazoncorretto:8-alpine-jdk
MAINTAINER nico

copy target/portafolio-0.0.1-SNAPSHOT.jar argentina-developer.jar
entrypoint ["java","-jar","/argentina-developer.jar"]

CMD ["/bin/sh"]
