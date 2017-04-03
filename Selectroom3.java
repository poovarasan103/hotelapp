package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Selectroom3 extends AppCompatActivity {
    ImageButton rho1,rho2,rho3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectroom3);


        rho1=(ImageButton)findViewById(R.id.ro7);
        rho2=(ImageButton)findViewById(R.id.ro8);
        rho3=(ImageButton)findViewById(R.id.ro9);


        rho1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Selectroom3.this, Room1.class);
                startActivity(main);
            }
        });
        rho2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Selectroom3.this, Room2.class);
                startActivity(main);
            }
        });
        rho3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Selectroom3.this, Room3.class);
                startActivity(main);
            }
        });
    }
}
