package com.example.android.tourguideapp;
import android.content.Context;
import java.util.ArrayList;
public class Shopping {
    public static void initShoppingList(ArrayList<TourGuide> tourGuides, Context context) {
        tourGuides.add(new TourGuide(context.getString(R.string.galeria_name),
                context.getString(R.string.galeria_location),
                context.getString(R.string.galeria_phone),
                R.drawable.galleria
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.gap_name),
                context.getString(R.string.gap_location),
                context.getString(R.string.gap_phone),
                R.drawable.gap
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.toa_name),
                context.getString(R.string.toa_location),
                context.getString(R.string.toa_phone),
                R.drawable.touch_of_amish
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.huff_floor_name),
                context.getString(R.string.huff_floor_location),
                context.getString(R.string.huff_floor_phone),
                R.drawable.huff_flooring
        ));
        tourGuides.add(new TourGuide(context.getString(R.string.mcphee_name),
                context.getString(R.string.mcphee_location),
                context.getString(R.string.mcphee_phone),
                R.drawable.mcphee
        ));
    }
}
