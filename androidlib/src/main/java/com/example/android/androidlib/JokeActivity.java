package com.example.android.androidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "com.example.android.androidlib.JOKE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        if(intent != null) {
            String joke = intent.getStringExtra(JOKE_KEY);

            TextView tv = (TextView)findViewById(R.id.joke_textview);
            tv.setText(joke);
        }
    }
}
