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

    @ManyToOne
    @JoinColumn(name = "command_id")
    private Command command;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
