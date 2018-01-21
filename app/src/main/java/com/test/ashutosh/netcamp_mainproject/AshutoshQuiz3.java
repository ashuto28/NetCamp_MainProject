package com.test.ashutosh.netcamp_mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class AshutoshQuiz3 extends AppCompatActivity {

    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashutosh_quiz3);
        b1 = (Button)findViewById(R.id.ashutoshButtonQuiz3);
        r1 = (RadioButton)findViewById(R.id.ashutoshRadioQuiz31);
        r2 = (RadioButton)findViewById(R.id.ashutoshRadioQuiz32);
        r3 = (RadioButton)findViewById(R.id.ashutoshRadioQuiz33);
        r4 = (RadioButton)findViewById(R.id.ashutoshRadioQuiz34);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r2.isChecked())
                    ++Quiz.score;
                Intent i = new Intent(getApplicationContext(),Result.class);
                startActivity(i);
                finish();
            }
        });
    }
}
