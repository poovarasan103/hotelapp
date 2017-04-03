package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Adminhome extends AppCompatActivity {

    Button reg;
    private EditText name, st, ctt,post, phone, mail,web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminhome);
        name = (EditText) findViewById(R.id.reg_busname);
        st = (EditText) findViewById(R.id.reg_street);
        ctt = (EditText) findViewById(R.id.reg_city);
        post = (EditText) findViewById(R.id.reg_postal1);
        phone = (EditText) findViewById(R.id.reg_phone1);
        mail = (EditText) findViewById(R.id.reg_email1);
        web = (EditText) findViewById(R.id.reg_website);

        reg=(Button)findViewById(R.id.btnRegister);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().length() == 0) {
                    name.setError("Please Enter the Hotel Name");
                } else if (st.getText().toString().length() == 0) {
                    st.setError("Please Enter the Street Name");
                } else if (ctt.getText().toString().length() == 0) {
                    ctt.setError("Please Enter the City");
                } else if (phone.getText().toString().length() == 0) {
                    phone.setError("Please Enter the Phone Number");
                } else if (post.getText().toString().length() == 0) {
                    post.setError("Please Enter the Postal Code");
                } else if (mail.getText().toString().length() == 0) {
                    mail.setError("Please Enter the Email Code");
                } else if (web.getText().toString().length() == 0) {
                    web.setError("Please Enter the Website");
                } else {
                    Intent main = new Intent(Adminhome.this, Admindashboard.class);
                    startActivity(main);
                }
            }
        });


    }
}
