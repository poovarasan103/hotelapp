package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Checkrooms extends AppCompatActivity {

    ImageButton roomsavail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkrooms);

        roomsavail=(ImageButton)findViewById(R.id.roomsavail);
        roomsavail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Checkrooms.this,Roomsdetails.class);
                startActivity(main);
            }
        });
    }
}
