#### Description

Netflix Zuul example with one service (book-app).

#### Used Services and technologies:

* Spring Cloud Netflix Zuul
* Spring Boot

#### To start this example run

```
$ cd zuul-gateway
$ mvn spring-boot:run

$ cd book-app
$ mvn spring-boot:run
```

#### Available urls:

##### Direct urls to the service:

* http://localhost:7000/books

##### Urls using zuul API gateway:

* http://localhost:8080/library/books
