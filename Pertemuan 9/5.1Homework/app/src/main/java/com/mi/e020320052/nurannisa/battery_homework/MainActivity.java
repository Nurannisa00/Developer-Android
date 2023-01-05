package com.mi.e020320052.nurannisa.battery_homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private ImageView vektor;
    private Button minus, plus;

    private static final int level_0 = 0;
    private static final int level_1 = 1;
    private static final int level_2 = 2;
    private static final int level_3 = 3;
    private static final int level_4 = 4;
    private static final int level_5 = 5;
    private static final int level_6 = 6;
    private static final int level_7 = 7;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        battery();
    }

    private void battery() {
        vektor = (ImageView) findViewById(R.id.imageView);
        plus = (Button) findViewById(R.id.bt_plus);
        minus = (Button) findViewById(R.id.bt_minus);
    }

    public void tambah(View view) {
        int viewID = view.getId();
        switch (viewID){
            case R.id.bt_plus:
                vektor.setImageLevel(count);
                count++;
                if (count == 8){
                    Toast toast=Toast. makeText(getApplicationContext(),"Battery is Full!!" ,Toast. LENGTH_SHORT);
                    toast.show();
                }
                break;

        }
    }

    public void kurang(View view) {
        int kurangID = view.getId();
        switch (kurangID){
            case R.id.bt_minus:
                vektor.setImageLevel(count);
                count--;
                if (count <= 0){
                    Toast kurang =Toast. makeText(getApplicationContext(),"Battery is Low! Charge your battery" ,Toast. LENGTH_SHORT);
                    kurang.show();
                }
                break;

        }
    }
}