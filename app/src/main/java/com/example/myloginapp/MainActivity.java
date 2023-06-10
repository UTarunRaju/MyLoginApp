package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Xml;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import com.google.android.material.button.MaterialButton;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView forgotpassword = findViewById(R.id.forgotpass);
        forgotpassword.setBackgroundResource(
                R.drawable.label_bg
        );
        forgotpassword.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View v) {

                            Intent i = new Intent(MainActivity.this, ForgotPassword.class);
                            startActivity(i);


                    }
                }








        );


        // creating clickable span to be implemented as a link




        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        MaterialButton adminbtn = (MaterialButton) findViewById(R.id.adminbtn);
        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("Tarun") && password.getText().toString().equals("123456")){
                    //correct
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, UserHome.class);
                    startActivity(i);
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();

            }
        });

        adminbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            Intent i = new Intent(MainActivity.this, AdmineLogin.class);
            startActivity(i);

        }
        });




    }
}