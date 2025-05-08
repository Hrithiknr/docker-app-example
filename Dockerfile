from openjdk:17
maintainer Hrithik
copy target/docker-app.jar /usr/app/
workdir /usr/app/
expose 8080
entrypoint ["java", "-jar", "docker-app.jar"]