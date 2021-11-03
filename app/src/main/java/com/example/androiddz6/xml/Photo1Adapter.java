package com.example.androiddz6.xml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddz6.Model.ModelPhoto;
import com.example.androiddz6.R;

import java.util.ArrayList;

public class Photo1Adapter extends RecyclerView.Adapter<Photo1Adapter.ViewHolder> {
    private ArrayList<ModelPhoto> list;

    public void updateData(ArrayList<ModelPhoto> list){
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view_photo1,parent,false);
        return new ViewHolder(view);
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
        private ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.photo1);
        }
        public void bind(ModelPhoto modelPhoto){
            imageView.setImageResource(modelPhoto.getImageView());
        }
    }
}
