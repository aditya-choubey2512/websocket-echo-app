FROM bellsoft/liberica-runtime-container:jre-17-stream-musl
COPY build/libs/websocket-echo-app-0.0.1-SNAPSHOT.jar websocket-echo-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/websocket-echo-app.jar"]