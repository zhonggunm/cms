package springfive.cms.domain.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import springfive.cms.domain.models.Category;

import java.util.List;

//public interface CategoryRepository extends MongoRepository<Category, String> {}
public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {}
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