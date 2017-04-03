package com.example.welcome.chapp;

import android.*;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Paymentdetails   extends Activity {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    private EditText card, pin, cvv,postal, phoneno;
    Button sendBtn,cancelBtn;
    EditText txtphoneNo;
    EditText txtMessage;
    String phoneNo;
    String message = "Thank you for your payment!We are pleased to inform you that your reservation request has been received and confirmed.Thanks again and have a great day! ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentdetails);

        sendBtn = (Button) findViewById(R.id.btnSendSMS);
        txtphoneNo = (EditText) findViewById(R.id.editTextpay);
        //txtMessage = (EditText) findViewById(R.id.editText2);

        card = (EditText) findViewById(R.id.cardno);
        pin = (EditText) findViewById(R.id.pin);
        cvv = (EditText) findViewById(R.id.reg_city);
        postal = (EditText) findViewById(R.id.reg_postal1);
        phoneno = (EditText) findViewById(R.id.editTextpay);
        cancelBtn = (Button) findViewById(R.id.cancel);



        sendBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                if (card.getText().toString().length() == 0) {
                    card.setError("Please Enter Card Number");
                } else if (pin.getText().toString().length() == 0) {
                    pin.setError("Please Enter the PIN");
                } else if (cvv.getText().toString().length() == 0) {
                    cvv.setError("Please Enter the CVV Details");
                } else if (postal.getText().toString().length() == 0) {
                    postal.setError("Please Enter the  Postal Code");
                } else if (phoneno.getText().toString().length() == 0) {
                    phoneno.setError("Please Enter the Phone Number");
                } else {
                    sendSMS();
                }
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent main = new Intent(Paymentdetails.this,MainActivity.class);
                    startActivity(main);

            }
        });


    }


    public void sendSMS() {
        phoneNo = txtphoneNo.getText().toString();
        //message = txtMessage.getText().toString();

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo, null, message, null, null);
            Toast.makeText(getApplicationContext(), "Payment Successful!",
                    Toast.LENGTH_LONG).show();
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(),ex.getMessage().toString(),
                    Toast.LENGTH_LONG).show();
            ex.printStackTrace();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phoneNo, null, message, null, null);
                    Toast.makeText(getApplicationContext(), "Payment Successful!",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "SMS faild, please try again.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }

    }
}