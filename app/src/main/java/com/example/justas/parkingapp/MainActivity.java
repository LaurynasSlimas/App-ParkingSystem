package com.example.justas.parkingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button bLogout;
    EditText etName, etUsername, etCarModel, etCarBrand, etBankAcc, etFamilyName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etCarModel = (EditText) findViewById(R.id.etCarModel);
        etCarBrand = (EditText) findViewById(R.id.etCarBrand);
        etBankAcc = (EditText) findViewById(R.id.etBankAcc);
        etFamilyName = (EditText) findViewById(R.id.etFamilyName);
        bLogout = (Button) findViewById(R.id.bLogout);

        bLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogout:

                startActivity(new Intent(this, login.class));
                break;
        }
    }
}
