package ma.isga.tp2spring.repositories;

import ma.isga.tp2spring.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Integer, Payment> {
}
