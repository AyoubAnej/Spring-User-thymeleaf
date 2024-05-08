package ma.isga.tp2spring.repositories;

import ma.isga.tp2spring.entities.CreditCardPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardPaymentRepository extends JpaRepository<Integer, CreditCardPayment> {
}
