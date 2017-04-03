package com.example.welcome.chapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.Calendar;

public class Hotelmaintain extends ActionBarActivity {
    ImageButton rbok;
    Button roomchck;


    public static TextView SelectedDateViews;

    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            SelectedDateViews.setText("Selected Date: " + (month + 1) + "-" + day + "-" + year);
        }


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotelmaintain);

        SelectedDateViews = (TextView) findViewById(R.id.selected_dat);


        roomchck=(Button)findViewById(R.id.roomavl);
        roomchck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(Hotelmaintain.this, Checkrooms.class);
                startActivity(main);
            }
        });


    }




    public void showDatePickerDialogs(View v) {
        DialogFragment newFragment = new Hotelmaintain.DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

}
