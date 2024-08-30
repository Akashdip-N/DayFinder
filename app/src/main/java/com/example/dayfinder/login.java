package com.example.dayfinder;

import static android.view.View.GONE;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class login extends AppCompatActivity {
    private EditText ID;
    private Button submit;
    TextView show, instructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ID = findViewById(R.id.login);
        submit = findViewById(R.id.btnlogin);
        show = findViewById(R.id.show);
        instructions = findViewById(R.id.instructions_login);

        submit.setOnClickListener(v -> {
            String login_ID;
            login_ID = ID.getText().toString().trim();

            if( login_ID.equals("dayfinder@code") ) {
                Intent intent = new Intent(login.this, code.class);
                startActivity(intent);
            }
            else {
                show.setText(R.string.contact_dev);
                submit.setVisibility(GONE);
            }
        });
    }
}
