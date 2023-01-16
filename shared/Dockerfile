FROM gradle:7.6.0-jdk17-alpine AS build
ENV HOME=/usr/lib
RUN mkdir -p $HOME
WORKDIR $HOME
COPY build.gradle.kts settings.gradle.kts $HOME
COPY gradle $HOME/gradle

ADD ./src $HOME/src
RUN --mount=type=cache,target=./.gradle gradle build --no-daemon