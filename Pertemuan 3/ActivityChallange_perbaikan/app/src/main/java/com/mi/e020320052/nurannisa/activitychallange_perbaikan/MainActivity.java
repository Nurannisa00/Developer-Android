package com.mi.e020320052.nurannisa.activitychallange_perbaikan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String KEY_LIRICS = "LIRICS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_first = findViewById(R.id.button1);
        Button bt_second = findViewById(R.id.button2);
        Button bt_third = findViewById(R.id.button3);

        bt_first.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });

    }




}