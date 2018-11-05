package com.example.raksha_ramya.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIndia, btnAmerica, btnAfrica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAfrica = (Button) findViewById(R.id.btnAfrica);
        btnIndia = (Button) findViewById(R.id.btnIndia);
        btnAmerica = (Button) findViewById(R.id.btnAmerica);


        btnAfrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AfricaCountry.class));
            }
        });

        btnAmerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AmericaCountry.class));
            }
        });

        btnIndia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, IndiaCountry.class));
            }
        });
    }
}
