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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
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
        private TextView title, time;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.text_title);
            time = itemView.findViewById(R.id.time);
            imageView = itemView.findViewById(R.id.image_view);
        }

        public void bind(ModelHomeFragment modelHomeFragment) {
            imageView.setImageResource(modelHomeFragment.getImageView());
            time.setText(modelHomeFragment.getTime());
            title.setText(modelHomeFragment.getTitle());
        }
    }
}
