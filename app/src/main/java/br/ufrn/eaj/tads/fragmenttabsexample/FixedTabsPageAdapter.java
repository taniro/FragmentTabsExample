package br.ufrn.eaj.tads.fragmenttabsexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by Taniro on 04/10/2016.
 */
public class FixedTabsPageAdapter extends FragmentPagerAdapter {

    Fragment f1 = new Fragment1();
    Fragment f2 = new Fragment2();
    Fragment f3 = new Fragment3();


    public FixedTabsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return f1;
            case 1:
                return f2;
            case 2:
                return f3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Tab1";
            case 1:
                return "Tab2";
            case 2:
                return "Tab3";
            default:
                return null;
        }
    }


}
