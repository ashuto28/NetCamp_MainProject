package com.test.ashutosh.netcamp_mainproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6;
    Button b1,b2;
    String s1,s2,s3,s4,s5,s6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        e1 = (EditText)findViewById(R.id.signupUsername);
        e2 = (EditText)findViewById(R.id.signupPass);
        e3 = (EditText)findViewById(R.id.signupCnfPass);
        e4 = (EditText)findViewById(R.id.signupEmail);
        e5 = (EditText)findViewById(R.id.signupCity);
        e6 = (EditText)findViewById(R.id.signupPhone);
        b1 = (Button)findViewById(R.id.signupButton);
        b2 = (Button)findViewById(R.id.signupBack);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = e1.getText().toString().trim();
                s2 = e2.getText().toString();
                s3 = e3.getText().toString();
                s4 = e4.getText().toString();
                s5 = e5.getText().toString();
                s6 = e6.getText().toString();

                if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals("")){
                    Toast.makeText(Signup.this, "Fill all field", Toast.LENGTH_SHORT).show();
                }
                else if(!s2.equals(s3)){
                    Toast.makeText(Signup.this, "Password not matched", Toast.LENGTH_SHORT).show();
                }
                else{
                    SQLiteDatabase data = openOrCreateDatabase("ucer",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists student(username varchar,password varchar,email varchar, city varchar, phone varchar)");
                    String query = "select * from student where username = '"+s1+"'";
                    Cursor cursor = data.rawQuery(query,null);
                    if(cursor.getCount()>0){
                        Toast.makeText(Signup.this, "username already exits", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        data.execSQL("insert into student (username,password,email,city,phone) values ('"+s1+"','"+s2+"','"+s4+"','"+s5+"','"+s6+"')");
                        Toast.makeText(Signup.this, "Account created", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                        finish();
                    }



                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
}
