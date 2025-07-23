package br.com.rafael.cadastro;

import br.com.rafael.cadastro.models.Cliente;
import br.com.rafael.cadastro.service.ClienteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CadastroApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CadastroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
