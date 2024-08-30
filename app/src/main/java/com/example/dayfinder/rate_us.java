package com.example.dayfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class rate_us extends AppCompatActivity {

    ImageButton satisfied, happy, neutral, sad, dissatisfied;
    TextView thanks, ester_egg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);
        show();
        ester_egg.setOnClickListener(v -> {
            Intent intent = new Intent(rate_us.this, login.class);
            Toast.makeText(
                    rate_us.this,
                    "Wooow nice you have found out the easter egg from this app.... ",
                    Toast.LENGTH_SHORT
            ).show();
            startActivity(intent);
        });

        satisfied.setOnClickListener(v -> {
            Toast.makeText(
                    rate_us.this,
                    "It seems that you are very much satisfied with the app's performance ☺️.",
                    Toast.LENGTH_SHORT
            ).show();
            hide();
        });

        happy.setOnClickListener(v -> {
            Toast.makeText(
                    rate_us.this,
                    "It seems that we have to work on this app's performance \uD83D\uDE42 ",
                Toast.LENGTH_SHORT
            ).show();
            hide();
        });

        neutral.setOnClickListener(v -> {
            Toast.makeText(
                    rate_us.this,
                    "It seems that you are ok with the app's performance.",
                    Toast.LENGTH_SHORT
            ).show();
            hide();
        });


        sad.setOnClickListener(view -> {
            Toast.makeText(
                    rate_us.this,
                    "It seems that you are not happy with the app's performance  \uD83D\uDE1F ",
                    Toast.LENGTH_SHORT
            ).show();
            hide();
        });

        dissatisfied.setOnClickListener(v -> {
            Toast.makeText(
                    rate_us.this,
                    "We are very sorry for this terrible experience \uD83D\uDE1E",
                Toast.LENGTH_SHORT
            ).show();
            hide();
        });
    }

    public void show(){
        satisfied = findViewById(R.id.satisfied);
        happy = findViewById(R.id.happy);
        neutral = findViewById(R.id.neutral);
        sad = findViewById(R.id.sad);
        dissatisfied = findViewById(R.id.dissatisfied);
        thanks = findViewById(R.id.thanks);
        ester_egg = findViewById(R.id.easter_egg);

        satisfied.setVisibility(View.VISIBLE);
        happy.setVisibility(View.VISIBLE);
        neutral.setVisibility(View.VISIBLE);
        sad.setVisibility(View.VISIBLE);
        dissatisfied.setVisibility(View.VISIBLE);
        thanks.setVisibility(View.GONE);
    }

    public void hide(){
        satisfied.setVisibility(View.GONE);
        happy.setVisibility(View.GONE);
        neutral.setVisibility(View.GONE);
        sad.setVisibility(View.GONE);
        dissatisfied.setVisibility(View.GONE);
        thanks.setVisibility(View.VISIBLE);
    }
}
