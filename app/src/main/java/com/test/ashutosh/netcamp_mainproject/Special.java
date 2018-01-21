package com.test.ashutosh.netcamp_mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Special extends AppCompatActivity {

        Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special);
        b1 = (Button)findViewById(R.id.cam);
        b2 = (Button)findViewById(R.id.antitheft);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Cam.class);
                startActivity(i);;
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),AntiTheft.class);
                startActivity(i);
                finish();
            }
        });
    }
}
