package com.mi.e020320052.nurannisa.implicit_challenge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_ADD = "com.mi.e020320052.nurannisa.implicit_challenge.extra.ADD";
    EditText cariTokoet;
    Button btn_addOne, btnCari;
    String cari;
    private TextView list1;
    private TextView list2;
    private TextView list3;
    private TextView list4;
    private TextView list5;
    private TextView list6;
    private TextView list7;
    private TextView list8;
    private TextView list9;
    private TextView list10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cariTokoet = findViewById(R.id.cariToko);
        btnCari = findViewById(R.id.btnCari);


        Intent intent = getIntent();

        String satu = intent.getStringExtra(add.EXTRA_LIST);
        TextView one = findViewById(R.id.one);
        one.setText(satu);

        String dua = intent.getStringExtra(add.EXTRA_LIST);
        TextView two = findViewById(R.id.two);
        two.setText(dua);

        String tiga = intent.getStringExtra(add.EXTRA_LIST);
        TextView three = findViewById(R.id.three);
        three.setText(tiga);

        String empat = intent.getStringExtra(add.EXTRA_LIST);
        TextView four = findViewById(R.id.four);
        four.setText(empat);

        String lima = intent.getStringExtra(add.EXTRA_LIST);
        TextView five = findViewById(R.id.five);
        five.setText(lima);

        String enam = intent.getStringExtra(add.EXTRA_LIST);
        TextView six = findViewById(R.id.six);
        six.setText(enam);

        String tujuh = intent.getStringExtra(add.EXTRA_LIST);
        TextView seven = findViewById(R.id.seven);
        seven.setText(tujuh);

        String delapan = intent.getStringExtra(add.EXTRA_LIST);
        TextView eight = findViewById(R.id.eight);
        eight.setText(delapan);

        String sembilan = intent.getStringExtra(add.EXTRA_LIST);
        TextView nine = findViewById(R.id.nine);
        nine.setText(sembilan);

        String sepuluh = intent.getStringExtra(add.EXTRA_LIST);
        TextView ten = findViewById(R.id.ten);
        ten.setText(sepuluh);
    }

    public void tambah(View view) {
        Intent intent = new Intent(MainActivity.this, add.class);
        startActivity(intent);
    }

    public void Cari(View view) {
        cari = cariTokoet.getText().toString();
        String loc = cariTokoet.getText().toString();

        Uri addressUri = Uri.parse("geo:0:0?q" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        startActivity(intent);
    }
}