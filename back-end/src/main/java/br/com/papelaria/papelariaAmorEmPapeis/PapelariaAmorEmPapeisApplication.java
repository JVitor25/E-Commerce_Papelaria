package br.com.papelaria.papelariaAmorEmPapeis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class PapelariaAmorEmPapeisApplication {

	public static void main(String[] args) {
		SpringApplication.run(PapelariaAmorEmPapeisApplication.class, args);
	}

}
