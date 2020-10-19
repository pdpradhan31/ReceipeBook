package com.example.recipebook;

public class recipe {

    private String RecipeName;
    private String RecipeIngredients;
    private int RecipeImage;


    public recipe() {
    }

    public recipe(String recipeName, String recipeIngredients, int recipeImage) {
        RecipeName = recipeName;
        RecipeIngredients = recipeIngredients;
        RecipeImage = recipeImage;
    }

    public String getRecipeName() {
        return RecipeName;
    }

    public void setRecipeName(String recipeName) {
        RecipeName = recipeName;
    }

    public String getRecipeIngredients() {
        return RecipeIngredients;
    }

    public void setRecipeIngredients(String recipeIngredients) {
        RecipeIngredients = recipeIngredients;
    }

    public int getRecipeImage() {
        return RecipeImage;
    }

    public void setRecipeImage(int recipeImage) {
        RecipeImage = recipeImage;
    }
}
