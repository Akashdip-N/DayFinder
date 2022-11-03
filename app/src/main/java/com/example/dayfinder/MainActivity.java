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

public class MainActivity extends AppCompatActivity
{

    EditText Input;
    TextView copyright, result, instructions;
    Button tryagain, contact, rate, submit ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int day = 0, month = 0, year = 0;
                String input = Input.getText().toString().trim();
                if(input.isEmpty())
                    Toast.makeText(MainActivity.this, " Please enter some values to continue. ", LENGTH_SHORT).show();
                else
                {
                    int date;
                    {
                        if (Input.getText().charAt(2) == '/' )
                        {
                            date = Integer.parseInt(Character.toString(input.charAt(0)));
                            day = date*10;
                            date = Integer.parseInt(Character.toString(input.charAt(1)));
                            day += date;
                            date = Integer.parseInt(Character.toString(input.charAt(3)));
                            month = date*10;
                            date = Integer.parseInt(Character.toString(input.charAt(4)));
                            month += date;
                            date = Integer.parseInt(Character.toString(input.charAt(6)));
                            year = date * 1000;
                            date = Integer.parseInt(Character.toString(input.charAt(7)));
                            year += date * 100;
                            date = Integer.parseInt(Character.toString(input.charAt(8)));
                            year += date * 10;
                            date = Integer.parseInt(Character.toString(input.charAt(9)));
                            year += date;
                        }
                        else {
                            date = Integer.parseInt(Character.toString(input.charAt(0)));
                            day = date * 10;
                            date = Integer.parseInt(Character.toString(input.charAt(1)));
                            day += date;
                            date = Integer.parseInt(Character.toString(input.charAt(2)));
                            month = date * 10;
                            date = Integer.parseInt(Character.toString(input.charAt(3)));
                            month += date;
                            date = Integer.parseInt(Character.toString(input.charAt(4)));
                            year = date * 1000;
                            date = Integer.parseInt(Character.toString(input.charAt(5)));
                            year += date * 100;
                            date = Integer.parseInt(Character.toString(input.charAt(6)));
                            year += date * 10;
                            date = Integer.parseInt(Character.toString(input.charAt(7)));
                            year += date;
                        }
                    }
                    {
                        int da, l = 0, d = day, m  = month ,  y = year ;
                        String d1 = "a";
                        da = 1;
                        {
                            if((d > 29 && m == 2) || (d > 30 && m == 4) || (d > 30 && m == 6) || (d > 30 && m == 9) || (d > 30 && m == 11))
                                Toast.makeText(MainActivity.this, "Please enter a valid date!!", LENGTH_SHORT).show();

                            if( ( d >= 1 && d <= 31 ) && ( m >= 1 && m <= 12 ) && ( y >= 1800 && y <= 3000 ) ){}
                            else
                            {
                                result.setText("Sorry please enter the perfect year number OR the day number OR the month number...... and try again by restarting the app");
                                instructions.setVisibility(GONE);
                                Input.setVisibility(GONE);
                                submit.setVisibility(GONE);
                                result.setVisibility(VISIBLE);
                                tryagain.setVisibility(VISIBLE);
                            }
                        }
                        for( int i = 1800; i <= 3000; i++ )
                        {
                            if( ( i % 4 == 0 && i % 100 != 0 ) || ( i % 4 == 0 && i % 100 == 0 && i % 400 == 0 ) )
                                    ++l;
                                else
                                {
                                    l = 0;
                                    if( d == 29 && l == 1 ) {
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
                                    if( da == 1 )
                                        d1 = "Wednesday";
                                    else
                                        if( da == 2 )
                                        d1 = "Thursday";
                                        else
                                            if( da == 3 )
                                                d1 = "Friday";
                                        else
                                            if( da == 4 )
                                                d1 = "Saturday";
                                        else
                                            if( da == 5 )
                                                d1 = "Sunday";
                                        else
                                            if( da == 6 )
                                                d1 = "Monday";
                                        else
                                        if( da == 7 ) {
                                            d1 = "Tuesday";
                                            da = 0;
                                        }
                                        ++da;
                                        if( i == y && j == m && k == d )
                                        {
                                            result.setText(" The entered date is: " + d + "/" + m + "/" + y + " \n And the respective day is: " + d1);
                                            result.setVisibility(VISIBLE);
                                            submit.setVisibility(GONE);
                                            rate.setVisibility(VISIBLE);
                                            Input.setVisibility(GONE);
                                            tryagain.setVisibility(VISIBLE);
                                            instructions.setVisibility(GONE);
                                            contact.setVisibility(VISIBLE);
                                        }
                                        {
                                            if( ( j == 4 || j == 6 || j == 9 || j  == 11 ) && k == 30 )
                                                break;
                                        }
                                        {
                                            if( k == 29 && j == 2 &&  l!= 0  )
                                                break;
                                            else
                                                if( k == 28 && j == 2 && l == 0 )
                                                    break;
                                        }
                                }
                        }
                    }
                    tryagain.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            recreate();
                        }
                    });

                    contact.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity.this, Contact_us.class);
                            startActivity(intent);
                        }
                    });

                    rate.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity.this, rate_us.class);
                            startActivity(intent);
                        }
                    });
                }
            }
        });
    }
}