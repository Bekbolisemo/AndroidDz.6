package com.example.androiddz6.xml;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.androiddz6.PhotoFragment1;
import com.example.androiddz6.PhotoFragment2;

public class UserAdapter extends FragmentStateAdapter {
    public UserAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 2:
                new PhotoFragment1();
            case 1:
                new PhotoFragment2();
        }
        return new PhotoFragment1();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
