package com.mi.e020320052.nurannisa.activitychallange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void first(View view) {
        Intent second = new Intent(this, Second.class);
        startActivity(second);
    }

    public void second(View view) {
        Intent third = new Intent(this, Third.class);
        startActivity(third);
    }

    public void third(View view) {
        Intent fourth = new Intent(this, fourth.class);
        startActivity(fourth);
    }

}