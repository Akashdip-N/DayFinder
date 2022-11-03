package com.example.dayfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class login extends AppCompatActivity {
    private EditText ID;
    private Button submit;
    TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ID = findViewById(R.id.login);
        submit = findViewById(R.id.btnlogin);
        show = findViewById(R.id.show);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String login_ID;
                login_ID = ID.getText().toString().trim();

                if( login_ID.equals("dayfinder@code") ) {
                    Intent intent = new Intent(login.this, code.class);
                    startActivity(intent);
                }
                else
                if( login_ID.equals("NB") )
                {
                    Toast.makeText(login.this, " WELCOME MY LOVE ❤", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this, code.class);
                    startActivity(intent);
                }
                else
                {
                    show.setText("PLEASE CONTACT THE DEVELOPER TO ACCESS THIS FILE!!!");
                }
            }
        });
    }
}
