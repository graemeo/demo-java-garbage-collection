
# Demo - Garbage Collection Logging with Java

## Description

A demonstration to show how easy it is to enable garbage collection logging using Java, useful for troubleshooting JVM performance.

This demonstration contains a program which will trigger a memory leak just to give you an example of what you should be looking at and how garbage collection can assist - although you don't necessarily need this scenario to enable garbage collection logging.

The sample [usages](#usage) given enable us with more detailed garbage collection logging along with timestamps for each output. Further, a few of the sample [usages](#usage) demonstrate how garbage collection is written to the console and a log file.


## Pre-requisite(s)

* Java 8

## Usage

To build:

```bash
./gradlew clean build
```

To run program - with logging to console:

```bash
java -Xms3m -Xmx3m -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -jar build/libs/demo-java-garbage-collection.jar 
```

To run program - with logging to file:

```bash
java -Xms3m -Xmx3m -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:gc.log -jar build/libs/demo-java-garbage-collection.jar
```
