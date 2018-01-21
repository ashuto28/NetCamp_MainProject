package com.test.ashutosh.netcamp_mainproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicPlayer extends AppCompatActivity {
    Button b1,b2,b3;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        b1 = (Button)findViewById(R.id.musicPlayerBack);
        b2 = (Button)findViewById(R.id.play);
        b3 = (Button)findViewById(R.id.pause);
        mp = MediaPlayer.create(getApplicationContext(),R.raw.a);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Menu.class);
                mp.stop();
                startActivity(i);
                finish();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();

            }
        });
    }
}
