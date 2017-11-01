package hu.istvan.demox.book.service.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@RequestMapping("/book")
	public String book() {
		return "Here are some books";
	}

}
