package nikit.tacocloud.repositories;

import nikit.tacocloud.entities.Ingredient;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
