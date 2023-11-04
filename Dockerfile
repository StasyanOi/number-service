FROM openjdk:17

COPY target/new-project.jar .

CMD ["java","-jar","new-project.jar"]