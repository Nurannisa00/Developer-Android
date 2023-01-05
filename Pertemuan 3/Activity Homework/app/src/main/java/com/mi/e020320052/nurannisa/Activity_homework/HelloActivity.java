package com.mi.e020320052.nurannisa.Activity_homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {
    public static final String EXTRA_COUNT = "com.mi.e020320052.nurannisa.Activity_homework.extra.COUNT";
    private TextView mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.count);
        textView.setText(message);
        mCount = findViewById(R.id.count);
    }


    public void back(View view) {
        Intent back = new Intent(this, MainActivity.class );
        startActivity(back);
    }
}