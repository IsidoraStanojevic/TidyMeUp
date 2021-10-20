package com.example.tidymeup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class ConformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conformation);


        Bundle extra = getIntent().getExtras();

        Boolean vacuuming = extra.getBoolean("vacuuming");
        Boolean dusting = extra.getBoolean("dusting");
        Boolean window_cleaning = extra.getBoolean("window_cleaning");
        Boolean floor_mopping = extra.getBoolean("floor_mopping");
        Boolean laundry = extra.getBoolean("laundry");

        String name_and_surname = extra.getString("name_and_surname");
        String address = extra.getString("address");

        String date = extra.getString("date");

        String message = "Are you satisfied with your order? \n";
        message += "Vacuuming: " +( (vacuuming)? "yes \n" : "no \n") ;
        message += "Dusting: " + ((dusting)? "yes\n" : "no \n") ;
        message += "Window Cleaning: " + ((window_cleaning)? "yes\n" : "no \n") ;
        message +="Floor Mopping: " + ((floor_mopping)? "yes\n" : "no \n") ;
        message += "Laundry: " + ((laundry)? "yes \n" : "no \n") ;
        message += "Name and surname: " + name_and_surname + "\n";
        message += "Postal address: " + address + "\n";
        message += "Date: " + date ;



        ((TextView)findViewById(R.id.labelMessage)).setText(message);

        // button confirm sends na email to my and to users account


    }
}