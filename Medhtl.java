package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Medhtl extends AppCompatActivity {


    ImageButton htl4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medhtl);
        htl4 =(ImageButton)findViewById(R.id.sh4);
        htl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Medhtl.this, Charionroom.class);
                startActivity(main);
            }
        });}
}
