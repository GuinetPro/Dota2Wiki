package com.guinet.dota.Framents;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.guinet.dota.Adapters.HabilidadAdapter;
import com.guinet.dota.Models.Heroe;
import com.guinet.dota.Models.Skill;
import com.guinet.dota.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by franciscogonzalez on 17-01-16.
 */
public class HabilidadesSlidePageFragment extends Fragment {


    private TextView title,bio;
    ImageView imagen;

    public static HabilidadesSlidePageFragment newInstance() {

        // Instantiate a new fragment
        HabilidadesSlidePageFragment fragment = new HabilidadesSlidePageFragment();
        fragment.setRetainInstance(true);
        return fragment;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.recyclerview, container, false);


        List<Skill> skills = new ArrayList<>();

        Skill s1 = new Skill();
        s1.setName("Llamada del Berserker");
        s1.setDescription("En inglés: Berserker's Call. Axe se burla de las unidades enemigas cercanas, forzándolas a que le ataquen, otorgándole al mismo tiempo armadura adicional mientras dure.");
        s1.setImage("http://cdn.dota2.com/apps/dota2/images/abilities/axe_berserkers_call_hp2.png");


        Skill s2 = new Skill();
        s2.setName("Sed de Batalla");
        s2.setDescription("En inglés: Battle Hunger. Enfurece a una unidad enemiga, ralentizándola e infligiéndole daño a lo largo del tiempo hasta que mate a otra unidad o termine el efecto. Axe obtiene velocidad de movimiento por cada unidad afectada con Sed de Batalla.");
        s2.setImage("http://cdn.dota2.com/apps/dota2/images/abilities/axe_battle_hunger_hp2.png");



        Skill s3 = new Skill();
        s3.setName("Contraataque Espiral\n");
        s3.setDescription("En inglés: Counter Helix. Al ser atacado, Axe realiza un contraataque en espiral, dañando a todos los enemigos cercanos.");
        s3.setImage("http://cdn.dota2.com/apps/dota2/images/abilities/axe_counter_helix_hp2.png");


        skills.add(s1);
        skills.add(s2);
        skills.add(s3);


        RecyclerView rv = (RecyclerView)rootView.findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());

        rv.setHasFixedSize(true);
        rv.setLayoutManager(llm);

        HabilidadAdapter adapter = new HabilidadAdapter(skills,getActivity().getApplicationContext());
        rv.setAdapter(adapter);

        return rootView;

    }
}
