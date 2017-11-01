#### Description

Netflix Eureka and Zuul example with two services calling each other.

#### Used Services and technologies:

* Spring Cloud Netflix Eureka
* Spring Cloud Netflix Zuul
* Spring Boot
* Spring RestTemplate (user-service calls book-service using zuul with RestTemplate)


#### To start this example run

```
$ cd eureka-server-demox
$ mvn spring-boot:run

$ cd zuul-server-demox
$ mvn spring-boot:run

$ cd book-service-app-demox
$ mvn spring-boot:run

$ cd user-service-app-demox
$ mvn spring-boot:run
```

#### Available urls:

##### Eureka server:

* http://localhost:8761/

##### Direct urls to the services:

* http://localhost:9098/user
* http://localhost:9099/book

##### Urls using zuul API gateway:

* http://localhost:9090/book-service/book
* http://localhost:9090/user-service/user


* http://localhost:9090/user-service-eureka-instance-name/user
* http://localhost:9090/book-service-eureka-instance-name/book
