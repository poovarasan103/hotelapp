package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Selectroom2 extends AppCompatActivity {
    ImageButton rho11,rho12,rho13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectroom2);


        rho11=(ImageButton)findViewById(R.id.ro4);
        rho12=(ImageButton)findViewById(R.id.ro5);
        rho13=(ImageButton)findViewById(R.id.ro6);


        rho11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Selectroom2.this, Room4.class);
                startActivity(main);
            }
        });
        rho12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Selectroom2.this, Room5.class);
                startActivity(main);
            }
        });
        rho13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Selectroom2.this, Room6.class);
                startActivity(main);
            }
        });
    }
}
