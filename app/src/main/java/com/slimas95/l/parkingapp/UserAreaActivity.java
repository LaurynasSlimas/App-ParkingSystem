package com.slimas95.l.parkingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
//        final EditText etCarModel = (EditText) findViewById(R.id.etCarModel);
//        final EditText etCarNumber = (EditText) findViewById(R.id.etCarNumber);
//        final EditText etBankAcc = (EditText) findViewById(R.id.etBankAcc);
        final EditText etFamilyName = (EditText) findViewById(R.id.etFamilyName);
        final EditText etPersonalCode = (EditText) findViewById(R.id.etPersonalCode);
    }
}
