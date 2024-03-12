FROM eclipse-temurin:21
RUN mkdir /opt/app
ENV PORT 8080
EXPOSE 8080
COPY /build/libs/Musixtream.jar /opt/app
CMD ["java", "-jar", "/opt/app/Musixtream.jar"]