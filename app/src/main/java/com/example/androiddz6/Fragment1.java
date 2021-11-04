package com.example.androiddz6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androiddz6.Model.ModelPhoto;
import com.example.androiddz6.databinding.Fragment1Binding;
import com.example.androiddz6.xml.PhotoAdapter;

import java.util.ArrayList;


public class Fragment1 extends Fragment {
    private Fragment1Binding binding;
    private RecyclerView recyclerView;
    private PhotoAdapter adapter;
    private ArrayList<ModelPhoto> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = Fragment1Binding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerView();
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));

    }

    private void initRecyclerView() {
        recyclerView = binding.containerRecyclerViewPhoto;
        adapter = new PhotoAdapter();
        adapter.updateData(addList());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<ModelPhoto> addList() {
        list = new ArrayList<>();
        list.add(new ModelPhoto(R.drawable.nebo));
        list.add(new ModelPhoto(R.drawable.obloca));
        list.add(new ModelPhoto(R.drawable.vert));
        list.add(new ModelPhoto(R.drawable.laptop));
        list.add(new ModelPhoto(R.drawable.skeyt));
        list.add(new ModelPhoto(R.drawable.watch));
        list.add(new ModelPhoto(R.drawable.tv));
        list.add(new ModelPhoto(R.drawable.laptop2));
        list.add(new ModelPhoto(R.drawable.skeyt2));

        return list;
    }
}