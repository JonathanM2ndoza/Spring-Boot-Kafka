# Example of Spring Boot with Kafka 

# Introduction

![Screenshot](prtsc/kafka-00.png)

https://kafka.apache.org/intro.html

## Kafka Architecture

![Screenshot](prtsc/kafka-00.1.jpg)

In the above diagram, a topic is configured into three partitions. Partition 1 has two offset factors 0 and 1. Partition 2 has four offset factors 0, 1, 2, and 3. Partition 3 has one offset factor 0. The id of the replica is same as the id of the server that hosts it.

Assume, if the replication factor of the topic is set to 3, then Kafka will create 3 identical replicas of each partition and place them in the cluster to make available for all its operations. To balance a load in cluster, each broker stores one or more of those partitions. Multiple producers and consumers can publish and retrieve messages at the same time.

https://www.tutorialspoint.com/apache_kafka/apache_kafka_fundamentals.htm

## Prerequisites
* Kafka version: 2.4.0
* Zookeeper version: 3.6.0

### 1.- Example of producer 

View messages produced on topic.test (before)

![Screenshot](prtsc/kafka-01.png)

Run Spring Boot Application

![Screenshot](prtsc/kafka-02.png)

Send first message

![Screenshot](prtsc/kafka-03.png)

![Screenshot](prtsc/kafka-03.1.png)

View messages produced on topic.test (after)

![Screenshot](prtsc/kafka-03.2.png)

Send second message

![Screenshot](prtsc/kafka-03.3.png)

View messages produced on topic.test (after)

![Screenshot](prtsc/kafka-03.4.png)

### 2.- Example of Consumer 

View messages produced on topic.test 

![Screenshot](prtsc/kafka-04.png)

Run Spring Boot Application

![Screenshot](prtsc/kafka-04.1.png)

Consume all message of topic.test 
 
![Screenshot](prtsc/kafka-04.2.png)



