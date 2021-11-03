package com.example.androiddz6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.androiddz6.databinding.FragmentUserBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class UserFragment extends Fragment {
    private FragmentUserBinding binding;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUserBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(R.drawable.ic_grid);
        arrayList.add(R.drawable.ic_tags);
        prepareViewPager();
    }

    private void prepareViewPager() {
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new PhotoFragment1());
        list.add(new PhotoFragment2());
        MainAdapter adapter = new MainAdapter(requireActivity());
        adapter.setFragments(list);
        binding.viewPager.setAdapter(adapter);
    }


    private class MainAdapter extends FragmentStateAdapter {
        private ArrayList<Fragment> fragments = new ArrayList<>();

        public void setFragments(ArrayList<Fragment> fragments) {
            this.fragments = fragments;
            notifyDataSetChanged();
        }

        public MainAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return fragments.get(position);
        }

        @Override
        public int getItemCount() {
            return fragments.size();
        }
    }
}
