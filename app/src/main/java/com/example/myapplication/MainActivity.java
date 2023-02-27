package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "app up and running");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "app paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "app resuming");
    }
}