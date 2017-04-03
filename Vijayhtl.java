package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Vijayhtl extends AppCompatActivity {

    ImageButton htl12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vijayhtl);
        htl12 =(ImageButton)findViewById(R.id.sh5);
        htl12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Vijayhtl.this, Selectroom2.class);
                startActivity(main);
            }
        });
    }
}
