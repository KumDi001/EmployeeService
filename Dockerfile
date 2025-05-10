FROM openjdk:17-alpine
EXPOSE 8083
ADD target/employeeservice-0.0.1.jar employeeservice.jar
ENTRYPOINT [ "java","-jar","/employeeservice.jar" ]