package com.example.android.miwokapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }

    public void openNumberList(View view) {
        Intent i = new Intent(this, numbersActivity.class);
        startActivity(i);
    }

    public void openFamilyList(View view) {
        Intent i = new Intent(this, familyActivity.class);
        startActivity(i);
    }

    public void openColorsList(View view) {
        Intent i = new Intent(this, colorsActivity.class);
        startActivity(i);
    }

    public void openPhrasesList(View view) {
        Intent i = new Intent(this, phrasesActivity.class);
        startActivity(i);
    }







}
