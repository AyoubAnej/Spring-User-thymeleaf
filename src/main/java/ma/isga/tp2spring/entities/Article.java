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
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idArticle;
    private String description;
    private String brand;
    private Double price;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CommandLine> commandLine = new ArrayList<>();
}
