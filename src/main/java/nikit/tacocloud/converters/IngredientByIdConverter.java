package nikit.tacocloud.converters;

import java.util.HashMap;
import java.util.Map;

import nikit.tacocloud.entities.Ingredient;
import nikit.tacocloud.entities.Ingredient.Type;
import nikit.tacocloud.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private IngredientRepository ingredientRepo;
    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
       this.ingredientRepo = ingredientRepo;

    }
    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}
