package com.example.bubblechat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class ResetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> onBackPressed());

        setupNavigation();
    }

    private void setupNavigation() {
        // Register Navigation
        findViewById(R.id.btnUpdate).setOnClickListener(v ->
                startActivity(new Intent(ResetPassword.this, Login.class))
        );
    }
}