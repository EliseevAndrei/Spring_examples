package com.mycompany.app.tacos.data.repository;

import com.mycompany.app.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
