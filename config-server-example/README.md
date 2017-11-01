#### Description

Centralized Configuration example using Spring Cloud Config Server. The project uses the config files of the following repository:
https://github.com/f-istvan/spring-config-server-example-config-files


#### Used Services and technologies:

* Spring Cloud Config Server
* Spring Boot

#### To start this example run

```
$ cd config-service-demox
$ mvn spring-boot:run

$ cd config-client-demox
$ mvn spring-boot:run
```

#### Available urls:

##### Client services (gets it's config from the config server):

* http://localhost:8080/user
