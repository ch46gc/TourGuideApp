package com.example.android.tourguideapp;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
public class HotelsFragment extends Fragment {
    public HotelsFragment() {
        }
        @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList<TourGuide> tourGuides = new ArrayList<>();
        Hotels.initHotelsList(tourGuides, getContext());
        TourGuideAdapter adapter = new TourGuideAdapter(getActivity(),  tourGuides);
        View view = inflater.inflate(R.layout.word_list, container, false);
        ListView hotelsListView = view.findViewById(R.id.list);
        hotelsListView .setAdapter(adapter);
        return view;
    }
}