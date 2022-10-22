package com.example.android.goservices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListOfServices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_services);
        String serivces[] = {"Plumber", "Electrician", "Maid", "Caretaker", "Cook", "Plumber", "Electrician", "Maid", "Caretaker", "Cook"};
        ListView list_view = findViewById(R.id.services_listview);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, serivces);
        list_view.setAdapter(adapter);
    }
}
