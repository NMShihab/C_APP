package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find view by id
        ListView listView = (ListView)findViewById(R.id.lview);
        SearchView my_search_view = (SearchView)findViewById(R.id.search_bar);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.floatingActionButton);

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
        arrayList.add("Cherry");

        final ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Clicked item : "+position+" "+arrayList.get(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });

        // Search
        my_search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });

        // Floating Action bar

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,add_contact_activity.class));

            }
        });
    }
}
