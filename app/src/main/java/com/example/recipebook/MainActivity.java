package com.example.recipebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    RecycerviewAdapter recycerviewAdapter;
    LinearLayoutManager linearLayoutManager;
    List<recipe> recipes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recipes = new ArrayList<>();
        recipes.add(new recipe("MOMO","hujbjb",R.drawable.momo));
        recipes.add(new recipe("PIZZA","niub",R.drawable.pizza));
        recipes.add(new recipe("Biriyani","hjydu",R.drawable.biriyani));
        recipes.add(new recipe("Roll","ugncyb gychb",R.drawable.roll));

        recyclerView = (RecyclerView) findViewById(R.id.recipe_recycerview);
        recycerviewAdapter = new RecycerviewAdapter(this,recipes);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(recycerviewAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }
}