package com.example.android.tourguideapp;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
public class RecreationFragment extends Fragment {
    public RecreationFragment() {
        }
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList<TourGuide> tourGuides = new ArrayList<>();
        Recreation.initRecreationList(tourGuides, getContext());
        TourGuideAdapter adapter = new TourGuideAdapter(getActivity(),  tourGuides);
        View view = inflater.inflate(R.layout.word_list, container, false);
        ListView recreationListView =  view.findViewById(R.id.list);
        recreationListView .setAdapter(adapter);
        return view;
    }
}
