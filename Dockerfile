FROM openjdk:8
ADD target/Shopping-Cart-0.1.war Shopping-Cart-0.1.war
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "Shopping-Cart-0.1.war"]

