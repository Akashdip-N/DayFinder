package com.example.dayfinder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Contact_us extends AppCompatActivity {

    ImageButton facebook,twitter,ig, linkedin;
    TextView name;
    ImageButton mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        items();
        facebook.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Akashdip.N"));
            startActivity(intent);
        });

        twitter.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://x.com/akashdip_neogi"));
            startActivity(intent);
        });

       ig.setOnClickListener(v -> {
           Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/akashdip_neogi/"));
           startActivity(intent);
       });

        mail.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"akashdipneogi@gmail.com"});
            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent, "choose an email client:"));
        });

        linkedin.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/akashdip-neogi/"));
            startActivity(intent);
        });
    }

    public void items(){
        name = findViewById(R.id.Name);
        facebook = findViewById(R.id.facebook);
        twitter = findViewById(R.id.twitter);
        ig = findViewById(R.id.ig);
        mail = findViewById(R.id.mail);
        linkedin = findViewById(R.id.linkedin);
        name.setVisibility(View.VISIBLE);
    }
}
