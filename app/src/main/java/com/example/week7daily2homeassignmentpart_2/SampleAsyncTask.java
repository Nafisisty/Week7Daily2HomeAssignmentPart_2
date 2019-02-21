package com.example.week7daily2homeassignmentpart_2;

import android.os.AsyncTask;

public class SampleAsyncTask extends AsyncTask<String, String, String> {
    @Override
    protected String doInBackground(String... strings) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
