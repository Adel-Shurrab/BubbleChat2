package com.example.bubblechat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChatList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);

        setupNavigation();
    }

    private void setupNavigation() {
        // profile
        findViewById(R.id.btn_profile_settings).setOnClickListener(v ->
                startActivity(new Intent(ChatList.this, CreateProfile.class))
        );

        // Add contact
        findViewById(R.id.btn_new_chat).setOnClickListener(v ->
                startActivity(new Intent(ChatList.this, AddContact.class))
        );

        // Chat one
        findViewById(R.id.chat_1).setOnClickListener(v ->
                startActivity(new Intent(ChatList.this, Chat.class))
        );

        // friends tab
        findViewById(R.id.tab_friends).setOnClickListener(v ->
                startActivity(new Intent(ChatList.this, Friends.class))
        );

        // friends tab
        findViewById(R.id.btn_contacts).setOnClickListener(v ->
                startActivity(new Intent(ChatList.this, Contact.class))
        );
    }
}