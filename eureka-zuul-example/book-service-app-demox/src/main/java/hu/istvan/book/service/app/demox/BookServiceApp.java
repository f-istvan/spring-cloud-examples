package hu.istvan.book.service.app.demox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BookServiceApp {

	public static void main(final String[] args) {
		SpringApplication.run(BookServiceApp.class, args);
	}

}
