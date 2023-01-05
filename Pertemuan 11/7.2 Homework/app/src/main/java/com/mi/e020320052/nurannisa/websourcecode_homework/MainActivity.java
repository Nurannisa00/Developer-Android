package com.mi.e020320052.nurannisa.websourcecode_homework;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity{
    private EditText mBookInput;
    private TextView mTitleText;
    private TextView mAuthorText;

    String[] web = {"http://", "https://"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBookInput = (EditText)findViewById(R.id.bookInput);
        mTitleText = (TextView)findViewById(R.id.titleText);
        mAuthorText = (TextView)findViewById(R.id.authorText);

        //initiate an auto complete text view
        AutoCompleteTextView simpleAutoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.bookInput);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, web);

        simpleAutoCompleteTextView.setAdapter(adapter);
        simpleAutoCompleteTextView.setThreshold(1);//start searching from 1 character
        simpleAutoCompleteTextView.setAdapter(adapter);   //set the adapter for displaying country name list


    }

    public void searchBooks(String website) {
        // Get the search string from the input field.
        String queryString = mBookInput.getText().toString();

        String resString = "";
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);


    }
}