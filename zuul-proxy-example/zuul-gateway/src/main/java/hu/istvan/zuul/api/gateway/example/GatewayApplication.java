package hu.istvan.zuul.api.gateway.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class GatewayApplication {

	public static void main(final String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	public GatewayPreFilter preFilter() {
		return new GatewayPreFilter();
	}
}