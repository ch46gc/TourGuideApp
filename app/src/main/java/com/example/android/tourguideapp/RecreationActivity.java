package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RecreationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recreation);
        //Create a list of recreational places
        ArrayList<String> recreation = new ArrayList<>();
        recreation.add("Giles Conrad Park");
        recreation.add("England Idlewild Park");
        recreation.add("Stringtown Park");
        recreation.add("Boone Woods Park");
        recreation.add("Boone County Dog Park");
        recreation.add("Boone County Arboretum");
        recreation.add("Sandy Run Stables");
        recreation.add("Florence Nature Park");
        recreation.add("Silver Lake Park");
        recreation.add("Boone County Cliffs State Nature Preserve");
        recreation.add("Gunpowder Creek Nature Park");
        recreation.add("Camp Ernst Lake Park");
        recreation.add("Oakbrook Park");
        recreation.add("Fox Run Park");
        recreation.add("Stringtown Park");
        recreation.add("Covered Bridge Park");
        recreation.add("South Fork Park");
        recreation.add("Lincoln Woods Park");
        recreation.add("Flagship Park");
        recreation.add("Doe Run Lake Park");
        recreation.add("Railroad Depot Park");

        // Find a reference to the {@link ListView} in the layout
        ListView recreationListView =  findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of recreational places
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, recreation);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
       recreationListView.setAdapter(adapter);

       }
}
