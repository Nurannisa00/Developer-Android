package com.mi.e020320052.nurannisa.homework2_Resep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<Recipe> recipes;
    private RecyclerView rcView;
    private RecipeAdapter adapter;
    public static final String EXTRA_REPLY = "com.example.recipeassignment.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recipes = DataProvider.getRecipes();

        rcView = findViewById(R.id.recyclerview);

        adapter = new RecipeAdapter(this, recipes);

        rcView.setAdapter(adapter);

        rcView.setLayoutManager(new LinearLayoutManager(this));
    }
}