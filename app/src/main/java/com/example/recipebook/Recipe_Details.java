package com.example.recipebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Recipe_Details extends AppCompatActivity {

    private  TextView recipe_Name,recipe_Ingredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe__details);


        recipe_Name = (TextView) findViewById(R.id.name_recipe);
        recipe_Ingredients = (TextView) findViewById(R.id.recipe_ingredients);



        Intent intent = getIntent();
        String Title = intent.getStringExtra("RecipeName");
        String  Ingredients  = intent.getStringExtra("RecipeIngredients");

        recipe_Name.setText(Title);
        recipe_Ingredients.setText(Ingredients);

    }
}