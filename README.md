# README #

Original idea : Accompanying source code for blog entry at http://tech.asimio.net/2017/11/28/An-alternative-to-ThreadLocal-using-Spring.html
My Work : Pumped to Java 11 and Spring Boot 2.1.x

### Requirements ###

* Java 11
* Maven 3.5 or better

### Building and running from command line ###

```
./mvnw spring-boot:run
```

### Available endpoints ###

```
curl -v -H "X-TENANT-ID:tenant_1" http://localhost:8080/demo
curl -v -H "X-TENANT-ID:tenant_2" http://localhost:8080/demo
```

### Who do I talk to? ###

* ootero at asimio dot net
* https://www.linkedin.com/in/ootero