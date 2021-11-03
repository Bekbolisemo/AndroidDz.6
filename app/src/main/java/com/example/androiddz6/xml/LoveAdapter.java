package com.example.androiddz6.xml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddz6.Model.ModelLoveFragment;
import com.example.androiddz6.R;

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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view_f_love,parent,false);
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

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mainImage,secondImage;
        private TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mainImage = itemView.findViewById(R.id.image_love);
            secondImage = itemView.findViewById(R.id.image_love_second);
            title = itemView.findViewById(R.id.title_love);
        }
        public void bind(ModelLoveFragment modelLoveFragment){
            mainImage.setImageResource(modelLoveFragment.getMainImage());;
            secondImage.setImageResource(modelLoveFragment.getSecondImage());
            title.setText(modelLoveFragment.getTitle());
        }
    }

}
