package com.example.bubblechat;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        setupNavigation();
    }

    private void setupNavigation() {
        // Add contact
        findViewById(R.id.btn_new_contact).setOnClickListener(v ->
                startActivity(new Intent(Contact.this, AddContact.class))
        );

        // Chat one
        findViewById(R.id.chat_1).setOnClickListener(v ->
                startActivity(new Intent(Contact.this, Chat.class))
        );

        // friends tab
        findViewById(R.id.tab_friends).setOnClickListener(v ->
                startActivity(new Intent(Contact.this, Friends.class))
        );

        // Chat List tab
        findViewById(R.id.btn_chats).setOnClickListener(v ->
                startActivity(new Intent(Contact.this, ChatList.class))
        );
    }

}