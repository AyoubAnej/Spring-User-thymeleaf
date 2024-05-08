package ma.isga.tp2spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CommandLine {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCommand;
    private Integer quantity;

    @OneToMany(mappedBy = "commandLine_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Command> commands = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
