package ma.isga.tp2spring.repositories;

import ma.isga.tp2spring.entities.PaypalPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaypalPaymentRepository extends JpaRepository<Integer, PaypalPayment> {
}
