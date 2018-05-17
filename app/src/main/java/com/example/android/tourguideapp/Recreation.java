package com.example.android.tourguideapp;
import android.content.Context;
import java.util.ArrayList;
public class Recreation {
    public static void initRecreationList(ArrayList<TourGuide> tourGuides, Context context) {
        tourGuides.add(new TourGuide (context.getString(R.string.bengals_stadium_name),
                context.getString(R.string.bengals_stadium_location),
                context.getString(R.string.bengals_stadium_phone),
                R.drawable.bengals_stadium
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.big_bone_park_name),
                context.getString(R.string.big_bone_park_location),
                context.getString(R.string.big_bone_park_phone),
                R.drawable.big_bone_lick
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.reds_stadium_name),
                context.getString(R.string.reds_stadium_location),
                context.getString(R.string.reds_stadium_phone),
                R.drawable.reds_stadium
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.florence_stadium_name),
                context.getString(R.string.florence_stadium_location),
                context.getString(R.string.florence_stadium_phone),
                R.drawable.florence_stadium
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.loveland_castle_name),
                context.getString(R.string.loveland_castle_location),
                context.getString(R.string.loveland_castle_phone),
                R.drawable.loveland_castle
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.kings_island_name),
                context.getString(R.string.kings_island_location),
                context.getString(R.string.kings_island_phone),
                R.drawable.kings_island
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.yeatmans_cove_name),
                context.getString(R.string.yeatmans_cove_location),
                context.getString(R.string.yeatmans_cove_phone),
                R.drawable.yeatmans_cove
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.perfect_north_name),
                context.getString(R.string.perfect_north_location),
                context.getString(R.string.perfect_north_phone),
                R.drawable.perfect_north_slopes
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.uk_stadium_name),
                context.getString(R.string.uk_stadium_location),
                context.getString(R.string.uk_stadium_phone),
                R.drawable.uk_stadium
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.smale_park_name),
                context.getString(R.string.smale_park_location),
                context.getString(R.string.smale_park_phone),
                R.drawable.smale_park
        ));
        tourGuides.add(new TourGuide (context.getString(R.string.newport_aquarium_name),
                context.getString(R.string.newport_aquarium_location),
                context.getString(R.string.newport_aquarium_phone),
                R.drawable.newport_aquarium
        ));
    }
}
