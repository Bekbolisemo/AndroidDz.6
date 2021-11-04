package com.example.androiddz6.xml;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.androiddz6.Fragment1;
import com.example.androiddz6.Fragment2;

public class PageAdapter extends FragmentPagerAdapter {
    private int tabCount;
    public PageAdapter(@NonNull FragmentManager fm, int behavior){
        super(fm,behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Fragment1();
            case 1: return new Fragment2();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
