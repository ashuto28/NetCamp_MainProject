package com.test.ashutosh.netcamp_mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Quiz extends AppCompatActivity {
    Button b1,b2;
    RadioButton r1,r2,r3,r4;
    public static int score=0;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        b1 = (Button)findViewById(R.id.quizBack);
        r1 = (RadioButton)findViewById(R.id.quizRadioButton1);
        r2 = (RadioButton)findViewById(R.id.quizRadioButton2);
        r3 = (RadioButton)findViewById(R.id.quizRadioButton3);
        r4 = (RadioButton)findViewById(R.id.quizRadioButton4);
        b2 = (Button)findViewById(R.id.next);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(),Menu.class);
                startActivity(i);
                finish();
            }
        });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(r1.isChecked()){
                   i = new Intent(getApplicationContext(),AshutoshQuiz1.class);
               }
               else if(r2.isChecked()){
                   i = new Intent(getApplicationContext(),ShubhasiQuiz1.class);
               }
               else if(r3.isChecked()){
                   i = new Intent(getApplicationContext(),PiyushQuiz1.class);
               }
               else if(r4.isChecked()){
                   i = new Intent(getApplicationContext(),ManishaQuiz1.class);
               }

               startActivity(i);
               finish();
           }
       });
    }
}
