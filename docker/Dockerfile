FROM amazoncorretto:23
LABEL authors="santosherrera-lopez"
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ../BackendCode-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["./wait-for-it.sh","db:3306","--","java", "-jar", "/app.jar"]