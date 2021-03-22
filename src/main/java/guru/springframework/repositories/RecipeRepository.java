package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Stefan Feier on 22/03/2021
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
