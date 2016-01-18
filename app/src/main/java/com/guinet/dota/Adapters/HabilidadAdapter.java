package com.guinet.dota.Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.guinet.dota.Models.Skill;
import com.guinet.dota.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by franciscogonzalez on 17-01-16.
 */
public class HabilidadAdapter extends RecyclerView.Adapter<HabilidadAdapter.SkillViewHolder>{


    List<Skill> skills;
    Context context;

    public HabilidadAdapter(List<Skill> skills,Context context)
    {
        this.skills = skills;
        this.context = context;
    }

    @Override
    public SkillViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.habilidad_item, viewGroup, false);
        SkillViewHolder pvh = new SkillViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(SkillViewHolder skillViewHolder, int i) {
        skillViewHolder.skillName.setText(skills.get(i).getName());
        skillViewHolder.skillDesc.setText(skills.get(i).getDescription());

        Context c= skillViewHolder.skillPhoto.getContext();

        Picasso.with(c).load(skills.get(i).getImage()).into(skillViewHolder.skillPhoto);

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return skills.size();
    }


    public static class SkillViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView skillName;
        TextView skillDesc;
        ImageView skillPhoto;
        Button btnYoutube;

        SkillViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            skillName = (TextView)itemView.findViewById(R.id.habilidad_name);
            skillDesc = (TextView)itemView.findViewById(R.id.habilidad_bio);
            skillPhoto = (ImageView)itemView.findViewById(R.id.habilidad_image);
            btnYoutube= (Button)itemView.findViewById(R.id.btnYoutube);
        }
    }

}
