package com.example.bubblechat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        setupNavigation();
    }

    private void setupNavigation() {
        // save Navigation
        findViewById(R.id.btnSave).setOnClickListener(v ->
                startActivity(new Intent(AddContact.this, ChatList.class))
        );

        // back Navigation
        findViewById(R.id.btnBack).setOnClickListener(v ->
                startActivity(new Intent(AddContact.this, ChatList.class))
        );

    }
}