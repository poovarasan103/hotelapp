package com.example.welcome.chapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Userdetails extends AppCompatActivity {
    Button pchck;

    private EditText name, st, ctt,post, phone, mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdetails);
        name = (EditText) findViewById(R.id.reg_firstnam);
        st = (EditText) findViewById(R.id.reg_lastnam);
        ctt = (EditText) findViewById(R.id.reg_emai);
        post = (EditText) findViewById(R.id.reg_posta);
        phone = (EditText) findViewById(R.id.reg_phon);
        mail = (EditText) findViewById(R.id.reg_posm);

        pchck=(Button)findViewById(R.id.btnRegister12);
        pchck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().length() == 0) {
                    name.setError("Please Enter the Name");
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
                } else {
                    Intent main = new Intent(Userdetails.this, Paymentdetails.class);
                    startActivity(main);
                }
            }
        });
    }
}
