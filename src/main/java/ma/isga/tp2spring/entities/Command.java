package ma.isga.tp2spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Command {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCommand;
    @Temporal(TemporalType.DATE)
    private Date commandDate;

    @OneToMany(mappedBy = "command", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Utilisateur> utilisateurs = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "commandLine_id")
    private CommandLine commandLine;

    @OneToOne(mappedBy = "command", cascade = CascadeType.ALL, orphanRemoval = true)
    private Payment payment;
}
