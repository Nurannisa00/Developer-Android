package com.mi.e020320052.nurannisa.homework2_Resep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;

public class recipe_page extends AppCompatActivity {

    //Views to bind to
    public String position;
    public TextView title;
    public ImageView imgageView;
    public TextView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_page);

        // Setup our views
        imgageView = findViewById(R.id.recipeImage);
        title = findViewById(R.id.recipeName);
        scroll = findViewById(R.id.recipeStepsText);

        //Get the data from the intent
        Intent intent = getIntent();
        position = intent.getStringExtra(MainActivity.EXTRA_REPLY);
        loadRecipe(position);
    }
    private void loadRecipe(String position){
        int pos = Integer.parseInt(position);
        Recipe recipe = DataProvider.getRecipes().get(pos);
        title.setText(recipe.name);
        scroll.setText(recipe.ingredients + "\n\n" + recipe.directions);
        Picasso.get()
                .load(recipe.image)
                .fit()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(imgageView);
    }
}