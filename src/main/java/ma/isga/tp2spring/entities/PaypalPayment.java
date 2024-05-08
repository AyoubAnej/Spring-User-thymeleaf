package ma.isga.tp2spring.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PaypalPayment extends Payment{
    private String accountNumber;
}
