package com.example.android.tourguideapp;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager tourGuideViewPager =  findViewById(R.id.view_pager);
        tourGuideViewPager.setAdapter(new TourGuideFragmentAdapter(this, getSupportFragmentManager()));
        TabLayout tabLayout = findViewById(R.id.slide_tabs);
        tabLayout.setupWithViewPager(tourGuideViewPager);
    }
}
