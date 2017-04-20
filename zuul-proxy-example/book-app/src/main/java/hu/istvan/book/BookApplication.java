package hu.istvan.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class BookApplication {

	@RequestMapping(value = "/books")
	public List<String> available() {
		List<String> movies = new ArrayList<>();
		movies.add("Maca in da house (1984)");
		movies.add("Macunisi Macuisz (2015)");
		return movies;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}
}

