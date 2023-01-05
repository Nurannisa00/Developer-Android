package com.mi.e020320052.nurannisa.droidcafehomework;

import static android.widget.Toast.makeText;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox bibimbab, japchae, ramyeon, odeng, kimbab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bibimbab = findViewById(R.id.bibimbab);
        japchae = findViewById(R.id.japchae);
        ramyeon = findViewById(R.id.ramyeon);
        odeng = findViewById(R.id.odeng);
        kimbab = findViewById(R.id.kimbab);

    }

    public void pesan(View view) {
        String a = "";

        if (bibimbab.isChecked()) {
            a+="Bibimbab";
        }
        if (japchae.isChecked()) {
            a+="Japchae";
        }
        if (ramyeon.isChecked()) {
            a+="Ramyeon";
        }
        if (odeng.isChecked()) {
            a+="Odeng";
        }
        if (kimbab.isChecked()) {
            a+="Kimbab";
        }
       Toast.makeText(this, "Pesanan anda : "+a +"\n", Toast.LENGTH_SHORT).show();


    }
    }
