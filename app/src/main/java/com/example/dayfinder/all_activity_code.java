package com.example.dayfinder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class all_activity_code extends AppCompatActivity {
    Button code, contact, layout_code, login, MainActivity, rate_us;
    ImageButton repeat;
    TextView codeViewer, instruction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_code);

        code = findViewById(R.id.code);
        contact = findViewById(R.id.contact_us);
        layout_code = findViewById(R.id.layout_code);
        login = findViewById(R.id.Login);
        MainActivity = findViewById(R.id.MainActivity);
        rate_us = findViewById(R.id.rate_us);
        codeViewer = findViewById(R.id.codeviewer);
        repeat = findViewById(R.id.repeat);
        instruction = findViewById(R.id.instructions);


        code.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                codeViewer.setText("package com.example.dayfinder;\n" +
                        "\n" +
                        "import androidx.appcompat.app.AppCompatActivity;\n" +
                        "\n" +
                        "import android.content.Intent;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class code extends AppCompatActivity {\n" +
                        "\n" +
                        "    Button layout,activity, values, gradle;\n" +
                        "    TextView codeviewer;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_code);\n" +
                        "\n" +
                        "        layout = findViewById(R.id.all_layout);\n" +
                        "        activity = findViewById(R.id.all_activity);\n" +
                        "        values = findViewById(R.id.all_values);\n" +
                        "        gradle = findViewById(R.id.gradle);\n" +
                        "        codeviewer = findViewById(R.id.codeviewer);\n" +
                        "\n" +
                        "        layout.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent = new Intent(code.this, com.example.dayfinder.layoutcode.class);\n" +
                        "                startActivity(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        activity.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent = new Intent(code.this, com.example.dayfinder.all_activity_code.class);\n" +
                        "                startActivity(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        values.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent = new Intent(code.this, com.example.dayfinder.all_values_code.class);\n" +
                        "                startActivity(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        gradle.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                codeviewer.setText(\"apply plugin: 'com.android.application'\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"android {\\n\" +\n" +
                        "                        \"    compileSdkVersion 29\\n\" +\n" +
                        "                        \"    buildToolsVersion \\\"29.0.2\\\"\\n\" +\n" +
                        "                        \"    defaultConfig {\\n\" +\n" +
                        "                        \"        applicationId \\\"com.example.dayfinder\\\"\\n\" +\n" +
                        "                        \"        minSdkVersion 19\\n\" +\n" +
                        "                        \"        targetSdkVersion 29\\n\" +\n" +
                        "                        \"        versionCode 1\\n\" +\n" +
                        "                        \"        versionName \\\"1.0\\\"\\n\" +\n" +
                        "                        \"        android.defaultConfig.vectorDrawables.useSupportLibrary = true\\n\" +\n" +
                        "                        \"        testInstrumentationRunner \\\"androidx.test.runner.AndroidJUnitRunner\\\"\\n\" +\n" +
                        "                        \"    }\\n\" +\n" +
                        "                        \"    buildTypes {\\n\" +\n" +
                        "                        \"        release {\\n\" +\n" +
                        "                        \"            minifyEnabled false\\n\" +\n" +
                        "                        \"            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'\\n\" +\n" +
                        "                        \"        }\\n\" +\n" +
                        "                        \"    }\\n\" +\n" +
                        "                        \"}\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"dependencies {\\n\" +\n" +
                        "                        \"    implementation fileTree(dir: 'libs', include: ['*.jar'])\\n\" +\n" +
                        "                        \"    implementation 'androidx.appcompat:appcompat:1.1.0'\\n\" +\n" +
                        "                        \"    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'\\n\" +\n" +
                        "                        \"    implementation 'com.google.android.material:material:1.0.0'\\n\" +\n" +
                        "                        \"    testImplementation 'junit:junit:4.12'\\n\" +\n" +
                        "                        \"    androidTestImplementation 'androidx.test.ext:junit:1.1.0'\\n\" +\n" +
                        "                        \"    androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.1'\\n\" +\n" +
                        "                        \"    implementation 'androidx.recyclerview:recyclerview:1.1.0'\\n\" +\n" +
                        "                        \"}\\n\");\n" +
                        "\n" +
                        "\n" +
                        "                layout.setVisibility(View.GONE);\n" +
                        "                activity.setVisibility(View.GONE);\n" +
                        "                values.setVisibility(View.GONE);\n" +
                        "                gradle.setVisibility(View.GONE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}\n");

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
                codeViewer.setText("package com.example.dayfinder;\n" +
                        "\n" +
                        "import androidx.appcompat.app.AppCompatActivity;\n" +
                        "\n" +
                        "import android.content.Intent;\n" +
                        "import android.net.Uri;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.ImageButton;\n" +
                        "\n" +
                        "public class Contact_us extends AppCompatActivity {\n" +
                        "\n" +
                        "    ImageButton facebook,twitter,ig, mail;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_contact_us);\n" +
                        "\n" +
                        "        facebook = findViewById(R.id.facebook);\n" +
                        "        twitter = findViewById(R.id.twitter);\n" +
                        "        ig = findViewById(R.id.ig);\n" +
                        "        mail = findViewById(R.id.mail);\n" +
                        "\n" +
                        "\n" +
                        "        facebook.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(\"https://www.facebook.com/akashdip.neogi2001\"));\n" +
                        "                startActivity(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        twitter.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(\"https://twitter.com/akashdip_neogi\"));\n" +
                        "                startActivity(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "       ig.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(\"https://www.instagram.com/akashdip_neogi/\"));\n" +
                        "                startActivity(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        mail.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent = new Intent(Intent.ACTION_SEND);\n" +
                        "                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{\"akashdipneogi@gmail.com\"});\n" +
                        "                intent.setType(\"message/rfc822\");\n" +
                        "                startActivity(Intent.createChooser(intent, \"choose an email client:\"));\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}\n");

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

                codeViewer.setText("package com.example.dayfinder;\n" +
                        "\n" +
                        "import androidx.appcompat.app.AppCompatActivity;\n" +
                        "\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageButton;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "public class layoutcode extends AppCompatActivity {\n" +
                        "    Button code, contact, layout_code, login, MainActivity, rate_us;\n" +
                        "    ImageButton repeat;\n" +
                        "    TextView codeViewer, instruction;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_layoutcode);\n" +
                        "\n" +
                        "        code = findViewById(R.id.code);\n" +
                        "        contact = findViewById(R.id.contact_us);\n" +
                        "        layout_code = findViewById(R.id.Layoutcode);\n" +
                        "        login = findViewById(R.id.Login);\n" +
                        "        MainActivity = findViewById(R.id.MainActivity);\n" +
                        "        rate_us = findViewById(R.id.rate_us);\n" +
                        "        codeViewer = findViewById(R.id.layout_code);\n" +
                        "        repeat = findViewById(R.id.repeat);\n" +
                        "        instruction = findViewById(R.id.instructions);\n" +
                        "\n" +
                        "        code.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                codeViewer.setText(\"<?xml version=\\\"1.0\\\" encoding=\\\"utf-8\\\"?>\\n\" +\n" +
                        "                        \"<LinearLayout xmlns:android=\\\"http://schemas.android.com/apk/res/android\\\"\\n\" +\n" +
                        "                        \"    xmlns:app=\\\"http://schemas.android.com/apk/res-auto\\\"\\n\" +\n" +
                        "                        \"    xmlns:tools=\\\"http://schemas.android.com/tools\\\"\\n\" +\n" +
                        "                        \"    android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:layout_height=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"    android:orientation=\\\"vertical\\\"\\n\" +\n" +
                        "                        \"    tools:context=\\\".code\\\" >\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/TextView\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/All_code\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"24sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/all_layout\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/All_layout\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/all_activity\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/activity\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/all_values\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/values\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/gradle\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20dp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20dp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20dp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/gradle\\\" />\\n\" +\n" +
                        "                        \"</LinearLayout>\");\n" +
                        "\n" +
                        "                code.setVisibility(View.GONE);\n" +
                        "                contact.setVisibility(View.GONE);\n" +
                        "                layout_code.setVisibility(View.GONE);\n" +
                        "                login.setVisibility(View.GONE);\n" +
                        "                MainActivity.setVisibility(View.GONE);\n" +
                        "                rate_us.setVisibility(View.GONE);\n" +
                        "                instruction.setVisibility(View.GONE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        contact.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                codeViewer.setText(\"<?xml version=\\\"1.0\\\" encoding=\\\"utf-8\\\"?>\\n\" +\n" +
                        "                        \"<LinearLayout xmlns:android=\\\"http://schemas.android.com/apk/res/android\\\"\\n\" +\n" +
                        "                        \"    xmlns:app=\\\"http://schemas.android.com/apk/res-auto\\\"\\n\" +\n" +
                        "                        \"    xmlns:tools=\\\"http://schemas.android.com/tools\\\"\\n\" +\n" +
                        "                        \"    android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:layout_height=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"    android:orientation=\\\"vertical\\\"\\n\" +\n" +
                        "                        \"    tools:context=\\\".Contact_us\\\">\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/Name\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginStart=\\\"90sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"10sp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/name\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"30sp\\\"\\n\" +\n" +
                        "                        \"        tools:layout_editor_absoluteX=\\\"98dp\\\"\\n\" +\n" +
                        "                        \"        tools:layout_editor_absoluteY=\\\"16dp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <ImageView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/imageView\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"258dp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginStart=\\\"5sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        app:srcCompat=\\\"@drawable/image\\\"\\n\" +\n" +
                        "                        \"        tools:layout_editor_absoluteX=\\\"16dp\\\"\\n\" +\n" +
                        "                        \"        tools:layout_editor_absoluteY=\\\"-56dp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/Contact\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"59dp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginStart=\\\"80sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"30sp\\\"\\n\" +\n" +
                        "                        \"        android:gravity=\\\"center|center_horizontal|center_vertical\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/contact\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"36sp\\\"\\n\" +\n" +
                        "                        \"        tools:layout_editor_absoluteX=\\\"98dp\\\"\\n\" +\n" +
                        "                        \"        tools:layout_editor_absoluteY=\\\"363dp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <LinearLayout\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"100sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:orientation=\\\"horizontal\\\">\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"        <ImageButton\\n\" +\n" +
                        "                        \"            android:id=\\\"@+id/facebook\\\"\\n\" +\n" +
                        "                        \"            android:layout_width=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"            android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"            android:layout_marginStart =\\\"10sp\\\"\\n\" +\n" +
                        "                        \"            app:srcCompat=\\\"@drawable/facebook\\\"\\n\" +\n" +
                        "                        \"            tools:layout_editor_absoluteX=\\\"66dp\\\"\\n\" +\n" +
                        "                        \"            tools:layout_editor_absoluteY=\\\"454dp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"        <ImageButton\\n\" +\n" +
                        "                        \"            android:id=\\\"@+id/ig\\\"\\n\" +\n" +
                        "                        \"            android:layout_width=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"            android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"            android:layout_marginStart =\\\"10sp\\\"\\n\" +\n" +
                        "                        \"            app:srcCompat=\\\"@drawable/ig\\\"\\n\" +\n" +
                        "                        \"            tools:layout_editor_absoluteX=\\\"163dp\\\"\\n\" +\n" +
                        "                        \"            tools:layout_editor_absoluteY=\\\"454dp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"        <ImageButton\\n\" +\n" +
                        "                        \"            android:id=\\\"@+id/twitter\\\"\\n\" +\n" +
                        "                        \"            android:layout_width=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"            android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"            android:layout_marginStart=\\\"10sp\\\"\\n\" +\n" +
                        "                        \"            app:srcCompat=\\\"@drawable/twitter\\\"\\n\" +\n" +
                        "                        \"            tools:layout_editor_absoluteX=\\\"256dp\\\"\\n\" +\n" +
                        "                        \"            tools:layout_editor_absoluteY=\\\"454dp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"        <ImageButton\\n\" +\n" +
                        "                        \"            android:id=\\\"@+id/mail\\\"\\n\" +\n" +
                        "                        \"            android:layout_width=\\\"0dp\\\"\\n\" +\n" +
                        "                        \"            android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"            android:layout_marginStart=\\\"10sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_weight=\\\"1\\\"\\n\" +\n" +
                        "                        \"            app:srcCompat=\\\"@drawable/gmail\\\" />\\n\" +\n" +
                        "                        \"    </LinearLayout>\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/copyright\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"10sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/copyright\\\"\\n\" +\n" +
                        "                        \"        android:textColor=\\\"@color/copyright\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"24sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"</LinearLayout>\");\n" +
                        "\n" +
                        "                code.setVisibility(View.GONE);\n" +
                        "                contact.setVisibility(View.GONE);\n" +
                        "                layout_code.setVisibility(View.GONE);\n" +
                        "                login.setVisibility(View.GONE);\n" +
                        "                MainActivity.setVisibility(View.GONE);\n" +
                        "                rate_us.setVisibility(View.GONE);\n" +
                        "                instruction.setVisibility(View.GONE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        layout_code.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                codeViewer.setText(\"<?xml version=\\\"1.0\\\" encoding=\\\"utf-8\\\"?>\\n\" +\n" +
                        "                        \"<LinearLayout xmlns:android=\\\"http://schemas.android.com/apk/res/android\\\"\\n\" +\n" +
                        "                        \"    xmlns:app=\\\"http://schemas.android.com/apk/res-auto\\\"\\n\" +\n" +
                        "                        \"    xmlns:tools=\\\"http://schemas.android.com/tools\\\"\\n\" +\n" +
                        "                        \"    android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:layout_height=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"    android:orientation=\\\"vertical\\\"\\n\" +\n" +
                        "                        \"    tools:context=\\\".layoutcode\\\">\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/textView2\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/layout\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"24sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/code\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/code\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/contact_us\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/contact_code\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/Layoutcode\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/layout\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/Login\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/login\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/MainActivity\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/MainActivity_layout\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/rate_us\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/rate_us\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <EditText\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/layout_code\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:ems=\\\"10\\\"\\n\" +\n" +
                        "                        \"        android:gravity=\\\"start|top\\\"\\n\" +\n" +
                        "                        \"        android:inputType=\\\"textMultiLine\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"</LinearLayout>\");\n" +
                        "\n" +
                        "                code.setVisibility(View.GONE);\n" +
                        "                contact.setVisibility(View.GONE);\n" +
                        "                layout_code.setVisibility(View.GONE);\n" +
                        "                login.setVisibility(View.GONE);\n" +
                        "                MainActivity.setVisibility(View.GONE);\n" +
                        "                rate_us.setVisibility(View.GONE);\n" +
                        "                instruction.setVisibility(View.GONE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        login.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                codeViewer.setText(\"<?xml version=\\\"1.0\\\" encoding=\\\"utf-8\\\"?>\\n\" +\n" +
                        "                        \"<LinearLayout xmlns:android=\\\"http://schemas.android.com/apk/res/android\\\"\\n\" +\n" +
                        "                        \"    xmlns:app=\\\"http://schemas.android.com/apk/res-auto\\\"\\n\" +\n" +
                        "                        \"    xmlns:tools=\\\"http://schemas.android.com/tools\\\"\\n\" +\n" +
                        "                        \"    android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:layout_height=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"    android:orientation=\\\"vertical\\\"\\n\" +\n" +
                        "                        \"    tools:context=\\\".login\\\">\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/Text\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/walla\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"30sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <EditText\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/login\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"60sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:ems=\\\"10\\\"\\n\" +\n" +
                        "                        \"        android:hint=\\\"@string/login\\\"\\n\" +\n" +
                        "                        \"        android:inputType=\\\"textPassword\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/btnlogin\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/submit\\\"\\n\" +\n" +
                        "                        \"     />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/show\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"        android:textColor=\\\"@color/text_colour\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"30sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/copyright\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"60sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/copyright\\\"\\n\" +\n" +
                        "                        \"        android:textColor=\\\"@color/copyright\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"24sp\\\" />\\n\" +\n" +
                        "                        \"</LinearLayout>\");\n" +
                        "\n" +
                        "                code.setVisibility(View.GONE);\n" +
                        "                contact.setVisibility(View.GONE);\n" +
                        "                layout_code.setVisibility(View.GONE);\n" +
                        "                login.setVisibility(View.GONE);\n" +
                        "                MainActivity.setVisibility(View.GONE);\n" +
                        "                rate_us.setVisibility(View.GONE);\n" +
                        "                instruction.setVisibility(View.GONE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        MainActivity.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                codeViewer.setText(\"<?xml version=\\\"1.0\\\" encoding=\\\"utf-8\\\"?>\\n\" +\n" +
                        "                        \"<LinearLayout xmlns:android=\\\"http://schemas.android.com/apk/res/android\\\"\\n\" +\n" +
                        "                        \"    xmlns:tools=\\\"http://schemas.android.com/tools\\\"\\n\" +\n" +
                        "                        \"    android:id=\\\"@+id/background\\\"\\n\" +\n" +
                        "                        \"    android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:layout_height=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:background=\\\"#8CD0B2\\\"\\n\" +\n" +
                        "                        \"    android:orientation=\\\"vertical\\\"\\n\" +\n" +
                        "                        \"    android:paddingLeft=\\\"20dp\\\"\\n\" +\n" +
                        "                        \"    android:paddingTop=\\\"20dp\\\"\\n\" +\n" +
                        "                        \"    android:paddingRight=\\\"20dp\\\"\\n\" +\n" +
                        "                        \"    tools:context=\\\".MainActivity\\\">\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/instructions\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginBottom=\\\"20dp\\\"\\n\" +\n" +
                        "                        \"        android:fontFamily=\\\"casual\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/instructions\\\"\\n\" +\n" +
                        "                        \"        android:textColor=\\\"@color/text_colour\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"20sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <EditText\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/Input\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/Input\\\"\\n\" +\n" +
                        "                        \"        android:ems=\\\"10\\\"\\n\" +\n" +
                        "                        \"        android:fontFamily=\\\"casual\\\"\\n\" +\n" +
                        "                        \"        android:hint=\\\"@string/date\\\"\\n\" +\n" +
                        "                        \"        android:importantForAutofill=\\\"no\\\"\\n\" +\n" +
                        "                        \"        android:inputType=\\\"date\\\"\\n\" +\n" +
                        "                        \"        android:paddingBottom=\\\"20dp\\\"\\n\" +\n" +
                        "                        \"        android:textColorHint=\\\"@color/text_colour\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"30sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/submit\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"10dp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/Button\\\"\\n\" +\n" +
                        "                        \"        android:fontFamily=\\\"casual\\\"\\n\" +\n" +
                        "                        \"        android:hint=\\\"@string/submit\\\"\\n\" +\n" +
                        "                        \"        android:textColorHint=\\\"@color/text_colour\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"20sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/result\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"10dp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/Output\\\"\\n\" +\n" +
                        "                        \"        android:fontFamily=\\\"casual\\\"\\n\" +\n" +
                        "                        \"        android:textColor=\\\"@color/text_colour\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"30sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/tryagain\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"40sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/Try_again\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/tryagain\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"20sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/rate\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/rate_it\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/rate\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"24sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/contact\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"10sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/Contact_us\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/contact_us\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"30sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/copyright\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"30sp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/copyright\\\"\\n\" +\n" +
                        "                        \"        android:textColor=\\\"@color/copyright\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"24sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"</LinearLayout>\");\n" +
                        "\n" +
                        "                code.setVisibility(View.GONE);\n" +
                        "                contact.setVisibility(View.GONE);\n" +
                        "                layout_code.setVisibility(View.GONE);\n" +
                        "                login.setVisibility(View.GONE);\n" +
                        "                MainActivity.setVisibility(View.GONE);\n" +
                        "                rate_us.setVisibility(View.GONE);\n" +
                        "                instruction.setVisibility(View.GONE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        rate_us.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                codeViewer.setText(\"<?xml version=\\\"1.0\\\" encoding=\\\"utf-8\\\"?>\\n\" +\n" +
                        "                        \"<LinearLayout xmlns:android=\\\"http://schemas.android.com/apk/res/android\\\"\\n\" +\n" +
                        "                        \"    xmlns:app=\\\"http://schemas.android.com/apk/res-auto\\\"\\n\" +\n" +
                        "                        \"    xmlns:tools=\\\"http://schemas.android.com/tools\\\"\\n\" +\n" +
                        "                        \"    android:id=\\\"@+id/background\\\"\\n\" +\n" +
                        "                        \"    android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:layout_height=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"    android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"    android:orientation=\\\"vertical\\\"\\n\" +\n" +
                        "                        \"    tools:context=\\\".rate_us\\\">\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/rate\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"2sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/rate_rate\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"30sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <LinearLayout\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/reactions\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"100sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginBottom=\\\"0sp\\\"\\n\" +\n" +
                        "                        \"        android:orientation=\\\"horizontal\\\">\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"        <ImageButton\\n\" +\n" +
                        "                        \"            android:id=\\\"@+id/satisfied\\\"\\n\" +\n" +
                        "                        \"            android:layout_width=\\\"200sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_height=\\\"100sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_marginTop=\\\"10sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_weight=\\\"1\\\"\\n\" +\n" +
                        "                        \"            android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"            app:srcCompat=\\\"@drawable/very_satisfied\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"        <ImageButton\\n\" +\n" +
                        "                        \"            android:id=\\\"@+id/happy\\\"\\n\" +\n" +
                        "                        \"            android:layout_width=\\\"200sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_height=\\\"100sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_marginTop=\\\"10sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_weight=\\\"1\\\"\\n\" +\n" +
                        "                        \"            android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"            app:srcCompat=\\\"@drawable/happy\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"        <ImageButton\\n\" +\n" +
                        "                        \"            android:id=\\\"@+id/neutral\\\"\\n\" +\n" +
                        "                        \"            android:layout_width=\\\"200sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_height=\\\"100sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_marginTop=\\\"10sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_weight=\\\"1\\\"\\n\" +\n" +
                        "                        \"            android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"            app:srcCompat=\\\"@drawable/neutral\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"        <ImageButton\\n\" +\n" +
                        "                        \"            android:id=\\\"@+id/sad\\\"\\n\" +\n" +
                        "                        \"            android:layout_width=\\\"200sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_height=\\\"100sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_marginTop=\\\"10sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_weight=\\\"1\\\"\\n\" +\n" +
                        "                        \"            android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"            app:srcCompat=\\\"@drawable/dissatisfied\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"        <ImageButton\\n\" +\n" +
                        "                        \"            android:id=\\\"@+id/dissatisfied\\\"\\n\" +\n" +
                        "                        \"            android:layout_width=\\\"200sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_height=\\\"100sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_marginTop=\\\"10sp\\\"\\n\" +\n" +
                        "                        \"            android:layout_weight=\\\"1\\\"\\n\" +\n" +
                        "                        \"            android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"            app:srcCompat=\\\"@drawable/very_dis_happy\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    </LinearLayout>\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <TextView\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/thanks\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:paddingLeft=\\\"20dp\\\"\\n\" +\n" +
                        "                        \"        android:paddingTop=\\\"0dp\\\"\\n\" +\n" +
                        "                        \"        android:paddingRight=\\\"20dp\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/thanks\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"36sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"    <Button\\n\" +\n" +
                        "                        \"        android:id=\\\"@+id/easter_eggs\\\"\\n\" +\n" +
                        "                        \"        android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
                        "                        \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginLeft=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginTop=\\\"250sp\\\"\\n\" +\n" +
                        "                        \"        android:layout_marginRight=\\\"20sp\\\"\\n\" +\n" +
                        "                        \"        android:background=\\\"@color/colorPrimary\\\"\\n\" +\n" +
                        "                        \"        android:text=\\\"@string/copyright\\\"\\n\" +\n" +
                        "                        \"        android:textColor=\\\"@color/copyright\\\"\\n\" +\n" +
                        "                        \"        android:textSize=\\\"24sp\\\" />\\n\" +\n" +
                        "                        \"\\n\" +\n" +
                        "                        \"</LinearLayout>\");\n" +
                        "\n" +
                        "                code.setVisibility(View.GONE);\n" +
                        "                contact.setVisibility(View.GONE);\n" +
                        "                layout_code.setVisibility(View.GONE);\n" +
                        "                login.setVisibility(View.GONE);\n" +
                        "                MainActivity.setVisibility(View.GONE);\n" +
                        "                rate_us.setVisibility(View.GONE);\n" +
                        "                instruction.setVisibility(View.GONE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        repeat.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                recreate();\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}\n");

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

                codeViewer.setText("package com.example.dayfinder;\n" +
                        "\n" +
                        "import androidx.appcompat.app.AppCompatActivity;\n" +
                        "\n" +
                        "import android.content.Intent;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "\n" +
                        "public class login extends AppCompatActivity {\n" +
                        "    EditText ID;\n" +
                        "    Button submit;\n" +
                        "    TextView show;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_login);\n" +
                        "\n" +
                        "        ID = findViewById(R.id.login);\n" +
                        "        submit = findViewById(R.id.btnlogin);\n" +
                        "        show = findViewById(R.id.show);\n" +
                        "\n" +
                        "        submit.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "\n" +
                        "                String login_ID;\n" +
                        "\n" +
                        "                login_ID = ID.getText().toString().trim();\n" +
                        "\n" +
                        "                if( login_ID == \"dayfinder@code\" )\n" +
                        "                {\n" +
                        "                    Intent intent = new Intent(login.this, com.example.dayfinder.code.class);\n" +
                        "                    startActivity(intent);\n" +
                        "                }\n" +
                        "                else\n" +
                        "                {\n" +
                        "                    show.setText(\"PLEASE CONTACT THE DEVELOPER TO ACCESS THIS FILE!!!\");\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}\n");

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

                codeViewer.setText("package com.example.dayfinder;\n" +
                        "\n" +
                        "import androidx.appcompat.app.AppCompatActivity;\n" +
                        "\n" +
                        "import android.annotation.SuppressLint;\n" +
                        "import android.content.Intent;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.EditText;\n" +
                        "import android.widget.TextView;\n" +
                        "\n" +
                        "import static android.view.View.*;\n" +
                        "\n" +
                        "public class MainActivity extends AppCompatActivity\n" +
                        "{\n" +
                        "\n" +
                        "    EditText Input;\n" +
                        "    TextView copyright, result, instructions;\n" +
                        "    Button tryagain, contact, rate, submit ;\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState)\n" +
                        "    {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "        Input = findViewById(R.id.Input);\n" +
                        "        submit = findViewById(R.id.submit);\n" +
                        "        result = findViewById(R.id.result);\n" +
                        "        copyright = findViewById(R.id.copyright);\n" +
                        "        contact = findViewById(R.id.contact);\n" +
                        "        rate = findViewById(R.id.rate);\n" +
                        "        tryagain = findViewById(R.id.tryagain);\n" +
                        "        instructions = findViewById(R.id.instructions);\n" +
                        "        result.setVisibility(GONE);\n" +
                        "        contact.setVisibility(GONE);\n" +
                        "        rate.setVisibility(GONE);\n" +
                        "        tryagain.setVisibility(GONE);\n" +
                        "        submit.setOnClickListener(new OnClickListener() {\n" +
                        "            @SuppressLint(\"SetTextI18n\")\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                int day = 0, month = 0, year = 0;\n" +
                        "                String input = Input.getText().toString().trim();\n" +
                        "                int date;\n" +
                        "                {\n" +
                        "                    if (Input.getText().charAt(2) == '/' )\n" +
                        "                    {\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(0)));\n" +
                        "                        day = date*10;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(1)));\n" +
                        "                        day += date;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(3)));\n" +
                        "                        month = date*10;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(4)));\n" +
                        "                        month += date;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(6)));\n" +
                        "                        year = date * 1000;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(7)));\n" +
                        "                        year += date * 100;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(8)));\n" +
                        "                        year += date * 10;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(9)));\n" +
                        "                        year += date;\n" +
                        "                    }\n" +
                        "                    else {\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(0)));\n" +
                        "                        day = date * 10;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(1)));\n" +
                        "                        day += date;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(2)));\n" +
                        "                        month = date * 10;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(3)));\n" +
                        "                        month += date;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(4)));\n" +
                        "                        year = date * 1000;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(5)));\n" +
                        "                        year += date * 100;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(6)));\n" +
                        "                        year += date * 10;\n" +
                        "                        date = Integer.parseInt(Character.toString(input.charAt(7)));\n" +
                        "                        year += date;\n" +
                        "                    }\n" +
                        "                }\n" +
                        "                {\n" +
                        "                    int da, l = 0, d = day, m  = month ,  y = year ;\n" +
                        "                    String d1 = \"a\";\n" +
                        "                    da = 1;\n" +
                        "                    {\n" +
                        "                        if( ( d >= 1 && d <= 31 ) && ( m >= 1 && m <= 12 ) && ( y >= 1800 && y <= 3000 ) ){}\n" +
                        "                        else\n" +
                        "                        {\n" +
                        "                            result.setText(\"Sorry please enter the perfect year number OR the day number OR the month number...... and try again by restarting the app\");\n" +
                        "                            instructions.setVisibility(GONE);\n" +
                        "                            Input.setVisibility(GONE);\n" +
                        "                            submit.setVisibility(GONE);\n" +
                        "                            result.setVisibility(VISIBLE);\n" +
                        "                            tryagain.setVisibility(VISIBLE);\n" +
                        "                        }\n" +
                        "                    }\n" +
                        "                    for( int i = 1800; i <= 3000; i++ )\n" +
                        "                    {\n" +
                        "                        {\n" +
                        "                            if( ( i % 4 == 0 && i % 100 != 0 ) || ( i % 4 == 0 && i % 100 == 0 && i % 400 == 0 ) )\n" +
                        "                            {\n" +
                        "                                ++l;\n" +
                        "                            }\n" +
                        "                            else\n" +
                        "                            {\n" +
                        "                                l = 0;\n" +
                        "                                if( d > 28 )\n" +
                        "                                {\n" +
                        "                                    result.setText(\"You entered a wrong date please start the app once again...\");\n" +
                        "                                    instructions.setVisibility(GONE);\n" +
                        "                                    Input.setVisibility(GONE);\n" +
                        "                                    submit.setVisibility(GONE);\n" +
                        "                                    result.setVisibility(VISIBLE);\n" +
                        "                                    tryagain.setVisibility(VISIBLE);\n" +
                        "                                }\n" +
                        "\n" +
                        "                            }\n" +
                        "                        }\n" +
                        "                        for( int j = 1; j <= 12; j++ )\n" +
                        "                        {\n" +
                        "                            for( int k = 1; k <= 31; k++ )\n" +
                        "                            {\n" +
                        "                                {\n" +
                        "                                    if( da == 1 )\n" +
                        "                                    {\n" +
                        "                                        d1 = \"Wednesday\";\n" +
                        "                                    }\n" +
                        "                                    else\n" +
                        "                                    if( da == 2 )\n" +
                        "                                    {\n" +
                        "                                        d1 = \"Thursday\";\n" +
                        "                                    }\n" +
                        "                                    else\n" +
                        "                                    if( da == 3 )\n" +
                        "                                    {\n" +
                        "                                        d1 = \"Friday\";\n" +
                        "                                    }\n" +
                        "                                    else\n" +
                        "                                    if( da == 4 )\n" +
                        "                                    {\n" +
                        "                                        d1 = \"Saturday\";\n" +
                        "                                    }\n" +
                        "                                    else\n" +
                        "                                    if( da == 5 )\n" +
                        "                                    {\n" +
                        "                                        d1 = \"Sunday\";\n" +
                        "                                    }\n" +
                        "                                    else\n" +
                        "                                    if( da == 6 )\n" +
                        "                                    {\n" +
                        "                                        d1 = \"Monday\";\n" +
                        "                                    }\n" +
                        "                                    else\n" +
                        "                                    if( da == 7 )\n" +
                        "                                    {\n" +
                        "                                        d1 = \"Tuesday\";\n" +
                        "                                        da = 0;\n" +
                        "                                    }\n" +
                        "                                    ++da;\n" +
                        "                                    if( i == y && j == m && k == d )\n" +
                        "                                    {\n" +
                        "                                        result.setText(\" The entered date is: \" + d + \"/\" + m + \"/\" + y + \" \\n And the respective day is: \" + d1);\n" +
                        "                                        result.setVisibility(VISIBLE);\n" +
                        "                                        submit.setVisibility(GONE);\n" +
                        "                                        rate.setVisibility(VISIBLE);\n" +
                        "                                        Input.setVisibility(GONE);\n" +
                        "                                        tryagain.setVisibility(VISIBLE);\n" +
                        "                                        instructions.setVisibility(GONE);\n" +
                        "                                        contact.setVisibility(VISIBLE);\n" +
                        "                                    }\n" +
                        "                                    {\n" +
                        "                                        if( ( j == 4 || j == 6 || j == 9 || j  == 11 ) && k == 30 )\n" +
                        "                                        {\n" +
                        "                                            break;\n" +
                        "                                        }\n" +
                        "                                    }\n" +
                        "                                    {\n" +
                        "                                        if( k == 29 && j == 2 &&  l!= 0  )\n" +
                        "                                        {\n" +
                        "                                            break;\n" +
                        "                                        }\n" +
                        "                                        else\n" +
                        "                                        if( k == 28 && j == 2 && l == 0 )\n" +
                        "                                        {\n" +
                        "                                            break;\n" +
                        "                                        }\n" +
                        "                                    }\n" +
                        "                                }\n" +
                        "                            }\n" +
                        "                        }\n" +
                        "                    }\n" +
                        "                }\n" +
                        "                tryagain.setOnClickListener(new OnClickListener() {\n" +
                        "                    @Override\n" +
                        "                    public void onClick(View v) {\n" +
                        "                        recreate();\n" +
                        "                    }\n" +
                        "                });\n" +
                        "\n" +
                        "                contact.setOnClickListener(new OnClickListener() {\n" +
                        "                    @Override\n" +
                        "                    public void onClick(View v) {\n" +
                        "                        Intent intent = new Intent(MainActivity.this,com.example.dayfinder.Contact_us.class);\n" +
                        "                        startActivity(intent);\n" +
                        "                    }\n" +
                        "                });\n" +
                        "\n" +
                        "                rate.setOnClickListener(new OnClickListener() {\n" +
                        "                    @Override\n" +
                        "                    public void onClick(View v) {\n" +
                        "                        Intent intent = new Intent(MainActivity.this, com.example.dayfinder.rate_us.class);\n" +
                        "                        startActivity(intent);\n" +
                        "                    }\n" +
                        "                });\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}");

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

                codeViewer.setText("package com.example.dayfinder;\n" +
                        "\n" +
                        "import androidx.appcompat.app.AppCompatActivity;\n" +
                        "\n" +
                        "import android.content.Intent;\n" +
                        "import android.os.Bundle;\n" +
                        "import android.view.View;\n" +
                        "import android.widget.Button;\n" +
                        "import android.widget.ImageButton;\n" +
                        "import android.widget.TextView;\n" +
                        "import android.widget.Toast;\n" +
                        "\n" +
                        "public class rate_us extends AppCompatActivity {\n" +
                        "\n" +
                        "    ImageButton satisfied, happy, neutral, sad, dissatisfied;\n" +
                        "    Button eastereggs;\n" +
                        "    TextView thanks;\n" +
                        "\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_rate_us);\n" +
                        "\n" +
                        "        eastereggs = findViewById(R.id.easter_eggs);\n" +
                        "        satisfied = findViewById(R.id.satisfied);\n" +
                        "        happy = findViewById(R.id.happy);\n" +
                        "        neutral = findViewById(R.id.neutral);\n" +
                        "        sad = findViewById(R.id.sad);\n" +
                        "        dissatisfied = findViewById(R.id.dissatisfied);\n" +
                        "        thanks = findViewById(R.id.thanks);\n" +
                        "\n" +
                        "\n" +
                        "        satisfied.setVisibility(View.VISIBLE);\n" +
                        "        happy.setVisibility(View.VISIBLE);\n" +
                        "        neutral.setVisibility(View.VISIBLE);\n" +
                        "        sad.setVisibility(View.VISIBLE);\n" +
                        "        dissatisfied.setVisibility(View.VISIBLE);\n" +
                        "        thanks.setVisibility(View.GONE);\n" +
                        "\n" +
                        "        eastereggs.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Intent intent = new Intent(rate_us.this, com.example.dayfinder.login.class);\n" +
                        "                startActivity(intent);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "\n" +
                        "        satisfied.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Toast.makeText(rate_us.this, \"It seems that you are very much satisfied with the app's performance ☺️.\", Toast.LENGTH_SHORT).show();\n" +
                        "\n" +
                        "                satisfied.setVisibility(View.GONE);\n" +
                        "                happy.setVisibility(View.GONE);\n" +
                        "                neutral.setVisibility(View.GONE);\n" +
                        "                sad.setVisibility(View.GONE);\n" +
                        "                dissatisfied.setVisibility(View.GONE);\n" +
                        "                thanks.setVisibility(View.VISIBLE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        happy.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Toast.makeText(rate_us.this, \"It seems that we have to work on this app's performance \\uD83D\\uDE42 \", Toast.LENGTH_SHORT).show();\n" +
                        "\n" +
                        "                satisfied.setVisibility(View.GONE);\n" +
                        "                happy.setVisibility(View.GONE);\n" +
                        "                neutral.setVisibility(View.GONE);\n" +
                        "                sad.setVisibility(View.GONE);\n" +
                        "                dissatisfied.setVisibility(View.GONE);\n" +
                        "                thanks.setVisibility(View.VISIBLE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        neutral.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Toast.makeText(rate_us.this, \"It seems that you are ok with the app's performance.\", Toast.LENGTH_SHORT).show();\n" +
                        "\n" +
                        "                satisfied.setVisibility(View.GONE);\n" +
                        "                happy.setVisibility(View.GONE);\n" +
                        "                neutral.setVisibility(View.GONE);\n" +
                        "                sad.setVisibility(View.GONE);\n" +
                        "                dissatisfied.setVisibility(View.GONE);\n" +
                        "                thanks.setVisibility(View.VISIBLE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        sad.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Toast.makeText(rate_us.this, \"It seems that you are not happy with the app's performance  \\uD83D\\uDE1F \", Toast.LENGTH_SHORT).show();\n" +
                        "\n" +
                        "                satisfied.setVisibility(View.GONE);\n" +
                        "                happy.setVisibility(View.GONE);\n" +
                        "                neutral.setVisibility(View.GONE);\n" +
                        "                sad.setVisibility(View.GONE);\n" +
                        "                dissatisfied.setVisibility(View.GONE);\n" +
                        "                thanks.setVisibility(View.VISIBLE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "\n" +
                        "        dissatisfied.setOnClickListener(new View.OnClickListener() {\n" +
                        "            @Override\n" +
                        "            public void onClick(View v) {\n" +
                        "                Toast.makeText(rate_us.this, \"We are very sorry for this terrible experience \\uD83D\\uDE1E\", Toast.LENGTH_SHORT).show();\n" +
                        "\n" +
                        "                satisfied.setVisibility(View.GONE);\n" +
                        "                happy.setVisibility(View.GONE);\n" +
                        "                neutral.setVisibility(View.GONE);\n" +
                        "                sad.setVisibility(View.GONE);\n" +
                        "                dissatisfied.setVisibility(View.GONE);\n" +
                        "                thanks.setVisibility(View.VISIBLE);\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "}\n");

                code.setVisibility(View.GONE);
                contact.setVisibility(View.GONE);
                layout_code.setVisibility(View.GONE);
                login.setVisibility(View.GONE);
                MainActivity.setVisibility(View.GONE);
                rate_us.setVisibility(View.GONE);
                instruction.setVisibility(View.GONE);
            }
        });


        repeat.setOnClickListener(v -> recreate());
    }
}
