package com.example.kevin.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class enterPassword_activity extends AppCompatActivity {
    Button buttonEnter;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    String string1="1";
    String string2="2";
    String string3="3";
    String string4="4";

    String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_password_activity);

        button1 = (Button) findViewById(R.id.num1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password = password + string1;
            }
        });

        button2 = (Button) findViewById(R.id.num2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password = password + string2;
            }
        });

        button3 = (Button) findViewById(R.id.num3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password = password + string3;
            }
        });

        button4 = (Button) findViewById(R.id.num4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password = password + string4;
            }
        });


        buttonEnter = (Button) findViewById(R.id.buttonEnter);
        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(password.equals("1234")) {
                    Intent intent = new Intent(getApplicationContext(), lockscreen.class);
                    intent.putExtra("unlockText","The App is Unlocked!");
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(getApplicationContext(), lockscreen.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }


}
