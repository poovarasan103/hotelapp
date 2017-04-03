package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Userhome extends AppCompatActivity {

    ImageButton map;
    Button sr;
    AutoCompleteTextView text;

    String[] languages={"coimbatore ","chennai","erode","salem","trichy","cuddalore","coonoor","cheyyar","colachel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userhome);
        map=(ImageButton)findViewById(R.id.map);
        text=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Userhome.this,MapsActivity.class);
                startActivity(main);
            }
        });

        sr=(Button)findViewById(R.id.simpleSearchView);
        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( text.getText().toString().trim().equals("")){

                    /**
                     *   You can Toast a message here that the Username is Empty
                     **/

                    text.setError( "City name is required!" );

                }else if( text.getText().toString().trim().equals("coimbatore")){
                    Intent main = new Intent(Userhome.this,Hotelscbe.class);
                    startActivity(main);
                }else if( text.getText().toString().trim().equals("chennai")){
                    Intent main = new Intent(Userhome.this,HotelsChn.class);
                    startActivity(main);
                }else {
                    Intent main = new Intent(Userhome.this,Hotellist.class);
                    startActivity(main);
                }


            }
        });


        ArrayAdapter adapter = new
                ArrayAdapter(this,android.R.layout.simple_list_item_1,languages);

        text.setAdapter(adapter);
        text.setThreshold(1);


    }
}
