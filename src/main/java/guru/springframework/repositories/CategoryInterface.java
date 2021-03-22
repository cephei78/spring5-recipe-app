package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Stefan Feier on 22/03/2021
 */
public interface CategoryInterface extends CrudRepository<Category, Long> {

}
