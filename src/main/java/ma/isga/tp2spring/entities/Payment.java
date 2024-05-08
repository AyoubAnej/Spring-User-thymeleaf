package ma.isga.tp2spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPayment;
    private double amount;
    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    @OneToOne
    @JoinColumn(name = "commandId")
    private Command command;

}

