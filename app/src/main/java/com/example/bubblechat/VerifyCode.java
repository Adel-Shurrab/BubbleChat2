package com.example.bubblechat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class VerifyCode extends AppCompatActivity {

    private final EditText[] codeFields = new EditText[5];
    private Button btnVerify;
    private TextView tvResend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);

        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> onBackPressed());

        setupNavigation();

        codeFields[0] = findViewById(R.id.digit1);
        codeFields[1] = findViewById(R.id.digit2);
        codeFields[2] = findViewById(R.id.digit3);
        codeFields[3] = findViewById(R.id.digit4);
        codeFields[4] = findViewById(R.id.digit5);

        for (int i = 0; i < codeFields.length; i++) {
            int index = i;
            codeFields[i].addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (s.length() == 1 && index < codeFields.length - 1) {
                        codeFields[index + 1].requestFocus();
                    }
                }
            });
        }
    }

    private void setupNavigation() {
        // Register Navigation
        findViewById(R.id.btnUpdate).setOnClickListener(v ->
                startActivity(new Intent(VerifyCode.this, ResetPassword.class))
        );
    }
}
