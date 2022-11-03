package com.example.dayfinder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class layoutcode extends AppCompatActivity {
    Button code, contact, layout_code, login, MainActivity, rate_us;
    ImageButton repeat;
    TextView codeViewer, instruction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layoutcode);

        code = findViewById(R.id.code);
        contact = findViewById(R.id.contact_us);
        layout_code = findViewById(R.id.Layoutcode);
        login = findViewById(R.id.Login);
        MainActivity = findViewById(R.id.MainActivity);
        rate_us = findViewById(R.id.rate_us);
        codeViewer = findViewById(R.id.layout_code);
        repeat = findViewById(R.id.repeat);
        instruction = findViewById(R.id.instructions);

        code.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                codeViewer.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    android:background=\"@color/colorPrimary\"\n" +
                        "    android:orientation=\"vertical\"\n" +
                        "    tools:context=\".code\" >\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/TextView\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:text=\"@string/All_code\"\n" +
                        "        android:textSize=\"24sp\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/all_layout\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:text=\"@string/All_layout\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/all_activity\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:text=\"@string/activity\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/all_values\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:text=\"@string/values\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/gradle\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20dp\"\n" +
                        "        android:layout_marginTop=\"20dp\"\n" +
                        "        android:layout_marginRight=\"20dp\"\n" +
                        "        android:text=\"@string/gradle\" />\n" +
                        "</LinearLayout>");

                code.setVisibility(View.GONE);
                contact.setVisibility(View.GONE);
                layout_code.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                MainActivity.setVisibility(View.GONE);
                rate_us.setVisibility(View.GONE);
                instruction.setVisibility(View.GONE);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                codeViewer.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    android:background=\"@color/colorPrimary\"\n" +
                        "    android:orientation=\"vertical\"\n" +
                        "    tools:context=\".Contact_us\">\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/Name\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginStart=\"90sp\"\n" +
                        "        android:layout_marginTop=\"10sp\"\n" +
                        "        android:text=\"@string/name\"\n" +
                        "        android:textSize=\"30sp\"\n" +
                        "        tools:layout_editor_absoluteX=\"98dp\"\n" +
                        "        tools:layout_editor_absoluteY=\"16dp\" />\n" +
                        "\n" +
                        "    <ImageView\n" +
                        "        android:id=\"@+id/imageView\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"258dp\"\n" +
                        "        android:layout_marginStart=\"5sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        app:srcCompat=\"@drawable/image\"\n" +
                        "        tools:layout_editor_absoluteX=\"16dp\"\n" +
                        "        tools:layout_editor_absoluteY=\"-56dp\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/Contact\"\n" +
                        "        android:layout_width=\"wrap_content\"\n" +
                        "        android:layout_height=\"59dp\"\n" +
                        "        android:layout_marginStart=\"80sp\"\n" +
                        "        android:layout_marginTop=\"30sp\"\n" +
                        "        android:gravity=\"center|center_horizontal|center_vertical\"\n" +
                        "        android:text=\"@string/contact\"\n" +
                        "        android:textSize=\"36sp\"\n" +
                        "        tools:layout_editor_absoluteX=\"98dp\"\n" +
                        "        tools:layout_editor_absoluteY=\"363dp\" />\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"100sp\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:orientation=\"horizontal\">\n" +
                        "\n" +
                        "        <ImageButton\n" +
                        "            android:id=\"@+id/facebook\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_marginStart =\"10sp\"\n" +
                        "            app:srcCompat=\"@drawable/facebook\"\n" +
                        "            tools:layout_editor_absoluteX=\"66dp\"\n" +
                        "            tools:layout_editor_absoluteY=\"454dp\" />\n" +
                        "\n" +
                        "        <ImageButton\n" +
                        "            android:id=\"@+id/ig\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_marginStart =\"10sp\"\n" +
                        "            app:srcCompat=\"@drawable/ig\"\n" +
                        "            tools:layout_editor_absoluteX=\"163dp\"\n" +
                        "            tools:layout_editor_absoluteY=\"454dp\" />\n" +
                        "\n" +
                        "        <ImageButton\n" +
                        "            android:id=\"@+id/twitter\"\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_marginStart=\"10sp\"\n" +
                        "            app:srcCompat=\"@drawable/twitter\"\n" +
                        "            tools:layout_editor_absoluteX=\"256dp\"\n" +
                        "            tools:layout_editor_absoluteY=\"454dp\" />\n" +
                        "\n" +
                        "        <ImageButton\n" +
                        "            android:id=\"@+id/mail\"\n" +
                        "            android:layout_width=\"0dp\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_marginStart=\"10sp\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            app:srcCompat=\"@drawable/gmail\" />\n" +
                        "    </LinearLayout>\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/copyright\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"10sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:text=\"@string/copyright\"\n" +
                        "        android:textColor=\"@color/copyright\"\n" +
                        "        android:textSize=\"24sp\" />\n" +
                        "\n" +
                        "</LinearLayout>");

                code.setVisibility(View.GONE);
                contact.setVisibility(View.GONE);
                layout_code.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                MainActivity.setVisibility(View.GONE);
                rate_us.setVisibility(View.GONE);
                instruction.setVisibility(View.GONE);
            }
        });

        layout_code.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                codeViewer.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    android:background=\"@color/colorPrimary\"\n" +
                        "    android:orientation=\"vertical\"\n" +
                        "    tools:context=\".layoutcode\">\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/textView2\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:background=\"@color/colorPrimary\"\n" +
                        "        android:text=\"@string/layout\"\n" +
                        "        android:textSize=\"24sp\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/code\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:background=\"@color/colorPrimary\"\n" +
                        "        android:text=\"@string/code\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/contact_us\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:background=\"@color/colorPrimary\"\n" +
                        "        android:text=\"@string/contact_code\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Layoutcode\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:background=\"@color/colorPrimary\"\n" +
                        "        android:text=\"@string/layout\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/Login\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:background=\"@color/colorPrimary\"\n" +
                        "        android:text=\"@string/login\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/MainActivity\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:background=\"@color/colorPrimary\"\n" +
                        "        android:text=\"@string/MainActivity_layout\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/rate_us\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:background=\"@color/colorPrimary\"\n" +
                        "        android:text=\"@string/rate_us\" />\n" +
                        "\n" +
                        "    <EditText\n" +
                        "        android:id=\"@+id/layout_code\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:ems=\"10\"\n" +
                        "        android:gravity=\"start|top\"\n" +
                        "        android:inputType=\"textMultiLine\" />\n" +
                        "\n" +
                        "</LinearLayout>");

                code.setVisibility(View.GONE);
                contact.setVisibility(View.GONE);
                layout_code.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                MainActivity.setVisibility(View.GONE);
                rate_us.setVisibility(View.GONE);
                instruction.setVisibility(View.GONE);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                codeViewer.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    android:background=\"@color/colorPrimary\"\n" +
                        "    android:orientation=\"vertical\"\n" +
                        "    tools:context=\".login\">\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/Text\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:text=\"@string/walla\"\n" +
                        "        android:textSize=\"30sp\" />\n" +
                        "\n" +
                        "    <EditText\n" +
                        "        android:id=\"@+id/login\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"60sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:ems=\"10\"\n" +
                        "        android:hint=\"@string/login\"\n" +
                        "        android:inputType=\"textPassword\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/btnlogin\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:text=\"@string/submit\"\n" +
                        "     />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/show\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:background=\"@color/colorPrimary\"\n" +
                        "        android:textColor=\"@color/text_colour\"\n" +
                        "        android:textSize=\"30sp\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/copyright\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"60sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:text=\"@string/copyright\"\n" +
                        "        android:textColor=\"@color/copyright\"\n" +
                        "        android:textSize=\"24sp\" />\n" +
                        "</LinearLayout>");

                code.setVisibility(View.GONE);
                contact.setVisibility(View.GONE);
                layout_code.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                MainActivity.setVisibility(View.GONE);
                rate_us.setVisibility(View.GONE);
                instruction.setVisibility(View.GONE);
            }
        });

        MainActivity.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                codeViewer.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:id=\"@+id/background\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    android:background=\"#8CD0B2\"\n" +
                        "    android:orientation=\"vertical\"\n" +
                        "    android:paddingLeft=\"20dp\"\n" +
                        "    android:paddingTop=\"20dp\"\n" +
                        "    android:paddingRight=\"20dp\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/instructions\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginBottom=\"20dp\"\n" +
                        "        android:fontFamily=\"casual\"\n" +
                        "        android:text=\"@string/instructions\"\n" +
                        "        android:textColor=\"@color/text_colour\"\n" +
                        "        android:textSize=\"20sp\" />\n" +
                        "\n" +
                        "    <EditText\n" +
                        "        android:id=\"@+id/Input\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:background=\"@color/Input\"\n" +
                        "        android:ems=\"10\"\n" +
                        "        android:fontFamily=\"casual\"\n" +
                        "        android:hint=\"@string/date\"\n" +
                        "        android:importantForAutofill=\"no\"\n" +
                        "        android:inputType=\"date\"\n" +
                        "        android:paddingBottom=\"20dp\"\n" +
                        "        android:textColorHint=\"@color/text_colour\"\n" +
                        "        android:textSize=\"30sp\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/submit\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"10dp\"\n" +
                        "        android:background=\"@color/Button\"\n" +
                        "        android:fontFamily=\"casual\"\n" +
                        "        android:hint=\"@string/submit\"\n" +
                        "        android:textColorHint=\"@color/text_colour\"\n" +
                        "        android:textSize=\"20sp\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/result\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"10dp\"\n" +
                        "        android:background=\"@color/Output\"\n" +
                        "        android:fontFamily=\"casual\"\n" +
                        "        android:textColor=\"@color/text_colour\"\n" +
                        "        android:textSize=\"30sp\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/tryagain\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"40sp\"\n" +
                        "        android:background=\"@color/Try_again\"\n" +
                        "        android:text=\"@string/tryagain\"\n" +
                        "        android:textSize=\"20sp\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/rate\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"20sp\"\n" +
                        "        android:background=\"@color/rate_it\"\n" +
                        "        android:text=\"@string/rate\"\n" +
                        "        android:textSize=\"24sp\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/contact\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"10sp\"\n" +
                        "        android:background=\"@color/Contact_us\"\n" +
                        "        android:text=\"@string/contact_us\"\n" +
                        "        android:textSize=\"30sp\" />\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/copyright\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginTop=\"30sp\"\n" +
                        "        android:text=\"@string/copyright\"\n" +
                        "        android:textColor=\"@color/copyright\"\n" +
                        "        android:textSize=\"24sp\" />\n" +
                        "\n" +
                        "</LinearLayout>");

                code.setVisibility(View.GONE);
                contact.setVisibility(View.GONE);
                layout_code.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                MainActivity.setVisibility(View.GONE);
                rate_us.setVisibility(View.GONE);
                instruction.setVisibility(View.GONE);
            }
        });

        rate_us.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                codeViewer.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:id=\"@+id/background\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    android:background=\"@color/colorPrimary\"\n" +
                        "    android:orientation=\"vertical\"\n" +
                        "    tools:context=\".rate_us\">\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/rate\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"2sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:text=\"@string/rate_rate\"\n" +
                        "        android:textSize=\"30sp\" />\n" +
                        "\n" +
                        "    <LinearLayout\n" +
                        "        android:id=\"@+id/reactions\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"100sp\"\n" +
                        "        android:layout_marginBottom=\"0sp\"\n" +
                        "        android:orientation=\"horizontal\">\n" +
                        "\n" +
                        "        <ImageButton\n" +
                        "            android:id=\"@+id/satisfied\"\n" +
                        "            android:layout_width=\"200sp\"\n" +
                        "            android:layout_height=\"100sp\"\n" +
                        "            android:layout_marginTop=\"10sp\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:background=\"@color/colorPrimary\"\n" +
                        "            app:srcCompat=\"@drawable/very_satisfied\" />\n" +
                        "\n" +
                        "        <ImageButton\n" +
                        "            android:id=\"@+id/happy\"\n" +
                        "            android:layout_width=\"200sp\"\n" +
                        "            android:layout_height=\"100sp\"\n" +
                        "            android:layout_marginTop=\"10sp\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:background=\"@color/colorPrimary\"\n" +
                        "            app:srcCompat=\"@drawable/happy\" />\n" +
                        "\n" +
                        "        <ImageButton\n" +
                        "            android:id=\"@+id/neutral\"\n" +
                        "            android:layout_width=\"200sp\"\n" +
                        "            android:layout_height=\"100sp\"\n" +
                        "            android:layout_marginTop=\"10sp\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:background=\"@color/colorPrimary\"\n" +
                        "            app:srcCompat=\"@drawable/neutral\" />\n" +
                        "\n" +
                        "        <ImageButton\n" +
                        "            android:id=\"@+id/sad\"\n" +
                        "            android:layout_width=\"200sp\"\n" +
                        "            android:layout_height=\"100sp\"\n" +
                        "            android:layout_marginTop=\"10sp\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:background=\"@color/colorPrimary\"\n" +
                        "            app:srcCompat=\"@drawable/dissatisfied\" />\n" +
                        "\n" +
                        "        <ImageButton\n" +
                        "            android:id=\"@+id/dissatisfied\"\n" +
                        "            android:layout_width=\"200sp\"\n" +
                        "            android:layout_height=\"100sp\"\n" +
                        "            android:layout_marginTop=\"10sp\"\n" +
                        "            android:layout_weight=\"1\"\n" +
                        "            android:background=\"@color/colorPrimary\"\n" +
                        "            app:srcCompat=\"@drawable/very_dis_happy\" />\n" +
                        "\n" +
                        "    </LinearLayout>\n" +
                        "\n" +
                        "    <TextView\n" +
                        "        android:id=\"@+id/thanks\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:paddingLeft=\"20dp\"\n" +
                        "        android:paddingTop=\"0dp\"\n" +
                        "        android:paddingRight=\"20dp\"\n" +
                        "        android:text=\"@string/thanks\"\n" +
                        "        android:textSize=\"36sp\" />\n" +
                        "\n" +
                        "    <Button\n" +
                        "        android:id=\"@+id/easter_eggs\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\"\n" +
                        "        android:layout_marginLeft=\"20sp\"\n" +
                        "        android:layout_marginTop=\"250sp\"\n" +
                        "        android:layout_marginRight=\"20sp\"\n" +
                        "        android:background=\"@color/colorPrimary\"\n" +
                        "        android:text=\"@string/copyright\"\n" +
                        "        android:textColor=\"@color/copyright\"\n" +
                        "        android:textSize=\"24sp\" />\n" +
                        "\n" +
                        "</LinearLayout>");

                code.setVisibility(View.GONE);
                contact.setVisibility(View.GONE);
                layout_code.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                MainActivity.setVisibility(View.GONE);
                rate_us.setVisibility(View.GONE);
                instruction.setVisibility(View.GONE);
            }
        });

        repeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });
    }
}
