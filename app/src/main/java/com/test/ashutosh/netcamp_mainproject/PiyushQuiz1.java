package com.test.ashutosh.netcamp_mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class PiyushQuiz1 extends AppCompatActivity {

    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piyush_quiz1);
        b1 = (Button)findViewById(R.id.piyushButtonQuiz1);
        r1 = (RadioButton)findViewById(R.id.piyushRadioQuiz11);
        r2 = (RadioButton)findViewById(R.id.piyushRadioQuiz12);
        r3 = (RadioButton)findViewById(R.id.piyushRadioQuiz13);
        r4 = (RadioButton)findViewById(R.id.piyushRadioQuiz14);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r4.isChecked())
                    ++Quiz.score;
                Intent i = new Intent(getApplicationContext(),PiyushQuiz2.class);
                startActivity(i);
                finish();
            }
        });
    }
}
