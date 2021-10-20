package com.example.tidymeup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Switch;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        initComponents();

        DatePicker inputDate = (DatePicker) findViewById(R.id.inputDate);
        inputDate.updateDate(2021, 9, 20);
    }

    private void initComponents() {
        findViewById(R.id.buttonSubmit).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.buttonSubmit){
            Intent intent = new Intent(this, ConformationActivity.class);

            DatePicker inputDate = findViewById(R.id.inputDate);
            String dateString =String.format("%2d. %2d. %4d.", inputDate.getDayOfMonth(), inputDate.getMonth(), inputDate.getYear());

            Bundle extra = new Bundle();

            extra.putBoolean("vacuuming", ((Switch)findViewById(R.id.switchVacuuming)).isChecked());
            extra.putBoolean("dusting", ((Switch)findViewById(R.id.switchDusting)).isChecked());
            extra.putBoolean("window_cleaning", ((Switch)findViewById(R.id.switchWindowCleaning)).isChecked());
            extra.putBoolean("floor_mopping", ((Switch)findViewById(R.id.switchFloorMopping)).isChecked());
            extra.putBoolean("laundry", ((Switch)findViewById(R.id.switchLaundry)).isChecked());
            extra.putString("name_and_surname", ((EditText)findViewById(R.id.inputName)).getText().toString());
            extra.putString("address", ((EditText)findViewById(R.id.inputAddress)).getText().toString());

            extra.putString("date", dateString);



            intent.putExtras(extra);
            startActivity(intent);
        }
    }
}