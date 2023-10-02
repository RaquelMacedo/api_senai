package com.api_senai.api;

import com.api_senai.api.entitiles.Endereco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		Endereco endereco = new Endereco();
		endereco.setLogradouro ("rua 1");
		endereco.setNumero("12");
		endereco.setComplemento("casa");

		System.out.println(endereco);
	}

}
