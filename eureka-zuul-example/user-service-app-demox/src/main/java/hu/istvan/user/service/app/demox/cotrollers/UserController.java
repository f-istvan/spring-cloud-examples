package hu.istvan.user.service.app.demox.cotrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/user")
	public String user() {
		final String results = restTemplate.getForObject("http://book-service/book", String.class);
		return "Hello my name is Istvan: " + results;
	}
}
