FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
EXPOSE
ENTRYPOINT ["java",."-jar","app.jar"]