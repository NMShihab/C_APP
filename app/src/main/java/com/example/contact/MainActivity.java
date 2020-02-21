package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.lview);

        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Banana");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Clicked item : "+position+" "+arrayList.get(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
