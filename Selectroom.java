package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Selectroom extends AppCompatActivity {

    ImageButton rooms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectroom);

        rooms=(ImageButton)findViewById(R.id.ro);
        rooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Selectroom.this,Viewroom.class);
                startActivity(main);
            }
        });

    }
}
