package com.test.ashutosh.netcamp_mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ShubhasiQuiz2 extends AppCompatActivity {

    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shubhasi_quiz2);
        b1 = (Button)findViewById(R.id.shubhasiButtonQuiz2);
        r1 = (RadioButton)findViewById(R.id.shubhasiRadioQuiz21);
        r2 = (RadioButton)findViewById(R.id.shubhasiRadioQuiz22);
        r3 = (RadioButton)findViewById(R.id.shubhasiRadioQuiz23);
        r4 = (RadioButton)findViewById(R.id.shubhasiRadioQuiz24);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r4.isChecked())
                    ++Quiz.score;
                Intent i = new Intent(getApplicationContext(),ShubhasiQuiz3.class);
                startActivity(i);
                finish();
            }
        });
    }
}
