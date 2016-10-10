package com.lvsandroid.parseusers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //=== CREATE USER
//        ParseUser user = new ParseUser();
//
//        // Username and  password are required
//        user.setUsername("john");
//        user.setPassword("mypassword");
//
//        // The username is created in the remote database but localy too, and he is automatically logged in
//        user.signUpInBackground(new SignUpCallback() {
//            @Override
//            public void done(ParseException e) {
//                if (e == null) {
//                    Log.i("signUpInBackground", "Successful");
//                } else {
//                    Log.e("signUpInBackground", "Failed");
//                    Log.e("signUpInBackground",e.toString());
//                }
//            }
//        });

//        //=== LOG A USER
//        ParseUser.logInInBackground("john", "mypassword123", new LogInCallback() {
//            @Override
//            public void done(ParseUser user, ParseException e) {
//                if (e == null) {
//
//                    Log.i("LogInCallback", "Successful");
//                } else {
//                    Log.e("LogInCallback", "Failed");
//                    Log.e("LogInCallback",e.toString());
//                }
//            }
//        });

//        //=== LOGOUT USER
//        ParseUser.logOut();
//
//        //=== CHECK IF THE USER IS ALREADY LOGGED IN
//        if(ParseUser.getCurrentUser() != null) {
//            Log.i("currentUser","User logged in");
//        } else {
//            Log.i("currentUser","User not logged in");
//        }
    }
}
