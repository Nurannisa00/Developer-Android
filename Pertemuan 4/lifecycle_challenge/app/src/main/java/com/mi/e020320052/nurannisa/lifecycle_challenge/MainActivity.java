package com.mi.e020320052.nurannisa.lifecycle_challenge;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.app.Instrumentation;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mi.e020320052.nurannisa.lifecycle_challenge.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private final String LOG_TAG = MainActivity.class.getSimpleName();
    private  int mTextViewCount = 0;
    private ActivityMainBinding mainBinding;
    private TextView[] mTextView;
    private final ActivityResultLauncher<Intent> mAddShoppingList =
            registerForActivityResult (new
            ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode () == RESULT_OK) {
                    Intent intent = result.getData();

                    String item =
                    intent.getStringExtra(ItemListActivity.ITEM_TAG);
                    mTextView[mTextViewCount].setText(item);
                    mTextViewCount++;

                    if (mTextViewCount == 9)
                        mainBinding.tambah.setEnabled(false);
                }
            }
            );

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        String[] textView = new String[mTextViewCount + 1];
        for (int i = 0; i<= mTextViewCount; i++) {
            String text = mTextView[i].getText().toString();
            textView[i] = text;
        }

        outState.putStringArray("item_list", textView);
        outState.putBoolean("addItem_disable", mainBinding.tambah.isEnabled());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        mTextView = new  TextView[] {
                mainBinding.one,
                mainBinding.two,
                mainBinding.three,
                mainBinding.four,
                mainBinding.five,
                mainBinding.six,
                mainBinding.seven,
                mainBinding.eight,
                mainBinding.nine,
                mainBinding.ten,
        };

        mainBinding.tambah.setOnClickListener(v -> {
            Intent intent = new Intent(this, add.class);
            mAddShoppingList.launch(intent);
        });

        if (savedInstanceState != null) {
            String[] tv = savedInstanceState.getStringArray("item_list");
            mTextViewCount = tv.length - 1;

            for (int i = 0; i <= mTextViewCount; i++)
                mTextView[i].setText(tv[i]);

            mainBinding.tambah.setEnabled(savedInstanceState.getBoolean("addItem_disabled"));
        }

    }

}















