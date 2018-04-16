package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        //Create a list of hotels
        ArrayList<String> hotels = new ArrayList<>();
        hotels.add("Comfort Suites Cincinnati Airport");
        hotels.add("Country Inn & Suites by Radisson, Cincinnati Airport");
        hotels.add("Hampton Inn Cincinnati Airport-North");
        hotels.add("Cincinnati Airport Marriott");
        hotels.add("DoubleTree by Hilton Hotel Cincinnati Airport");
        hotels.add("Courtyard by Marriott Cincinnati Airport");
        hotels.add("Willis Graves Bed and Breakfast");
        hotels.add("Holiday Inn Cincinnati Airport");
        hotels.add("Quality Inn & Suites");
        hotels.add("Residence Inn by Marriott Cincinnati Airport");

        // Find a reference to the {@link ListView} in the layout
        ListView hotelsListView =  findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of hotels
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, hotels);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        hotelsListView.setAdapter(adapter);
    }
}


