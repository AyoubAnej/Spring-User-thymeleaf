package ma.isga.tp2spring;

import ma.isga.tp2spring.entities.Utilisateur;
import ma.isga.tp2spring.repositories.UtilisateurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp2SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp2SpringApplication.class, args);
	}

	CommandLineRunner commandLineRunner(UtilisateurRepository utilisateurRepository){
		return args -> {
			utilisateurRepository.save(new Utilisateur(null,"ayoub", "123", 3, null, null));
		};
	}
}

