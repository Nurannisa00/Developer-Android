package com.mi.e020320052.nurannisa.percobaan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class add extends AppCompatActivity {
    Button button1, button2, button3;
    String bt1, bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        button1=(Button) findViewById(R.id.btone);
        button2=(Button) findViewById(R.id.bttwo);
        button3=(Button) findViewById(R.id.btthree);
    }

    public void satu(View view) {
        String s = button1.getText().toString();

        Intent i = new Intent(add.this, MainActivity.class);
        i.putExtra("button1", s);
        startActivity(i);
    }

    public void dua(View view) {
        String bt2 = button2.getText().toString();
        Intent i = new Intent(add.this, MainActivity.class);
        i.putExtra("button2", bt2);
        startActivity(i);
    }

    public void tiga(View view) {
        String bt3=button3.getText().toString();
        Intent i = new Intent(add.this, MainActivity.class);
        i.putExtra("button3", bt3);
        startActivity(i);
    }
}