package com.example.bubblechat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Signup Button Click
        findViewById(R.id.Signup).setOnClickListener(v -> {
            startActivity(new Intent(Register.this, CreateProfile.class));
        });

        // Back to Login
        findViewById(R.id.Login).setOnClickListener(v -> onBackPressed());
    }
}