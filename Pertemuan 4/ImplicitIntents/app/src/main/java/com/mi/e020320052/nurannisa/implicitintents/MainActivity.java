package com.mi.e020320052.nurannisa.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText  websiteedittext, locationedittext, shareedittext;
Button openwebsitebutton, openlocationbutton, sharetextbutton;
String edittexturi, edittextloc, edittextshare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        websiteedittext = findViewById(R.id.website_edittext);
        locationedittext = findViewById(R.id.location_edittext);
        shareedittext = findViewById(R.id.share_edittext);

        openwebsitebutton = findViewById(R.id.open_website_button);
        openlocationbutton = findViewById(R.id.open_location_button);
        sharetextbutton = findViewById(R.id.share_text_button);

        openwebsitebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexturi = websiteedittext.getText().toString();

                Uri url_parse = Uri.parse(edittexturi);
                Intent bukaWebsite = new Intent(Intent.ACTION_VIEW, url_parse);
                startActivity(bukaWebsite);

            }
        });

        openlocationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittextloc = locationedittext.getText().toString();

                String loc = locationedittext.getText().toString();

                Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
                Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

                if(edittextloc != null) {
                    startActivity(intent);
                } else {
                    Log.d("pesan", "Alamat masih kosong");
                }

            }
        });

        sharetextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittextshare = shareedittext.getText().toString();
                String mimeType = "text/plain";
               ShareCompat.IntentBuilder
                       .from(MainActivity.this)
                       .setType(mimeType)
                        .setChooserTitle(R.string.share_text_with)
                        .setText(edittextshare)
                        .startChooser();

            }
        });

    }

}
