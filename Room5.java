package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Room5 extends AppCompatActivity {


    ImageButton bok5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room5);

        bok5=(ImageButton)findViewById(R.id.cofm5);
        bok5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Room5.this, Roombook.class);
                startActivity(main);
            }
        });
    }
}