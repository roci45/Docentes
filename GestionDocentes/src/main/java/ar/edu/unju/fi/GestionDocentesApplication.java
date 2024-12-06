package ar.edu.unju.fi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ar.edu.unju.fi")
public class GestionDocentesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDocentesApplication.class, args);
	}

}
