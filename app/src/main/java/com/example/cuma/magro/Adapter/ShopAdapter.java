package com.example.cuma.magro.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ShopAdapter  extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList=new ArrayList<>(); //fragmentleri atadık listeye
    private final List<String> fragmentTitles=new ArrayList<>();//fragment başlıklarını atadık listeye

    public void addFragment(Fragment fragment,String title){
        fragmentList.add(fragment);
        fragmentTitles.add(title);
    }

    public ShopAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    @Override
    public CharSequence getPageTitle(int position){
        return  fragmentTitles.get(position);
    }
}
