package com.example.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvSecular;
    ArrayAdapter aa;
    ArrayList<String>secularList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSecular = findViewById(R.id.listViewSecular);

        secularList = new ArrayList<String>();
        secularList.add("Secular");

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,secularList);
        lvSecular.setAdapter(adapter);

        lvSecular.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent I = new Intent(MainActivity.this,SecularActivity.class);
                I.putExtra("number",l);
                startActivity(I);
            }
        });

    }
}
