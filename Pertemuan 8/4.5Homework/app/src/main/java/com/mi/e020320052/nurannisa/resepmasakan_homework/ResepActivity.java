package com.mi.e020320052.nurannisa.resepmasakan_homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class ResepActivity extends AppCompatActivity {

    private TextView mNama, mBahan, mCara;
    private ImageView mFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep);

        mNama = findViewById(R.id.namaMasakan);
        mBahan = findViewById(R.id.bahan);
        mCara = findViewById(R.id.cara);
        mFoto = findViewById(R.id.image);

        Intent intent = getIntent();
        String sNama = intent.getExtras().getString("NamaResep");
        String  sBahan = intent.getExtras().getString("BahanResep");
        String sCara = intent.getExtras().getString("CaraResep");
        String sFoto = String.valueOf(intent.getExtras().getInt("Foto"));

        mNama.setText(sNama);
        mBahan.setText(sBahan);
        mCara.setText(sCara);
        try {
            sFoto.getBytes(sFoto);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}