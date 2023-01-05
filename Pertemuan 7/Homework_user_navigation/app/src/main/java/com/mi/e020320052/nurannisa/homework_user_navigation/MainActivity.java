package com.mi.e020320052.nurannisa.homework_user_navigation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView donut = findViewById(R.id.donut);
        donut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent donat = new Intent(MainActivity.this, donut.class);
                startActivity(donat);
            }
        });

        ImageView froyo = findViewById(R.id.froyo);
        froyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent froyo = new Intent(MainActivity.this, froyo.class);
                startActivity(froyo);
            }
        });

        ImageView ice = findViewById(R.id.ice_cream);
        ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ice_cream = new Intent(MainActivity.this, ice_cream.class);
                startActivity(ice_cream);
            }
        });
    }
}