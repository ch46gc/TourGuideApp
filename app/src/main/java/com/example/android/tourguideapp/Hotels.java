package com.example.android.tourguideapp;
import android.content.Context;
import java.util.ArrayList;
public class Hotels {
    public static void initHotelsList(ArrayList<TourGuide> tourGuides, Context context) {
        tourGuides.add(new TourGuide (context.getString(R.string.hotel_comfort_suites_name),
                context.getString(R.string.hotel_comfort_suites_location),
                context.getString(R.string.hotel_comfort_suites_phone),
                R.drawable.comfort_suites
                ));
        tourGuides.add(new TourGuide (context.getString(R.string.hotel_country_inn_name),
                context.getString(R.string.hotel_country_inn_location),
                context.getString(R.string.hotel_country_inn_phone),
                R.drawable.country_inn
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.hotel_hampton_inn_name),
                context.getString(R.string.hotel_hampton_inn_location),
                context.getString(R.string.hotel_hampton_inn_phone),
                R.drawable.hampton_inn
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.hotel_marriot_name),
                context.getString(R.string.hotel_marriot_location),
                context.getString(R.string.hotel_marriot_phone),
                R.drawable.marriot
        ));
    }
}