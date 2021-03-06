package dev.mouhieddine.recipeapp.services;

import dev.mouhieddine.recipeapp.commands.RecipeCommand;
import dev.mouhieddine.recipeapp.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand findCommandById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
