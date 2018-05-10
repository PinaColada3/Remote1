package com.example.chiso.remote1;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (-1 == prefs.getInt("install", -1)) {
            // <---- run your one time code here

            // mark first time has ran
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("install", 1);
            editor.commit();
        }




        // Delete this when done
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("install", -1);
        editor.commit();
    }
}
