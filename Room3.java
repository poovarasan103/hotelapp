package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Room3 extends AppCompatActivity {

    ImageButton bok3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room3);

        bok3=(ImageButton)findViewById(R.id.cofm3);
        bok3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Room3.this, Roombook.class);
                startActivity(main);
            }
        });
    }
}