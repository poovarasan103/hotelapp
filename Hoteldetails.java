package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hoteldetails extends AppCompatActivity {

    Button sr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteldetails);

        sr=(Button)findViewById(R.id.sr);
        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Hoteldetails.this, Selectroom.class);
                startActivity(main);
            }
        });
    }
}
