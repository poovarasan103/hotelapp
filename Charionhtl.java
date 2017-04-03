package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Charionhtl extends AppCompatActivity {
    ImageButton htl1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charionhtl);
        htl1 =(ImageButton)findViewById(R.id.sh1);
        htl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Charionhtl.this, Charionroom.class);
                startActivity(main);
            }
        });
    }

}
