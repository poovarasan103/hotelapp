package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Saihtl extends AppCompatActivity {
    ImageButton htl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saihtl);
        htl2 =(ImageButton)findViewById(R.id.sh2);
        htl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Saihtl.this, Selectroom2.class);
                startActivity(main);
            }
        });
    }
}
