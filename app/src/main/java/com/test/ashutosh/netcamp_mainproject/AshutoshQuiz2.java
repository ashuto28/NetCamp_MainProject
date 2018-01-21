package com.test.ashutosh.netcamp_mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class AshutoshQuiz2 extends AppCompatActivity {

    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashutosh_quiz2);
        b1 = (Button)findViewById(R.id.ashutoshButtonQuiz2);
        r1 = (RadioButton)findViewById(R.id.ashutoshRadioQuiz21);
        r2 = (RadioButton)findViewById(R.id.ashutoshRadioQuiz22);
        r3 = (RadioButton)findViewById(R.id.ashutoshRadioQuiz23);
        r4 = (RadioButton)findViewById(R.id.ashutoshRadioQuiz24);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r2.isChecked())
                    ++Quiz.score;
                Intent i = new Intent(getApplicationContext(),AshutoshQuiz3.class);
                startActivity(i);
                finish();
            }
        });
    }
}
