package com.example.dayfinder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class all_values_code extends AppCompatActivity {
    Button colors, strings, styles;
    ImageButton repeat;
    TextView codeviewer, instruction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_values_code);

        colors = findViewById(R.id.color);
        strings = findViewById(R.id.string_xml);
        styles = findViewById(R.id.styles_xml);
        codeviewer = findViewById(R.id.codeviewer);
        repeat = findViewById(R.id.repeat);
        instruction = findViewById(R.id.instructions);

        colors.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                codeviewer.setText("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<resources>\n" +
                        "    <color name=\"colorPrimary\">#8CD0B2</color>  <!-- this is the background colour FF693F72-->\n" +
                        "    <color name=\"Input\">#D9A1DC</color>\n" +
                        "    <color name=\"Button\">#8B0F5AD2</color>\n" +
                        "    <color name=\"Output\">#799595</color>\n" +
                        "    <color name=\"rate_it\">#A4A158</color>\n" +
                        "    <color name=\"Try_again\">#976B9D</color>\n" +
                        "    <color name=\"text_colour\">#0E0101</color>\n" +
                        "    <color name=\"copyright\">#F00F56</color>\n" +
                        "    <color name=\"Contact_us\">#288CAA</color>\n" +
                        "    <color name=\"dissatisfied\">#B31116</color>\n" +
                        "    <color name=\"sad\">#BD2C76</color>\n" +
                        "    <color name=\"neutral\">#9D8D1C</color>\n" +
                        "    <color name=\"happy\">#56A841</color>\n" +
                        "    <color name=\"satisfied\">#0C9512</color>\n" +
                        "</resources>\n");

                colors.setVisibility(View.GONE);
                strings.setVisibility(View.GONE);
                styles.setVisibility(View.GONE);
                instruction.setVisibility(View.GONE);
            }
        });

        strings.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                codeviewer.setText("<resources>\n" +
                        "    <string name=\"app_name\">Day Finder</string>\n" +
                        "    <string name=\"text\">result</string>\n" +
                        "    <string name=\"date\">Please enter the date: </string>\n" +
                        "    <string name=\"submit\">Submit</string>\n" +
                        "    <string name=\"copyright\"> © AKASHDIP NEOGI </string>\n" +
                        "    <string name=\"instructions\">Please enter the year between the year limit of (1800 to 3000) and in (DD/MM/YYYY) format or in DDMMYYYY format. </string>\n" +
                        "    <string name=\"rate\">WANT TO RATE THIS APP?</string>\n" +
                        "    <string name=\"tryagain\">WANT TO TRY THIS APP AGAIN?</string>\n" +
                        "    <string name=\"name\">Akashdip Neogi</string>\n" +
                        "    <string name=\"contact\">Contact Us On</string>\n" +
                        "    <string name=\"contact_us\">CONTACT US</string>\n" +
                        "    <string name=\"mail\">Drop us a mail</string>\n" +
                        "    <string name=\"rate_rate\">PLEASE RATE US ACCORDING TO THE APP USING EXPERIENCE</string>\n" +
                        "    <string name=\"thanks\">THANKS FOR YOUR VALUABLE FEEDBACK :)</string>\n" +
                        "    <string name=\"walla\">WOW AMAZING YOU GOT THE EASTER EGG IN OUR APP </string>\n" +
                        "    <string name=\"login\">Please enter the ID: </string>\n" +
                        "    <string name=\"title_activity_layout_code\">layout_code</string>\n" +
                        "    <string name=\"layout\">Layout code where all the codes are saved</string>\n" +
                        "    <string name=\"activity\">All Activity code</string>\n" +
                        "    <string name=\"MainActivity_layout\">MainActivity Layout code</string>\n" +
                        "    <string name=\"code\">code layout code</string>\n" +
                        "    <string name=\"contact_code\">Contact Us Layout code</string>\n" +
                        "    <string name=\"layoutCode\">Layout(layout) code</string>\n" +
                        "    <string name=\"Login_code\">Login Layout code</string>\n" +
                        "    <string name=\"rate_us\">Rate Us Layout code</string>\n" +
                        "    <string name=\"All_layout\">All Layout files code</string>\n" +
                        "    <string name=\"All_code\">Code fragments</string>\n" +
                        "    <string name=\"values\">Values codes</string>\n" +
                        "    <string name=\"gradle\">Build.gradle code</string>\n" +
                        "    <string name=\"code_class_activity_code\">code class activity code</string>\n" +
                        "    <string name=\"contact_us_activity_code\">Contact Us Activity code</string>\n" +
                        "    <string name=\"activity_code_where_all_the_codes_are_saved\">Activity code where all the codes are saved</string>\n" +
                        "    <string name=\"login_activity_code\">Login Activity code</string>\n" +
                        "    <string name=\"mainactivity_code\">Mainactivity code</string>\n" +
                        "    <string name=\"rate_us_activity_code\">rate us activity code</string>\n" +
                        "    <string name=\"string\">string.xml</string>\n" +
                        "    <string name=\"styles_xml\">Styles.xml</string>\n" +
                        "    <string name=\"colors_xml\">colors.xml</string>\n" +
                        "    <string name=\"all_values_codes\">All values codes</string>\n" +
                        "</resources>");

                colors.setVisibility(View.GONE);
                strings.setVisibility(View.GONE);
                styles.setVisibility(View.GONE);
                instruction.setVisibility(View.GONE);
            }
        });

        styles.setOnClickListener(new View.OnClickListener() {
            @Override
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                codeviewer.setText("<resources>\n" +
                        "\n" +
                        "    <!-- Base application theme. -->\n" +
                        "    <style name=\"AppTheme\" parent=\"Theme.AppCompat.Light.DarkActionBar\">\n" +
                        "        <!-- Customize your theme here. -->\n" +
                        "        <item name=\"colorPrimary\">@color/colorPrimary</item>\n" +
                        "        <item name=\"android:fontFamily\">sans-serif-medium</item>\n" +
                        "        <item name=\"android:textColor\">@color/text_colour</item>\n" +
                        "        <item name=\"android:textColorHint\">@color/text_colour</item>\n" +
                        "    </style>\n" +
                        "\n" +
                        "    <style name=\"AppTheme.NoActionBar\">\n" +
                        "        <item name=\"windowActionBar\">false</item>\n" +
                        "        <item name=\"windowNoTitle\">true</item>\n" +
                        "    </style>\n" +
                        "\n" +
                        "    <style name=\"AppTheme.AppBarOverlay\" parent=\"ThemeOverlay.AppCompat.Dark.ActionBar\" />\n" +
                        "\n" +
                        "    <style name=\"AppTheme.PopupOverlay\" parent=\"ThemeOverlay.AppCompat.Light\" />\n" +
                        "\n" +
                        "</resources>\n");

                colors.setVisibility(View.GONE);
                strings.setVisibility(View.GONE);
                styles.setVisibility(View.GONE);
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
