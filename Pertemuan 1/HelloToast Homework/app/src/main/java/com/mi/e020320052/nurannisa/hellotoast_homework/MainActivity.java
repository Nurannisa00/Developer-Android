package com.mi.e020320052.nurannisa.hellotoast_homework;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        final Button button_reset = findViewById(R.id.button_riset);
        final Button button_count = findViewById(R.id.button_count);
        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_reset.setBackgroundColor(Color.GREEN);
                mCount = 0;
                mShowCount.setText(Integer.toString(mCount));}});

        button_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_count.setBackgroundColor(Color.CYAN);
                mCount++;
                if (mShowCount != null) {mShowCount.setText(Integer.toString(mCount));}
            }
        });

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}