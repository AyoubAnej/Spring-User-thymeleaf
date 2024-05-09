package ma.isga.tp2spring.repositories;

import ma.isga.tp2spring.entities.Command;
import ma.isga.tp2spring.entities.CommandLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandLineRepository extends JpaRepository<CommandLine, Integer> {
}
