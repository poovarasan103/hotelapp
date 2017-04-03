package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admindashboard extends AppCompatActivity {

    Button vendor, customer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admindashboard);

        vendor=(Button)findViewById(R.id.button3);
        customer=(Button)findViewById(R.id.button4);
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Admindashboard.this, Hotelmaintain.class);
                startActivity(main);
            }
        });

        vendor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Admindashboard.this,Addrooms.class);
                startActivity(main);
            }
        });
    }




}
