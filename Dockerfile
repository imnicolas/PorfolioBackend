
FROM amazoncorretto:8-alpine-jdk
MAINTAINER nico

copy target/portafolio-0.0.1-SNAPSHOT argentina-developer.jar
entrypoint ["java","-jar","/argentina-developer"]

CMD ["/bin/sh"]
