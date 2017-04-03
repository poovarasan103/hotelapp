package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Room4 extends AppCompatActivity {

    ImageButton bok4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room4);

        bok4=(ImageButton)findViewById(R.id.cofm4);
        bok4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Room4.this, Roombook.class);
                startActivity(main);
            }
        });
    }
}