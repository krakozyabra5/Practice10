package com.example.practice_10_glazirinnp_and_maliginaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Table extends AppCompatActivity {
    ImageButton imageButton7;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    Intent intentbot1;
    Intent intentbot2;
    Intent intentbot3;
    Intent intentbot4;
    Intent intentbot6;
    Intent intentbot7;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_table);

            imageButton7 = (ImageButton)findViewById(R.id.imageButton7);
            button5= (Button)findViewById(R.id.button5);
            button6 = (Button)findViewById(R.id.button6);
            button7 = (Button)findViewById(R.id.button7);
            button8 = (Button)findViewById(R.id.button8);
            button9 = (Button)findViewById(R.id.button9);


            {   final Intent intentbot1 = new Intent();
                intentbot1.setClass(Table.this, CookbookActivity.class);
                imageButton7.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(intentbot1);
                    }});}
            {
                final Intent intentbot2 = new Intent();
                intentbot2 .setClass(Table.this, ElementActivity.class);
                button5.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(intentbot2 );
                    }});}

            { final Intent intentbot3 = new Intent();
                intentbot3 .setClass(Table.this, Element1Activity.class);
                button6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(intentbot3 );
                    }});
            }
            { final Intent intentbot4 = new Intent();
                intentbot4 .setClass(Table.this, Element1Activity.class);
                button6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(intentbot4 );
                    }});

                { final Intent intentbot5 = new Intent();
                    intentbot5 .setClass(Table.this, Element2Activity.class);
                    button7.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(intentbot5 );
                        }});
                }
                { final Intent intentbot6 = new Intent();
                    intentbot6 .setClass(Table.this, Element3Activity.class);
                    button8.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(intentbot6 );
                        }});
                }
                { final Intent intentbot7 = new Intent();
                    intentbot7 .setClass(Table.this, Element4Activity.class);
                    button9.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            startActivity(intentbot7);
                        }});
                }
    }
}
}
