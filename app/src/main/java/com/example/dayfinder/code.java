package com.example.dayfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class code extends AppCompatActivity {

    Button layout,activity, values, gradle;
    ImageButton repeat;
    TextView codeviewer, instruction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        layout = findViewById(R.id.all_layout);
        activity = findViewById(R.id.all_activity);
        values = findViewById(R.id.all_values);
        gradle = findViewById(R.id.gradle);
        codeviewer = findViewById(R.id.codeviewer);
        repeat = findViewById(R.id.repeat);
        instruction =findViewById(R.id.instructions);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(code.this, layoutcode.class);
                startActivity(intent);
            }
        });

        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(code.this, all_activity_code.class);
                startActivity(intent);
            }
        });

        values.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(code.this, all_values_code.class);
                startActivity(intent);
            }
        });

        gradle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                codeviewer.setText("apply plugin: 'com.android.application'\n\nandroid {\n    compileSdkVersion 29\n    buildToolsVersion \"29.0.2\"\n    defaultConfig {\n        applicationId \"com.example.dayfinder\"\n        minSdkVersion 19\n        targetSdkVersion 29\n        versionCode 1\n        versionName \"1.0\"\n        android.defaultConfig.vectorDrawables.useSupportLibrary = true\n        testInstrumentationRunner \"androidx.test.runner.AndroidJUnitRunner\"\n    }\n    buildTypes {\n        release {\n            minifyEnabled false\n            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'\n        }\n    }\n}\n\ndependencies {\n    implementation fileTree(dir: 'libs', include: ['*.jar'])\n    implementation 'androidx.appcompat:appcompat:1.1.0'\n    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'\n    implementation 'com.google.android.material:material:1.0.0'\n    testImplementation 'junit:junit:4.12'\n    androidTestImplementation 'androidx.test.ext:junit:1.1.0'\n    androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.1'\n    implementation 'androidx.recyclerview:recyclerview:1.1.0'\n}\n");
                layout.setVisibility(View.GONE);
                activity.setVisibility(View.GONE);
                values.setVisibility(View.GONE);
                gradle.setVisibility(View.GONE);
                instruction.setVisibility(View.GONE);
            }
        });

        repeat.setOnClickListener(v -> recreate());
    }
}
