package com.example.bubblechat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setupNavigation();
    }

    private void setupNavigation() {
        // Register Navigation
        findViewById(R.id.Register).setOnClickListener(v ->
                startActivity(new Intent(Login.this, Register.class))
        );

        // Forgot Password Navigation
        findViewById(R.id.ForgotPassword).setOnClickListener(v ->
                startActivity(new Intent(Login.this, ForgotPassword.class))
        );

        // Login Navigation
        findViewById(R.id.Login).setOnClickListener(v ->
                startActivity(new Intent(Login.this, ChatList.class))
        );
    }

}