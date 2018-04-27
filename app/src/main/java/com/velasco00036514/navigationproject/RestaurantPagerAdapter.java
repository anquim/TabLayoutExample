package com.velasco00036514.navigationproject;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class RestaurantPagerAdapter extends FragmentPagerAdapter {
    Context mCtx;
    List<Fragment> fragmentList;
    List<String> titleList;

    public RestaurantPagerAdapter(FragmentManager fm, Context mCtx) {
        super(fm);
        this.mCtx = mCtx;
        this.titleList = new ArrayList<>();
        this.fragmentList = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }

    public void addItem(String title, Fragment fragment){
        titleList.add(title);
        fragmentList.add(fragment);
    }
}
