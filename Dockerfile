FROM openjdk:8-jdk
COPY . /
RUN ./mvnw --batch-mode package

FROM openjdk:8-jdk
COPY --from=0 target/*.jar bank.jar
ENV SERVER_PORT=8082
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8082

