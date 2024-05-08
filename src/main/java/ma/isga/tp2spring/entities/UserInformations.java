package ma.isga.tp2spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserInformations {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idInformations;
    private String address;
    private String city;
    private String email;

    @OneToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}
