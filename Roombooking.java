package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Roombooking extends AppCompatActivity {
    Button send,can;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roombooking);
        send = (Button)findViewById(R.id.button56);
        can = (Button)findViewById(R.id.buttonexit);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Roombooking.this, MainActivity.class);
                startActivity(main);
            }
        });


        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Roombooking.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
