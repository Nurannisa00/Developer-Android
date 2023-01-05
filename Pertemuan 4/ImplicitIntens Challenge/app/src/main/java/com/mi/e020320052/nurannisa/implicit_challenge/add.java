package com.mi.e020320052.nurannisa.implicit_challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class add extends AppCompatActivity {
    public static final  String EXTRA_LIST = "com.mi.e2020320052.nurannisa.implicit_challenge.extra.LIST";

    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public Button b5;
    public Button b6;
    public Button b7;
    public Button b8;
    public Button b9;
    public Button b10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        b1 = findViewById(R.id.satu);
        b2 = findViewById(R.id.dua);
        b3 = findViewById(R.id.tiga);
        b4 = findViewById(R.id.empat);
        b5 = findViewById(R.id.lima);
        b6 = findViewById(R.id.enam);
        b7 = findViewById(R.id.tujuh);
        b8 = findViewById(R.id.delapan);
        b9 = findViewById(R.id.sembilan);
        b10 = findViewById(R.id.sepuluh);




    }



    public void add_two(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = b2.getText().toString();
        intent.putExtra(EXTRA_LIST, message);
        intent.putExtra("b2", message);
        startActivity(intent);
    }

    public void add_three(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = b3.getText().toString();
        intent.putExtra(EXTRA_LIST, message);
        startActivity(intent);
    }

    public void add_four(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = b4.getText().toString();
        intent.putExtra(EXTRA_LIST, message);
        startActivity(intent);
    }

    public void add_five(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = b5.getText().toString();
        intent.putExtra(EXTRA_LIST, message);
        startActivity(intent);
    }

    public void add_six(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = b6.getText().toString();
        intent.putExtra(EXTRA_LIST, message);
        startActivity(intent);
    }

    public void add_seven(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = b7.getText().toString();
        intent.putExtra(EXTRA_LIST, message);
        startActivity(intent);
    }

    public void add_eight(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = b8.getText().toString();
        intent.putExtra(EXTRA_LIST, message);
        startActivity(intent);
    }

    public void add_nine(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = b9.getText().toString();
        intent.putExtra(EXTRA_LIST, message);
        startActivity(intent);
    }

    public void add_ten(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = b10.getText().toString();
        intent.putExtra(EXTRA_LIST, message);
        startActivity(intent);
    }

    public void add_one(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String message = b1.getText().toString();
        intent.putExtra(EXTRA_LIST, message);
        startActivity(intent);
    }
}
