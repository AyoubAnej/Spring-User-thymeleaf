package ma.isga.tp2spring.repositories;

import ma.isga.tp2spring.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Integer, Article> {
}
