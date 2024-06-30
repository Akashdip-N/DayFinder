package com.example.dayfinder;

import static android.view.View.GONE;
import static android.view.View.OnClickListener;
import static android.view.View.VISIBLE;
import static android.widget.Toast.LENGTH_SHORT;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity
{

    EditText Input;
    TextView copyright, result, instructions;
    Button tryagain, contact, rate, submit ;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons_and_edittext();
        submit.setOnClickListener(view -> {
            // input = 08072002
            //         01234567
            int day = 0, month = 0, year = 0;

            String input = Input.getText().toString().trim();
            if(input.isEmpty())
                Toast.makeText(MainActivity.this, " Please enter some values to continue. ", LENGTH_SHORT).show();
            else
                if (input.charAt(0) == '\0' || input.charAt(1) == '\0' || input.charAt(3) == '\0' || input.charAt(4) == '\0' || input.charAt(6) == '\0' || input.charAt(7) == '\0')
                    Toast.makeText(MainActivity.this, "Enter the input as required!!", LENGTH_SHORT).show();
            else {
                int date;
                {
                    int date1 = Integer.parseInt(Character.toString(input.charAt(0)));
                    int date2 = Integer.parseInt(Character.toString(input.charAt(1)));
                    date = date1;
                    day = date*10;
                    date = date2;
                    day += date;
                    int date3 = Integer.parseInt(Character.toString(input.charAt(3)));
                    int date4 = Integer.parseInt(Character.toString(input.charAt(4)));
                    int date5 = Integer.parseInt(Character.toString(input.charAt(7)));
                    if (Input.getText().charAt(2) == '/' ) {
                        date = date3;
                        month = date*10;
                        date = date4;
                        month += date;
                        date = Integer.parseInt("" + input.charAt(6));
                        year = date * 1000;
                        date = date5;
                        year += date * 100;
                        date = Integer.parseInt(Character.toString(input.charAt(8)));
                        year += date * 10;
                        date = Integer.parseInt(Character.toString(input.charAt(9)));
                    }
                    else {
                        date = Integer.parseInt(Character.toString(input.charAt(2)));
                        month = date * 10;
                        date = date3;
                        month += date;
                        date = date4;
                        year = date * 1000;
                        date = Integer.parseInt(Character.toString(input.charAt(5)));
                        year += date * 100;
                        date = Integer.parseInt(Character.toString(input.charAt(6)));
                        year += date * 10;
                        date = date5;
                    }
                    year += date;
                }

                int da, l = 0;
                String d1 = "a";
                da = 1;
                if((day > 29 && month == 2) || (day > 30 && month == 4) || (day > 30 && month == 6) || (day > 30 && month == 9) || (day > 30 && month == 11))
                    Toast.makeText(MainActivity.this, "Please enter a valid date!!", LENGTH_SHORT).show();
                if( ( day >= 1 && day <= 31 ) && ( month >= 1 && month <= 12 ) && ( year >= 1800 && year <= 3000 ) )
                    Toast.makeText(MainActivity.this, "Here comes your day!!", LENGTH_SHORT).show();
                else {
                    result.setText("Sorry please enter the perfect year number OR the day number OR the month number...... and try again by restarting the app");
                    instructions.setVisibility(GONE);
                    Input.setVisibility(GONE);
                    submit.setVisibility(GONE);
                    result.setVisibility(VISIBLE);
                    tryagain.setVisibility(VISIBLE);
                }

                for( int i = 1800; i <= 3000; i++ ) {
                    if (i % 4 == 0)
                        if (i % 100 != 0)
                            if (i % 400 == 0)
                                ++l;
                    else {
                        l = 0;
                        // Exception handling if the user types Feb as well as it's not a leap year
                        if (day == 29 && l == 1) {
                            result.setText("You entered a wrong date please start the app once again...");
                            instructions.setVisibility(GONE);
                            Input.setVisibility(GONE);
                            submit.setVisibility(GONE);
                            result.setVisibility(VISIBLE);
                            tryagain.setVisibility(VISIBLE);
                        }
                    }
                    for( int j = 1; j <= 12; j++ )
                        for( int k = 1; k <= 31; k++ ) {
                            switch (da) {
                                case 1:
                                    d1 = "Wednesday";
                                    break;
                                case 2:
                                    d1 = "Thursday";
                                    break;
                                case 3:
                                    d1 = "Friday";
                                    break;
                                case 4:
                                    d1 = "Saturday";
                                    break;
                                case 5:
                                    d1 = "Sunday";
                                    break;
                                case 6:
                                    d1 = "Monday";
                                    break;
                                case 7:
                                    d1 = "Tuesday";
                                    da = 0;
                                    break;
                            }
                            ++da;
                            if( i == year && j == month && k == day ) {
                                result.setText("Date : " + day + "/" + month + "/" + year + "\nDay: " + d1);
                                result.setVisibility(VISIBLE);
                                submit.setVisibility(GONE);
                                rate.setVisibility(VISIBLE);
                                Input.setVisibility(GONE);
                                tryagain.setVisibility(VISIBLE);
                                instructions.setVisibility(GONE);
                                contact.setVisibility(VISIBLE);
                            }
                            if( ( j == 4 || j == 6 || j == 9 || j  == 11 ) && k == 30 )
                                break;
                            if (j == 2){
                                if(l != 0 && k == 29)
                                    break;
                                else
                                    if( l == 0 && k == 28 )
                                        break;
                                    }
                            }
                    }
                // Restarting the app
                tryagain.setOnClickListener(v -> recreate());

                contact.setOnClickListener(v -> {
                    Intent intent = new Intent(MainActivity.this, Contact_us.class);
                    startActivity(intent);
                });

                rate.setOnClickListener(v -> {
                    Intent intent = new Intent(MainActivity.this, rate_us.class);
                    startActivity(intent);
                });
            }
        });
    }

    public void buttons_and_edittext(){
        Input = findViewById(R.id.Input);
        submit = findViewById(R.id.submit);
        result = findViewById(R.id.result);
        copyright = findViewById(R.id.copyright);
        contact = findViewById(R.id.contact);
        rate = findViewById(R.id.rate);
        tryagain = findViewById(R.id.tryagain);
        instructions = findViewById(R.id.instructions);
        result.setVisibility(GONE);
        contact.setVisibility(GONE);
        rate.setVisibility(GONE);
        tryagain.setVisibility(GONE);
    }
}