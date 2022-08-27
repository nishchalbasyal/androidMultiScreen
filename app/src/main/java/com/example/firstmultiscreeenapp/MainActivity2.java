package com.example.firstmultiscreeenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView textelement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textelement = findViewById(R.id.textView);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_NAME);

        textelement.setText("Your Name is "+message);

    }
}