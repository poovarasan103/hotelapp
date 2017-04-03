package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Rathnahtl extends AppCompatActivity {
    ImageButton htl3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rathnahtl);
        htl3 =(ImageButton)findViewById(R.id.sh3);
        htl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Rathnahtl.this, Selectroom3.class);
                startActivity(main);
            }
        });

    }
}
