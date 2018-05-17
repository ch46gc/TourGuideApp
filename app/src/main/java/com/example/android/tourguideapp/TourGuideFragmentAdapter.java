package com.example.android.tourguideapp;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
public class TourGuideFragmentAdapter extends FragmentPagerAdapter {
    private Context context;
    public TourGuideFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RecreationFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2){
            return new ShoppingFragment();
        } else {
            return new HotelsFragment();
        }
    }
    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_recreation);
        } else if (position == 1) {
            return context.getString(R.string.category_restaurants);
        } else if (position == 2) {
            return context.getString(R.string.category_shopping);
        } else {
            return context.getString(R.string.category_hotels);
        }
    }
}