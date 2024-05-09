package ma.isga.tp2spring.repositories;

import ma.isga.tp2spring.entities.UserInformations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInformationsRepository extends JpaRepository<UserInformations, Integer> {
}
