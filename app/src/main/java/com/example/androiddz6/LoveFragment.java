package com.example.androiddz6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddz6.Model.ModelLoveFragment;
import com.example.androiddz6.databinding.FragmentLoveBinding;
import com.example.androiddz6.xml.LoveAdapter;

import java.util.ArrayList;

public class LoveFragment extends Fragment {
    private RecyclerView recyclerView;
    private LoveAdapter adapter;
    ArrayList<ModelLoveFragment> list;
    private FragmentLoveBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLoveBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerView();
    }

    private ArrayList<ModelLoveFragment> addList() {
        list = new ArrayList<>();
        list.add(new ModelLoveFragment(R.drawable.ova, R.drawable.rectangle, getString(R.string.karennne_liked_your_photo)));
        list.add(new ModelLoveFragment(R.drawable.ova, R.drawable.rectangle, getString(R.string.karennne_liked_your_photo)));
        list.add(new ModelLoveFragment(R.drawable.ova, R.drawable.rectangle, getString(R.string.karennne_liked_your_photo)));
        list.add(new ModelLoveFragment(R.drawable.ova, R.drawable.rectangle, getString(R.string.karennne_liked_your_photo)));

        return list;
    }

    private void initRecyclerView() {
        recyclerView = binding.containerRecyclerViewLove;
        adapter = new LoveAdapter();
        adapter.updateData(addList());
        recyclerView.setAdapter(adapter);
    }
}
