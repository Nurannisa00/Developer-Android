package com.mi.e020320052.nurannisa.simpleasynctask_challenge;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;


public class SimpleAsyncTask extends AsyncTask<Context, Integer, String> {
    private WeakReference<TextView> mTextView;
    private ProgressDialog mProgressDialog;
    private int mProgressStatus = 0;

    public SimpleAsyncTask(TextView tv) {
        this.mTextView = new WeakReference<>(tv);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);


    }


    private void publishProgress(int s) {

    }

    @Override
    protected String doInBackground(Context... contexts) {
        // Generate a random number between 0 and 10
        Random r = new Random();
        int n = r.nextInt(11);
        int i = 0;

        // Make the task take long enough that we have
        // time to rotate the phone while it is running
        int s = n * 200;

        // Sleep for the random amount of time
        try {
            Thread.sleep(s);
            publishProgress(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        // Return a String result
        return "Awake at last after sleeping for " + s + " milliseconds!";
    }

    @Override
    protected void onPostExecute(String result) {
        mTextView.get().setText(result);
    }
}

