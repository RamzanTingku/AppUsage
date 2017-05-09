package com.enableit.appusage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dinislam on 5/1/17.
 * email : milon@strativ.se
 */

public class MainPagerAdapter extends FragmentPagerAdapter {


    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position) {
            case 0:
                fragment = new FragmentDashboard();
                break;
            case 1:
                fragment = new FragmentAppUsage();
                break;
            case 2:
                fragment = new FragmentSocialUsage();
                break;

            default:
                fragment = null;
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        CharSequence charSequence;
        switch (position) {
            case 0:
                charSequence = "Total Data";
                break;
            case 1:
                charSequence = "App";
                break;
            case 2:
                charSequence = "Social Activity";
                break;
            default:
                charSequence = null;
                break;
        }
        return charSequence;
    }

}
