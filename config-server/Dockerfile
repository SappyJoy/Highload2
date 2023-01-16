FROM gradle:7.6.0-jdk17-alpine AS build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
COPY build.gradle.kts settings.gradle.kts $HOME

COPY gradle $HOME/gradle

ADD ./src $HOME/src
RUN gradle build --no-daemon


FROM openjdk:11-jdk-slim
RUN apt-get update && apt-get install -y curl
COPY --from=build /usr/app/build/libs/config-server-1.jar /app/runner.jar
ENTRYPOINT java -jar /app/runner.jar