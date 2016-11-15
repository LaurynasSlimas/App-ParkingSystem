package com.example.justas.parkingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button bLogout;
    EditText etName, etUsername, etCarModel, etCarNumber, etBankAcc, etFamilyName;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.etName);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etCarModel = (EditText) findViewById(R.id.etCarModel);
        etCarNumber = (EditText) findViewById(R.id.etCarNumber);
        etBankAcc = (EditText) findViewById(R.id.etBankAcc);
        etFamilyName = (EditText) findViewById(R.id.etFamilyName);
        bLogout = (Button) findViewById(R.id.bLogout);

        bLogout.setOnClickListener(this);

        userLocalStore = new UserLocalStore(this);
    }

    @Override
    protected void onStart(){
        super.onStart();

        if (authenticate() == true){
            displayUserDetails();
        }

    }

    private boolean authenticate(){

        return userLocalStore.getUserLoggedIn();

    }

    private void displayUserDetails(){
        User user = userLocalStore.getLoggedInUser();
        etUsername.setText(user.username);
        etName.setText(user.name);
        etFamilyName.setText(user.familyName);
        etCarModel.setText(user.carModel);
        etCarNumber.setText(user.carNumber);
        etBankAcc.setText(user.bankAcc + "");
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogout:

                userLocalStore.clearUserData();
                userLocalStore.setUserLoggedIn(false);

                startActivity(new Intent(this, login.class));
                break;
        }
    }
}
