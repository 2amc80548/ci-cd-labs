package com.cicd.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebapiApplication.class, args);
	}

}

@RestController
class HelloController {
    @GetMapping("/")
    public String hello() {
        return "<h1>Hello CI/CD World!</h1>" +
               "<p>¡Bienvenido a mi Laboratorio 3 de Integración Continua!</p>" +
               "<p>Este es un servidor Spring Boot funcionando.</p>";
    }
}

@RestController
class HealthController {
    @GetMapping("/health")
    public String health() {
        return "Server Healthy!";
    }
}
