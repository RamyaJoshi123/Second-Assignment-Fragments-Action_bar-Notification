package com.example.raksha_ramya.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class IndiaCountry extends AppCompatActivity {

    ListView listView;
    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_india_state);

            listView = (ListView) findViewById(R.id.listView);

            listItem = getResources().getStringArray(R.array.array_State);

            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_expandable_list_item_1, listItem);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    if (listItem[i].toString().equals("Karnataka")) {
                        startActivity(new Intent(IndiaCountry.this, KaranatakaDetails.class));
                    } else if (listItem[i].toString().equals("Maharastra")) {
                        startActivity(new Intent(IndiaCountry.this, Maharastra.class));
                    }

                }
            });

        } catch (Exception ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}
