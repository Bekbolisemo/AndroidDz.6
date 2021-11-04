package com.example.androiddz6.xml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddz6.Model.ModelHomeFragment;
import com.example.androiddz6.R;
import com.example.androiddz6.databinding.ItemRecyclerViewBinding;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private ArrayList<ModelHomeFragment> list;

    public void updateData(ArrayList<ModelHomeFragment> list){
        this.list =new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemRecyclerViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
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
        private ItemRecyclerViewBinding binding;

        public ViewHolder(@NonNull ItemRecyclerViewBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(ModelHomeFragment modelHomeFragment) {
            binding.imageView.setImageResource(modelHomeFragment.getImageView());
            binding.time.setText(modelHomeFragment.getTime());
            binding.textTitle.setText(modelHomeFragment.getTitle());
        }
    }
}
