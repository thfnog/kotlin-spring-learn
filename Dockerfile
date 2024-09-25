FROM ubuntu:latest
LABEL authors="Thiago Nogueira"

ENTRYPOINT ["top", "-b"]