package com.example.healthylife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signin_signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_signup);
    }
    public void signin (View view){
        Intent intent = new Intent(signin_signup.this,healthylife_signin.class);
        startActivity(intent);
    }

}