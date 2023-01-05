package com.mi.e020320052.nurannisa.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private  final  String LOG = this.getClass().getSimpleName().toString();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btShow = findViewById(R.id.button);
        btShow.setOnClickListener(o->{
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });

        Log.d(LOG, "---OnCreate---");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG, "---OnStart---");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG, "---OnResume---");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG, "---OnPause---");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG, "---OnRestart---");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "---OnDestroy---");
    }
}