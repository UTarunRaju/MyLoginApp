package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
            Intent i = new Intent(MainActivity.this, AdminPage.class);
            startActivity(i);

        }
        });




    }
}