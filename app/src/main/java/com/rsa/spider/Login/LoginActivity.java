package com.rsa.spider.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rsa.spider.R;

public class LoginActivity extends AppCompatActivity {

    TextView signup;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void putRegistration(View view)
    {
        Intent i = new Intent(LoginActivity.this, Register.class);
        startActivity(i);
    }

    public void putLogin(View view)
    {

    }
}