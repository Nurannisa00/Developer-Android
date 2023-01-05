package com.mi.e020320052.nurannisa.percobaan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnTambah;
private TextView View1, View2, View3;
String Tambah, List1, List2, List3;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (View1.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("1", View1.getText().toString());
            outState.putString("2", View2.getText().toString());
            outState.putString("3", View3.getText().toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View1=(TextView)findViewById(R.id.satu);
        View2=(TextView)findViewById(R.id.dua);
        View3=(TextView)findViewById(R.id.tiga);
        btnTambah=(Button) findViewById(R.id.tambah);

        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {
                View1.setText(savedInstanceState.getString("1"));
                View1.setVisibility(View.VISIBLE);
                View2.setText(savedInstanceState.getString("2"));
                View2.setVisibility(View.VISIBLE);
                View3.setText(savedInstanceState.getString("3"));
                View3.setVisibility(View.VISIBLE);
            }
        }

        Intent ii = getIntent();
        Bundle b = ii.getExtras();

        if (b!=null) {
            String x = (String) b.get("button1");
            View1.setText(x);
        }

        if (b!=null) {
            String y = (String) b.get("button2");
            View2.setText(y);
        }

        if (b!=null) {
            String z = (String) b.get("button3");
            View3.setText(z);
        }



        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent integer = new Intent(MainActivity.this, add.class);
                startActivity(integer);
            }
        });

    }


}