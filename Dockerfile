FROM eclipse-temurin:21
RUN mkdir /app
COPY /build/libs/Musixtream.jar /app
CMD ["java", "-jar", "/app/Musixtream.jar"]
EXPOSE 8080
