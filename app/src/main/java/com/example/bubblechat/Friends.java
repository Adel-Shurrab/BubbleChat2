package com.example.bubblechat;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Friends extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        setupNavigation();
    }

    private void setupNavigation() {

        // Contact tab
        findViewById(R.id.friend_item).setOnClickListener(v ->
                startActivity(new Intent(Friends.this, Chat.class))
        );

        // Contact tab
        findViewById(R.id.btn_contacts).setOnClickListener(v ->
                startActivity(new Intent(Friends.this, Contact.class))
        );

        // Chats tab
        findViewById(R.id.btn_chats).setOnClickListener(v ->
                startActivity(new Intent(Friends.this, ChatList.class))
        );
    }
}