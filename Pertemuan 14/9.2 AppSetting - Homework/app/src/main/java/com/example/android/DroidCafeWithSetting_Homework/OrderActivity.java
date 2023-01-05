/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.DroidCafeWithSetting_Homework;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


/**
 * This activity shows the order chosen.  The order is sent as data
 * with the intent to launch this activity.
 */
public class OrderActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    private static final String TAG = OrderActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // Get the intent and its data.
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.order_textview);
        textView.setText(message);

        // Create the spinner.
        Spinner spinner = findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        // Create an ArrayAdapter using the string array and default spinner
        // layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.labels_array,
                android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

        EditText editText1 = findViewById(R.id.phone_text);
        // Find the editText_main view and assign it to editText.
        if (editText1 != null)
            // If view is found, set the listener for editText.
            editText1.setOnEditorActionListener( new TextView.OnEditorActionListener() {
                        /**
                         * Responds to the pressed key and calls a method to dial
                         * the phone number.
                         *
                         * @param textView The view that was clicked.
                         * @param actionId Identifier of the action.
                         * @param keyEvent If triggered by an Enter key, this is the
                         *                 event.
                         * @return True, the key was entered, or false.
                         */
                        @Override
                        public boolean onEditorAction(
                                TextView textView, int actionId, KeyEvent keyEvent) {
                            // Start with no event.
                            boolean handled = false;

                            // If the action for the keyboard is defined as
                            // IME_ACTION_SEND (android:imeOptions="actionSend" in the
                            // layout), call the dialNumber method and return true.
                            if (actionId == EditorInfo.IME_ACTION_SEND) {
                                dialNumber();
                                handled = true;
                            }
                            return handled;
                        }
                    });}


        /**
         * Creates a string (phoneNum) for the phone number to dial,
         * and performs an implicit intent to dial the number.
         */
        private void dialNumber() {
            // Find the editText_main view.
            EditText editText = findViewById(R.id.phone_text);
            String phoneNum = null;

            // If the editText field is not null,
            // concatenate "tel: " with the phone number string.
            if (editText != null) phoneNum = "tel:" + editText.getText().toString();

            // Log the concatenated phone number for dialing.
            Log.d(TAG, "dialNumber: " + phoneNum);

            // Specify the intent.
            Intent intent = new Intent(Intent.ACTION_CALL);

            // Set the data for the intent as the phone number.
            intent.setData(Uri.parse(phoneNum));

            // If the intent resolves to a package (app),
            // start the activity with the intent.
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Log.d(TAG, "ImplicitIntents: Can't handle this!");
            }
        }





    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.sameday:
                if (checked)
                    // Same day service
                    displayToast(getString
                            (R.string.same_day_messenger_service));
                break;
            case R.id.nextday:
                if (checked)
                    // Next day delivery
                    displayToast(getString(R.string.next_day_ground_delivery));
                break;
            case R.id.pickup:
                if (checked)
                    // Pick up
                    displayToast(getString(R.string.pick_up));
                break;
            default:
                // Do nothing.
                break;
        }
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }


    // Interface callback for when any spinner item is selected.
    @Override
    public void onItemSelected(AdapterView<?> adapterView,
                               View view, int i, long l) {
        String spinnerLabel = adapterView.getItemAtPosition(i).toString();
        displayToast(spinnerLabel);
    }

    // Interface callback for when no spinner item is selected.
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        // Do nothing.
    }

    public void pickdate(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.datepicker));
    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string +
                "/" + day_string +
                "/" + year_string);

        Toast.makeText(this, getString(R.string.date) + dateMessage,
                Toast.LENGTH_SHORT).show();
    }

}

