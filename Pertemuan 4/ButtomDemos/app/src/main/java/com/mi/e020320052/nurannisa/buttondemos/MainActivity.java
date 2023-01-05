package com.mi.e020320052.nurannisa.buttondemos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btOne = findViewById(R.id.button01);
        Button btTwo = findViewById(R.id.button02);
        Button btThree = findViewById(R.id.button03);
        Button btFour = findViewById(R.id.button04);
        Button btFive = findViewById(R.id.button05);

        btOne.setOnClickListener(view -> Toast.makeText(this, "button 01 di klik", Toast.LENGTH_SHORT).show());
        btTwo.setOnClickListener(view -> Toast.makeText(this, "button 02 di klik", Toast.LENGTH_SHORT).show());
        btThree.setOnClickListener(view -> Toast.makeText(this, "button 03 di klik", Toast.LENGTH_SHORT).show());
        btFour.setOnClickListener(view -> Toast.makeText(this, "button 04 di klik", Toast.LENGTH_SHORT).show());
        btFive.setOnClickListener(view -> Toast.makeText(this, "button 05 di klik", Toast.LENGTH_SHORT).show());

    }
}