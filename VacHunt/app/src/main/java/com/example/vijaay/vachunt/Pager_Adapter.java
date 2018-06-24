package com.example.vijaay.vachunt;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager_Adapter extends FragmentStatePagerAdapter {
    int m;

    public Pager_Adapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.m = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                tab1home tab1 = new tab1home();
                return tab1;
            case 1:
                tab2contact tab2 = new tab2contact();
                return tab2;
            case 2:
                tab3profile tab3 = new tab3profile();
                return tab3;
            case 3:
                tab4notification tab4= new tab4notification();
                return tab4;
            case 4:
                tab5hunt tab5=new tab5hunt();
                return  tab5;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return m;
    }
}