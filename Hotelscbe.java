package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Hotelscbe extends AppCompatActivity {

    ImageButton ho1,ho2,ho3,ho4,ho5,ho6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotelscbe);

        ho1=(ImageButton)findViewById(R.id.cho);
        ho2=(ImageButton)findViewById(R.id.sho);
        ho3=(ImageButton)findViewById(R.id.rho);
        ho4=(ImageButton)findViewById(R.id.mho);
        ho5=(ImageButton)findViewById(R.id.vho);
        ho6=(ImageButton)findViewById(R.id.aho);

        ho1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Hotelscbe.this, Charionhtl.class);
                startActivity(main);
            }
        });
        ho2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Hotelscbe.this, Saihtl.class);
                startActivity(main);
            }
        });
        ho3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Hotelscbe.this, Rathnahtl.class);
                startActivity(main);
            }
        });
        ho4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Hotelscbe.this, Medhtl.class);
                startActivity(main);
            }
        });
        ho5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Hotelscbe.this, Vijayhtl.class);
                startActivity(main);
            }
        });
        ho6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Hotelscbe.this, Archtl.class);
                startActivity(main);
            }
        });

    }
}
