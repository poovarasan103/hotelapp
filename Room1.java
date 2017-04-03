package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Room1 extends AppCompatActivity {

    ImageButton bok1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room1);

        bok1=(ImageButton)findViewById(R.id.cofm1);
        bok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Room1.this, Roombook.class);
                startActivity(main);
            }
        });
    }
}
