package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hotels = (TextView) findViewById(R.id.hotels);
        // Set a click listener on that View
        hotels.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);

                // Start the new activity
                startActivity(hotelsIntent);
            }
        });
        TextView recreation = (TextView) findViewById(R.id.parks);
        // Set a click listener on that View
        recreation.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recreationIntent = new Intent(MainActivity.this, RecreationActivity.class);

                // Start the new activity
                startActivity(recreationIntent);
            }
        });
        TextView dining = (TextView) findViewById(R.id.food);
        // Set a click listener on that View
        dining.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent diningIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(diningIntent);
            }
        });
        TextView shopping = (TextView) findViewById(R.id.shopping);
        // Set a click listener on that View
        shopping.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);

                // Start the new activity
                startActivity(shoppingIntent);
            }
        });


    }
}
