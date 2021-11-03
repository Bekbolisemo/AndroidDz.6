package com.example.androiddz6;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddz6.Model.ModelPhoto;
import com.example.androiddz6.databinding.FragmentPhoto1Binding;
import com.example.androiddz6.xml.Photo1Adapter;

import java.util.ArrayList;


public class PhotoFragment1 extends Fragment {
    private FragmentPhoto1Binding binding;
    private RecyclerView recyclerView;
    private Photo1Adapter adapter;
    ArrayList<ModelPhoto> list;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPhoto1Binding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerView();

    }

    private void initRecyclerView() {
        recyclerView = binding.containerRecyclerView;
        adapter = new Photo1Adapter();
        adapter.updateData(addList());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<ModelPhoto> addList() {
        list = new ArrayList<>();
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.nebo));
        return list;
    }
}