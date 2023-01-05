package com.example.android.materialme_homework;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;

public abstract class Animation extends AppCompatActivity {
    // Constant used for the Intent to indicate the type of transition.
    private static final String TRANSITION_TYPE = "Transition Type";

    // Constants for shared element transitions.
    private static final String IMAGE = "switchImage";
    private static final String DETAIL = "switchDetail";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);



    }

    protected void switchAnimation(final ImageView image,
                                   final ImageView detail,
                                   final Intent intent,
                                   final Context context){
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Set the transition details and start the second activity.
                ActivityOptions options = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    options = ActivityOptions.makeSceneTransitionAnimation((Activity)context,
                                    Pair.create((View)image,
                                            IMAGE),
                                    Pair.create((View)detail,
                                            DETAIL));
                }

                startActivity(intent,options.toBundle());
            }
        });
    }
}


