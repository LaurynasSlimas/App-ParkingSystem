package com.example.justas.parkingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity implements View.OnClickListener{

    Button bRegister;
    EditText etName, etUsername, etCarModel, etCarNumber, etBankAcc, etFamilyName, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.etName);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etCarModel = (EditText) findViewById(R.id.etCarModel);
        etCarNumber = (EditText) findViewById(R.id.etCarNumber);
        etBankAcc = (EditText) findViewById(R.id.etBankAcc);
        etFamilyName = (EditText) findViewById(R.id.etFamilyName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bRegister:

                break;
        }
    }
}
