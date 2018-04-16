package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        //Create a list of restaurants
        ArrayList<String> dining = new ArrayList<>();
        dining.add("LaRosa's Pizza Hebron");
        dining.add("Yum Yum Japanese Express Restaurant");
        dining.add("Hebron Brew Haus");
        dining.add("Agaves Mexican Restaurant");
        dining.add("Strong's Brick Oven Pizzeria");
        dining.add("River City Grille");
        dining.add("Burger King");
        dining.add("Taco Bell");
        dining.add("McDonald's");
        dining.add("Sonic Drive-In");
        dining.add("Waffle House");
        dining.add("Hebron Grille");
        dining.add("Arby's");
        dining.add("Skyline Chili");
        dining.add("China Wok");
        dining.add("The Crew Lounge");
        dining.add("Wendy's");
        dining.add("Lucky Dragon Chinese Restaurant");
        dining.add("Jet's Pizza");
        dining.add("Subway");
        dining.add("Paradise Donuts");
        dining.add("Dairy Queen");
        dining.add("Longnecks Sports Grill");
        dining.add("Pizza Hut");
        dining.add("Jimmy John's");
        dining.add("Penn Station East Coast Subs");
        dining.add("Grammas Pizza");
        // Find a reference to the {@link ListView} in the layout
        ListView diningListView =  findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of restaurants
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, dining);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
       diningListView.setAdapter(adapter);
    }
}
