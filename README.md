# java-web-sbt-forked-mongo-repo-lambda-JAdventure

## Description
A POC for REST web service using mongodb.
Creates a user with credentials.

Uses spring's mongorepository
with a query using lambda collectors.

## Tech stack
- java
- sbt
  - mongo connector
- mongo

## Docker stack
- mongodb:latest
- hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`
- Endpoints
  - localhost/weapons/
  - localhost/weapons/name/shiv

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Data from JAdventure text game](https://github.com/Progether/JAdventure.git)
- [Code concept](https://github.com/ragcrix/StudentInformationSystem.git)
