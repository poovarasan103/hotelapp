package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Charionroom extends AppCompatActivity {
    ImageButton rho1,rho2,rho3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charionroom);


        rho1=(ImageButton)findViewById(R.id.ro1);
        rho2=(ImageButton)findViewById(R.id.ro2);
        rho3=(ImageButton)findViewById(R.id.ro3);


        rho1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Charionroom.this, Room1.class);
                startActivity(main);
            }
        });
        rho2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Charionroom.this, Room2.class);
                startActivity(main);
            }
        });
        rho3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Charionroom.this, Room3.class);
                startActivity(main);
            }
        });
    }
}
