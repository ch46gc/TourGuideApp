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
        tourGuides.add(new TourGuide(context.getString(R.string.arbys_name),
                context.getString(R.string.arbys_location),
                context.getString(R.string.arbys_phone),
                R.drawable.arbys
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.crew_name),
                context.getString(R.string.crew_location),
                context.getString(R.string.crew_phone),
                R.drawable.crew_lounge
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.lucky_dragon_name),
                context.getString(R.string.lucky_dragon_location),
                context.getString(R.string.lucky_dragon_phone),
                R.drawable.lucky_dragon
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.paradise_name),
                context.getString(R.string.paradise_location),
                context.getString(R.string.paradise_phone),
                R.drawable.paradise_donuts
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.dq_name),
                context.getString(R.string.dq_location),
                context.getString(R.string.dq_phone),
                R.drawable.dq
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.pizza_hut_name),
                context.getString(R.string.pizza_hut_location),
                context.getString(R.string.pizza_hut_phone),
                R.drawable.pizza_hut
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.jj_name),
                context.getString(R.string.jj_location),
                context.getString(R.string.jj_phone),
                R.drawable.jimmy_johns
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.penn_name),
                context.getString(R.string.penn_location),
                context.getString(R.string.penn_phone),
                R.drawable.penn_station
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.gramm_pizza_name),
                context.getString(R.string.gramm_pizza_location),
                context.getString(R.string.gramm_pizza_phone),
                R.drawable.grammas_pizza
        ));
    }
}
