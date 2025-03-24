package com.example.bubblechat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        TextView btnBack = findViewById(R.id.backToLoginText);
        btnBack.setOnClickListener(v -> onBackPressed());

        setupNavigation();
    }

    private void setupNavigation() {
        // verify pass Navigation
        findViewById(R.id.resetButton).setOnClickListener(v ->
                startActivity(new Intent(ForgotPassword.this, VerifyCode.class))
        );
    }
}