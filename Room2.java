package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Room2 extends AppCompatActivity {

    ImageButton bok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room2);

        bok=(ImageButton)findViewById(R.id.cofm2);
        bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Room2.this, Roombook.class);
                startActivity(main);
            }
        });
    }
}