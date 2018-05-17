package com.example.android.tourguideapp;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public class TourGuideAdapter extends ArrayAdapter<TourGuide> {
    private static final String LOG_TAG = TourGuideAdapter.class.getSimpleName();
    public TourGuideAdapter(Activity context, ArrayList<TourGuide> tourGuides) {
        super(context, 0, tourGuides);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        TourGuide currentTourGuide = getItem(position);
        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(currentTourGuide.getName());
        TextView addressTextView = listItemView.findViewById(R.id.location);
        addressTextView.setText(currentTourGuide.getLocation());
        TextView phoneTextView = listItemView.findViewById(R.id.phone);
        phoneTextView.setText(currentTourGuide.getPhone());
        ImageView areaImageView = listItemView.findViewById(R.id.image);
        if (currentTourGuide.hasImage()) {
            areaImageView.setImageResource(currentTourGuide.getImageResourceId());
            areaImageView.setVisibility(View.VISIBLE);
        } else {
            areaImageView.setVisibility(View.GONE);
            }
            return listItemView;
    }
}