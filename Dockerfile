# Bu?c 1: S? d?ng image JDK ch�nh th?c
FROM openjdk:17-jdk-slim

# Bu?c 2: �?t thu m?c l�m vi?c cho ?ng d?ng
WORKDIR /app

# Bu?c 3: Sao ch�p file JAR v�o container
COPY target/learnsb-0.0.1-SNAPSHOT.jar app.jar

# Bu?c 4: Expose c?ng 8080 (ho?c c?ng m� ?ng d?ng Spring Boot c?a b?n s? d?ng)
EXPOSE 8080

# Bu?c 5: Ch?y ?ng d?ng
ENTRYPOINT ["java", "-jar", "app.jar"]
