FROM openjdk:13
VOLUME /tmp
EXPOSE 9094
ADD ./target/service-bankaforo255-loan-transaction-0.0.1-SNAPSHOT.jar service-loan-transaction.jar
ENTRYPOINT  ["java","-jar","/service-loan-transaction.jar"]

# docker build -t loan-transaction:v1 .
# docker run -p 9092:9094 --name loan-transaction-server --network aforo255 -d loan-transaction:v1
# docker run -p 1002:9094 --name loan-transaction-server -d loan-transaction:v1