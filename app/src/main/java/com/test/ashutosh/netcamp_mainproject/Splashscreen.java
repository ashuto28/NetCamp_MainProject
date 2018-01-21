package com.test.ashutosh.netcamp_mainproject;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;


public class Splashscreen extends AppCompatActivity {

    ProgressBar progress;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        iv = (ImageView) findViewById(R.id.imageView);
        progress = (ProgressBar)findViewById(R.id.progressBar);
        progress.setProgress(0);
        progress.setMax(200);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.animation);;
        iv.startAnimation(anim);
        progress.startAnimation(anim);
        final Intent i = new Intent(getApplicationContext(),MainActivity.class);
        Thread th = new Thread(){
            @Override
            public void run(){
                try {
                        for(int i1 = 0;i1 <= 200;i1 = i1+10){
                            progress.setProgress(i1);
                            sleep(200);
                        }
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        th.start();


    }
}

