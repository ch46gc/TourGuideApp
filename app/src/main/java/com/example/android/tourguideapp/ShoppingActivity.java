package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        //Create a list of stores
        ArrayList<String> stores = new ArrayList<>();
        stores.add("McPhee's Art & Gift Shop");
        stores.add("Gap");
        stores.add("Goodies Pawn");
        stores.add("Galerie Clearance Center");
        stores.add("Hebron Flowers & Gifts");
        stores.add("Design Within Reach");
        stores.add("Touch of Amish");
        stores.add("Kroger");
        stores.add("Ace Hardware Hebron");
        stores.add("Huff Floor Covering");
        stores.add("AutoZone");
        stores.add("Fred Meyer Jewelers");
        stores.add("Verizon Authorized Retailer, TCC");
        stores.add("Quality Floor Design");
        stores.add("Tire Discounters");
        stores.add("Dollar General");
        stores.add("Jackson Tool & Mold");
        stores.add("Remke Markets");
        stores.add("Three Brothers Games");


        // Find a reference to the {@link ListView} in the layout
        ListView storesListView = findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of stores
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, stores);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        storesListView.setAdapter(adapter);
    }
}
