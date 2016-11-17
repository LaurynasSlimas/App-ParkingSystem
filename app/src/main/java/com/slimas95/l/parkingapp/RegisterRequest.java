package com.slimas95.l.parkingapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Laurynas on 11/16/2016.
 */

public class RegisterRequest extends StringRequest{
    private static final String REGISTER_REQUEST_URL = "http://lausli.stud.if.ktu.lt/Register.php";
    private Map<String, String> params;

    public  RegisterRequest(String name, String familyName, String username, String password, String personalCode, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("familyName", familyName);
        params.put("password", password);
        params.put("personalCode", personalCode);
        params.put("username", username);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
