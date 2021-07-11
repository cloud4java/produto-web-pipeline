#FROM adoptopenjdk/openjdk11:alpine
FROM maslick/minimalka:jdk11
# RUN addgroup -S nonroot && adduser -S nonroot -G nonroot
# USER nonroot:nonroot
ARG JAR_FILE=build/libs/*-all.jar
COPY ${JAR_FILE} app.jar
EXPOSE 5000:5000

ENTRYPOINT ["java","-jar","/app.jar"]