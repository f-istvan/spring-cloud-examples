package hu.istvan.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BookApplication {

	@RequestMapping(value = "/books")
	public List<String> available() {
		final List<String> movies = new ArrayList<>();
		movies.add("Maca in da house (1984)");
		movies.add("Macunisi Macuisz (2015)");
		return movies;
	}

	public static void main(final String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}
}

