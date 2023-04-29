package com.example.radioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.exoplayer2.ExoPlayer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExoPlayer player = new ExoPlayer.Builder(this).build();
    }
}