package com.guinet.dota.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.guinet.dota.Models.Heroe;
import com.guinet.dota.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by elpesao on 04/01/2016.
 */


public class heroeListAdapter extends RecyclerView.Adapter<heroeListAdapter.ViewHolder> {

    private List<Heroe> items;

    public heroeListAdapter(List<Heroe> items) {
        this.items = items;
    }


    @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.heroe_item, parent, false);
        return new ViewHolder(v);
    }

    @Override public void onBindViewHolder(ViewHolder holder, int position) {

        Heroe item = items.get(position);
        Context context = holder.image.getContext();
        holder.name.setText(item.getName());
        Picasso.with(context ).load(item.getImage() ).into( holder.image);
        //Picasso.with(holder.image.getContext()).load(item.getImage()).into(holder.image);

        holder.itemView.setTag(item);
    }

    @Override public int getItemCount() {
        return items.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView name;


        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
