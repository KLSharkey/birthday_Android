package com.kristensharkey.birthdayapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = (Button) findViewById(R.id.submit);//creates variable submit from btn submit
        submit.setOnClickListener(new View.OnClickListener() { //creates on click event; all goes in
            @Override
            public void onClick(View v) {
                DatePicker bday = (DatePicker) findViewById(R.id.datePicker);
                //String b_day = bday.toString();
                //String b_day = "testBday";
                int month = bday.getMonth();
                int day = bday.getDayOfMonth();
                int year = bday.getYear();

                //getIntent().putExtra("b_day", b_day);
                Intent intent = new Intent(MainActivity.this, HomePage.class);
                intent.putExtra("month", month);
                intent.putExtra("day", day);
                intent.putExtra("year", year);
                startActivity(intent);

            }
            //public void HomePage()
        });
    }
}