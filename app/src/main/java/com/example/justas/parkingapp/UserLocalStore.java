package com.example.justas.parkingapp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Laurynas on 11/15/2016.
 */

public class UserLocalStore {

    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context){

        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);

    }

    public void storeUserData(User user){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("name", user.name);
        spEditor.putString("familyName", user.familyName);
        spEditor.putString("password", user.password);
        spEditor.putString("username", user.username);
        spEditor.putString("carModel", user.carModel);
        spEditor.putString("carNumber", user.carNumber);
        spEditor.putInt("bankAcc", user.bankAcc);
        spEditor.commit();
    }

    public User getLoggedInUser() {
        String name = userLocalDatabase.getString("name","");
        String familyName = userLocalDatabase.getString("familyName", "");
        String username = userLocalDatabase.getString("username", "");
        String password = userLocalDatabase.getString("password", "");
        String carModel = userLocalDatabase.getString("carModel", "");
        String carNumber = userLocalDatabase.getString("carNumber", "");
        int bankAcc = userLocalDatabase.getInt("bankAcc", -1);

        User storedUser = new User(name, familyName, username, password, bankAcc, carModel, carNumber);
        return storedUser;

    }


}
