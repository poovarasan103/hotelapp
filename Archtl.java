package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Archtl extends AppCompatActivity {

    ImageButton htl13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archtl);
        htl13 =(ImageButton)findViewById(R.id.sh6);
        htl13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Archtl.this, Selectroom3.class);
                startActivity(main);
            }
        });
    }
}
