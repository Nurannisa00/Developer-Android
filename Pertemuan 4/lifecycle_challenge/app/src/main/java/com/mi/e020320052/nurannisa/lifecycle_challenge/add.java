package com.mi.e020320052.nurannisa.lifecycle_challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

import com.mi.e020320052.nurannisa.lifecycle_challenge.databinding.ActivityMainBinding;

public class add extends AppCompatActivity {
    public final static String ITEM_TAG = "com.mi.e2020320052.nurannisa.lifecycle_challenge.EXTRA.ITEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityItemListBinding itemListBinding =
        ActivityItemListBinding.inflate(getLayoutInflater());
        setContentView(itemListBinding.getRoot);

        Button[] mButton = new Button[] {
                itemListBinding.satu,
                itemListBinding.dua,
                itemListBinding.tiga,
                itemListBinding.empat,
                itemListBinding.lima,
                itemListBinding.enam,
                itemListBinding.tujuh,
                itemListBinding.delapan,
                itemListBinding.sembilan,
                itemListBinding.sepuluh
        };

        for (Button button : mButton) {
            button.setOnClickListener(v -> {
                Button btn = (Button) v;

                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra(ITEM_TAG, btn.getText().toString());

                setResult(RESULT_OK, intent);
                finish();
            });
        }

    }
}
