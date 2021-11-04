package com.example.androiddz6.xml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddz6.Model.ModelLoveFragment;
import com.example.androiddz6.R;
import com.example.androiddz6.databinding.ItemRecyclerViewFLoveBinding;

import java.util.ArrayList;

public class LoveAdapter extends RecyclerView.Adapter<LoveAdapter.ViewHolder> {
    private ArrayList<ModelLoveFragment> list;

    public void updateData(ArrayList<ModelLoveFragment> list){
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemRecyclerViewFLoveBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ItemRecyclerViewFLoveBinding binding;

        public ViewHolder( @NonNull ItemRecyclerViewFLoveBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
        public void bind(ModelLoveFragment modelLoveFragment){
            binding.imageLove.setImageResource(modelLoveFragment.getMainImage());;
            binding.imageLoveSecond.setImageResource(modelLoveFragment.getSecondImage());
            binding.titleLove.setText(modelLoveFragment.getTitle());
        }
    }

}
