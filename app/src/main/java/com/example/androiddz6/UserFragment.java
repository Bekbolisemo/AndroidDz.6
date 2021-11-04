package com.example.androiddz6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.androiddz6.databinding.FragmentUserBinding;
import com.example.androiddz6.xml.PageAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.PrimitiveIterator;


public class UserFragment extends Fragment {
    private PageAdapter pageAdapter;
    private TabLayout tabLayout;
    private TabItem tabItem1, tabItem2;
    private ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tabLayout = (TabLayout)view.findViewById(R.id.tab_layout);
        tabItem1 = (TabItem)view.findViewById(R.id.tab1);
        tabItem2 = (TabItem)view.findViewById(R.id.tab2);
        viewPager = (ViewPager)view.findViewById(R.id.vpager);

        pageAdapter = new PageAdapter(getParentFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());


                if (tab.getPosition()==0 || tab.getPosition() ==1)
                    pageAdapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}

