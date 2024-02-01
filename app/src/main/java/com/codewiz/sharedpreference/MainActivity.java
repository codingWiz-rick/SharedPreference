package com.codewiz.sharedpreference;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.codewiz.sharedpreference.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding inflate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inflate = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(inflate.getRoot());
        SharedPreference sharedPreference = new SharedPreference(this);
    }
}