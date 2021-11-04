package com.example.androiddz6.xml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddz6.Model.ModelPhoto;
import com.example.androiddz6.R;
import com.example.androiddz6.databinding.ItemRecyclerViewPhotoBinding;

import java.util.ArrayList;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {
    private ArrayList<ModelPhoto> list;
    public void updateData(ArrayList<ModelPhoto> list){
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemRecyclerViewPhotoBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private ItemRecyclerViewPhotoBinding binding;

        public ViewHolder(@NonNull ItemRecyclerViewPhotoBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
        public void bind(ModelPhoto modelPhoto){
            binding.imagePhoto.setImageResource(modelPhoto.getImageView());
        }
    }
}
