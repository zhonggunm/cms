package springfive.cms.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import springfive.cms.domain.models.News;

public interface NewsRepository extends ReactiveMongoRepository<News, String> {}
/*
@Service
public class CategoryRepository extends JpaRepository<Category, String> {
    List<Category> findByName(String name);
    List<Category> findByNameIgnoreCaseStartingWith(String name);
    List<Category> findAll()
    {
        return new List<>();
    }
}
*/