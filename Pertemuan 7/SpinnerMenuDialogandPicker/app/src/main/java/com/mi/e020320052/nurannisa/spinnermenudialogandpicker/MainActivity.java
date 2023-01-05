package com.mi.e020320052.nurannisa.spinnermenudialogandpicker;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.constrain_layout);
        registerForContextMenu(constraintLayout);

        Button btAlert = findViewById(R.id.dialog);
        btAlert.setOnClickListener(o -> {
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Alert Simple Dialog")
                    .setMessage("Anda Pesan ? ")
                    .setNeutralButton("Cancel", (dialogInterface, i) ->{
                        displayToast("Ulun Bingung : ");
                    })
                    .setNegativeButton("No", (dialogInterface, i) ->{
                        displayToast("Ulun Tanang Ja gin");
                    })
                    .setPositiveButton("Cancel", (dialogInterface, i) ->{
                        displayToast("Ulun Pesan 2");
                    })
                    .show();
        });

        Spinner spinner = findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        // Create an ArrayAdapter using the string array and default spinner
        // layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.asiatenggara,
                android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView,
                               View view, int i, long l) {
        String spinnerLabel = adapterView.getItemAtPosition(i).toString();
        displayToast(spinnerLabel);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }



    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.eat, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.breakfast:
                displayToast(getString(R.string.status_breakfast));
                return true;
            case R.id.lunch:
                displayToast(getString(R.string.status_lunch));
                return true;
            case R.id.Dinner:
                displayToast(getString(R.string.status_dinner));
                return true;
            case R.id.meeting:
                displayToast(getString(R.string.status_meeting));
                return true;
            case R.id.party:
                displayToast(getString(R.string.status_party));
                return true;
            default:
                // Do nothing
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.content, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.context_selectall:
                displayToast("do select all");
                break;
            case R.id.context_ignore:
                displayToast("do ignore");
                break;
            case R.id.context_correction:
                displayToast("do correction");
                break;
            case R.id.context_delete:
                displayToast("do delete");
                break;
            case R.id.context_blank:
                displayToast("do blank");
                break;

        }
        return false;
    }}

