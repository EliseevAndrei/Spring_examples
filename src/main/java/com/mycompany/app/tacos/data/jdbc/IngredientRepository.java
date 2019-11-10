package com.mycompany.app.tacos.data.jdbc;

import com.mycompany.app.tacos.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);

}
