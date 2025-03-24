package com.example.bubblechat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class CreateProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        setupNavigation();
    }

    private void setupNavigation() {
        // save Navigation
        findViewById(R.id.btn_save).setOnClickListener(v ->
                startActivity(new Intent(CreateProfile.this, ChatList.class))
        );

        // back Navigation
        findViewById(R.id.btnBack).setOnClickListener(v ->
                startActivity(new Intent(CreateProfile.this, ChatList.class))
        );

        // Logout Navigation
        findViewById(R.id.btn_logout).setOnClickListener(v ->
                startActivity(new Intent(CreateProfile.this, Login.class))
        );
    }
}