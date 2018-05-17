package com.example.android.tourguideapp;
import android.content.Context;
import java.util.ArrayList;
public class Restaurant {
    public static void initRestaurantList(ArrayList<TourGuide> tourGuides, Context context) {
        tourGuides.add(new TourGuide(context.getString(R.string.yum_yum_name),
                context.getString(R.string.yum_yum_location),
                context.getString(R.string.yum_yum_phone),
                R.drawable.yum_yum
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.agaves_mexican_restaurant_name),
                context.getString(R.string.agaves_mexican_restaurant_location),
                context.getString(R.string.agaves_mexican_restaurant_phone),
                R.drawable.agaves
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.strongs_pizza_name),
                context.getString(R.string.strongs_pizza_location),
                context.getString(R.string.strongs_pizza_phone),
                R.drawable.strongs_pizza
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.hebron_grille_name),
                context.getString(R.string.hebron_grille_location),
                context.getString(R.string.hebron_grille_phone),
                R.drawable.hebron_grille
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.crew_name),
                context.getString(R.string.crew_location),
                context.getString(R.string.crew_phone),
                R.drawable.crew_lounge
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.paradise_name),
                context.getString(R.string.paradise_location),
                context.getString(R.string.paradise_phone),
                R.drawable.paradise_donuts
        ));
        }
}
