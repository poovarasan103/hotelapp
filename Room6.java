package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Room6 extends AppCompatActivity {
    ImageButton bok6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room6);

        bok6=(ImageButton)findViewById(R.id.cofm6);
        bok6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Room6.this, Roombook.class);
                startActivity(main);
            }
        });

    }
}
