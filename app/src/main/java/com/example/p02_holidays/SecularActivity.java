package com.example.p02_holidays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecularActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holidays> holidays, secular,religion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.holidays);

        lv = (ListView) this.findViewById(R.id.HolidaysListView);


        // Create a few food objects in Food array
        holidays = new ArrayList<Holidays>();
        secular = new ArrayList<Holidays>();
        religion = new ArrayList<Holidays>();

        secular.add(new Holidays("New Year's Day", R.drawable.cny, "1 January 2020"));
        religion.add(new Holidays("Chinese New Year", R.drawable.cny, "25-26 January 2020"));
        religion.add(new Holidays("Good Friday", R.drawable.goodfriday, "10 April 2020"));
        secular.add(new Holidays("Labour Day", R.drawable.labourday, "1 May 2020"));
        secular.add(new Holidays("Vesak Day", R.drawable.vesakday, "7 May 2020"));
        secular.add(new Holidays("Hari Raya Puasa", R.drawable.harirayapuasa, "24 May 2020"));
        secular.add(new Holidays("Hari Raya Haji", R.drawable.harirayahaji, "31 July 2020"));
        secular.add(new Holidays("National Day", R.drawable.nationalday, "9 August 2020"));
        secular.add(new Holidays("Deepavali", R.drawable.deepavali, "14 November 2020"));
        secular.add(new Holidays("Christmas Day", R.drawable.christmas, "25 December 2020"));
        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together

        Intent i = getIntent();
        int number = i.getIntExtra("number", 0);

        if (number == 0) {
            holidays = secular;
        } else {
            holidays = religion;
        }

        aa = new HolidaysAdapter(this, R.layout.secular, holidays);
        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holidays selected = holidays.get(position);

                Toast.makeText(SecularActivity.this, selected.getName()
                                + " Date: " + selected.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
