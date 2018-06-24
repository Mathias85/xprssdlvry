#!/usr/bin/env bash
docker-compose stop;

docker rm mysql_auth;
docker rm mysql_xprssdlvry;
docker rm rabbitmq;

docker ps -a;