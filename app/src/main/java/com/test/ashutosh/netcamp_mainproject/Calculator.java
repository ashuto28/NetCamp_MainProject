package com.test.ashutosh.netcamp_mainproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,clear,back,equal,minus,multiply,divide,plus,dot,openBracket,closeBracket,calcBack;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        calcBack = (Button)findViewById(R.id.calcBack);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        b0 = (Button)findViewById(R.id.button0);
        clear = (Button)findViewById(R.id.clear);
        back = (Button)findViewById(R.id.back);
        minus = (Button)findViewById(R.id.minus);
        plus = (Button)findViewById(R.id.plus);
        divide = (Button)findViewById(R.id.divide);
        multiply = (Button)findViewById(R.id.multiply);
        dot = (Button)findViewById(R.id.dot);
        equal = (Button)findViewById(R.id.equal);
        openBracket = (Button)findViewById(R.id.openBracket);
        closeBracket = (Button)findViewById(R.id.closeBracket);
        t1 = (TextView)findViewById(R.id.textView);
        t1.setText(Integer.toString(0));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+".");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"/");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"*");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"-");
            }
        });
        openBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+"(");
            }
        });

        closeBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText().toString().trim()+")");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("0");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = t1.getText().toString().trim();
                try {
                    s1 = s1.substring(0,s1.length()-1);
                }
                catch (Exception e){
                    s1 = "0";
                }
                t1.setText(s1);

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    PostFixConverter pc = new PostFixConverter(t1.getText().toString());
                    PostFixCalculator calc = new PostFixCalculator(pc.getPostfixAsList());
                    t1.setText("" + calc.result());
                }
                catch (Exception e){
                    Toast.makeText(Calculator.this, "Please enter a valid expression", Toast.LENGTH_SHORT).show();
                }
            }
        });

        calcBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Menu.class);
                startActivity(i);
                finish();
            }
        });



    }
}
