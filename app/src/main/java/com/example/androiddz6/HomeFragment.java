package com.example.androiddz6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddz6.Model.ModelHomeFragment;
import com.example.androiddz6.databinding.FragmentHomeBinding;
import com.example.androiddz6.xml.HomeAdapter;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private RecyclerView recyclerView;
    private HomeAdapter adapter;
    private ArrayList<ModelHomeFragment> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerView();

    }

    private ArrayList<ModelHomeFragment> addList() {
        list = new ArrayList<>();
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        list.add(new ModelHomeFragment(R.drawable.home_image, getString(R.string.some_photos), getString(R.string.september_19)));
        return list;
    }

    private void initRecyclerView() {
        recyclerView = binding.containerRecyclerView;
        adapter = new HomeAdapter();
        adapter.updateData(addList());
        recyclerView.setAdapter(adapter);
    }
}