package ma.isga.tp2spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name ="_user")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer IdUser;
    private String login;
    private String password;
    private Integer connectionNumber;

    @OneToOne(mappedBy = "utilisateur", cascade = CascadeType.ALL, orphanRemoval = true)
    private UserInformations userInformations;

    @ManyToOne
    @JoinColumn(name = "command_id")
    private Command command;
}
