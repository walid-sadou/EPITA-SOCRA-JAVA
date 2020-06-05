FROM java:8-jre
COPY target/socra-app-1.0-SNAPSHOT.jar socra-app-1.0-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -cp socra-app-1.0-SNAPSHOT.jar com.epita.socra.app.App"]
