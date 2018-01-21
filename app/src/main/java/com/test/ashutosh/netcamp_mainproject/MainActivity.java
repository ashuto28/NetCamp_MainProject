package com.test.ashutosh.netcamp_mainproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.login);
        t1 = (TextView)findViewById(R.id.signup);
        e1 = (EditText)findViewById(R.id.username);
        e2 = (EditText)findViewById(R.id.passwrod);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString().trim();
                String s2 = e2.getText().toString();
                if(s1.equals("")||s2.equals("")){
                    Toast.makeText(MainActivity.this, "All field required", Toast.LENGTH_SHORT).show();
                }
                else{
                    String table;
                    table = "create table if not exists student(username varchar,password varchar,email varchar, city varchar, phone varchar)";
                    SQLiteDatabase data = openOrCreateDatabase("ucer",MODE_PRIVATE,null);
                    data.execSQL(table);
                    String query = "select * from student where username = '"+s1+"' and password = '"+s2+"'";
                    Cursor cursor = data.rawQuery(query,null);
                    if(cursor.getCount()>0){
                        Intent i = new Intent(getApplicationContext(),Menu.class);
                        startActivity(i);
                        finish();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Failed to login try again or signup", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Signup.class);
                startActivity(i);
                finish();
            }
        });




    }
}
