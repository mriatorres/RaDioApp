package com.example.radioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;

public class MainActivity extends AppCompatActivity {
    ImageView imag_play;
    Button pausa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imag_play = findViewById(R.id.img_play);
        pausa = findViewById(R.id.pausa);

        ExoPlayer player = new ExoPlayer.Builder(this).build();


        imag_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                MediaItem url = MediaItem.fromUri(("https://host3.audiolatam.com/8030/stream"));
                player.setMediaItem(url);
                player.prepare();
                player.play();
            }
        });

        pausa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.stop();


            }
        });
    }
}