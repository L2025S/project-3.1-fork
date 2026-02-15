
FROM ubuntu:latest
LABEL authors="jakob"

ENTRYPOINT ["top", "-b"]