package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Roomsdetails extends AppCompatActivity {

    Button ro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomsdetails);

        ro=(Button)findViewById(R.id.cusdtl);
        ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Roomsdetails.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
