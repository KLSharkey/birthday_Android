package com.kristensharkey.birthdayapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        Bundle b = getIntent().getExtras();
        //String bday = b.getString("b_day");
        //TextView bday =
        long day = b.getInt("day");
        final int month = b.getInt("month") +1;
        long year = b.getInt("year");
        String b_day = month+"/"+day+"/"+year;
        TextView myTextView = (TextView) findViewById(R.id.bday);
        myTextView.setText(b_day);

        Button Birth_stone = (Button) findViewById(R.id.Birth_stone);
        Birth_stone.setOnClickListener(new View.OnClickListener() {

                                           @Override
                                           public void onClick(View v) {
                                               String birthStone;
                                               switch (month){
                                                   case 1:
                                                       birthStone = "Garnet";
                                                       break;
                                                   case 2:
                                                       birthStone = "Amethyst";
                                                       break;
                                                   case 3:
                                                       birthStone = "Aquamarine";
                                                       break;
                                                   case 4:
                                                       birthStone = "Diamond";
                                                       break;
                                                   case 5:
                                                       birthStone = "Emerald";
                                                       break;
                                                   case 6:
                                                       birthStone = "Alexandrite";
                                                       break;
                                                   case 7:
                                                       birthStone = "Ruby";
                                                       break;
                                                   case 8:
                                                       birthStone = "Peridot";
                                                       break;
                                                   case 9:
                                                       birthStone = "Sapphire";
                                                       break;
                                                   case 10:
                                                       birthStone = "Pink Tourmaline";
                                                       break;
                                                   case 11:
                                                       birthStone = "Topaz";
                                                       break;
                                                   case 12:
                                                       birthStone = "Zircon";
                                                       break;
                                                   default:
                                                       birthStone = "Test";

                                               }
                                               Intent intent = new Intent(HomePage.this, Birthstones.class);
                                               intent.putExtra("birthStone", birthStone);
                                               startActivity(intent);

                                           }

                                       });



        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

}
