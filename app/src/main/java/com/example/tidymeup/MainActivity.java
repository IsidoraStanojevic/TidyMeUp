package com.example.tidymeup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogIn = findViewById(R.id.buttonLogIn);
        buttonLogIn.setOnClickListener(this);

        Button buttonOrder = findViewById(R.id.buttonOrder);
        buttonOrder.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.buttonLogIn:
                this.doLogIn();
                break;
            case R.id.buttonOrder:
                this.doOrder();
                break;
        }

    }


    private void doLogIn() {

        startActivity(new Intent(this, LogInActivity.class));
    }

    private void doOrder() {

        startActivity(new Intent(this, OrderActivity.class));
    }
}