package com.example.justas.parkingapp;

/**
 * Created by Laurynas on 11/15/2016.
 */

public class User {
    String name, familyName, username, password, carNumber, carModel;
    int bankAcc;

    public User (String name, String familyName, String username, String password, int bankAcc, String carNumber, String carModel){

        this.name=name;
        this.familyName=familyName;
        this.username=username;
        this.password=password;
        this.bankAcc=bankAcc;
        this.carNumber=carNumber;
        this.carModel=carModel;


    }

    public User(String username, String password ) {

        this.name="";
        this.familyName="";
        this.username=username;
        this.password=password;
        this.bankAcc=-1;
        this.carNumber="";
        this.carModel="";


    }

}
