package com.guinet.dota.Framents;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.guinet.dota.Models.Heroe;
import com.guinet.dota.R;
import com.squareup.picasso.Picasso;

/**
 * Created by franciscogonzalez on 17-01-16.
 */
public class InfoGeneralSlidePageFragment extends Fragment {


    private TextView title,bio;
    ImageView imagen;

    public static InfoGeneralSlidePageFragment newInstance() {

        // Instantiate a new fragment
        InfoGeneralSlidePageFragment fragment = new InfoGeneralSlidePageFragment();
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
                R.layout.fragment_info_general, container, false);


        Heroe h = new Heroe();
        h.setName("Axe");
        h.setBio("Como soldado en el Ejército de la Niebla Roja, Mogul Khan puso su mirada en el cargo de General. Batalla tras batalla, demostró su valía con sangrientas hazañas. Su ascenso al poder se vio ayudado por el hecho de que nunca dudó en decapitar a un superior. Durante los siete años que duró la Campaña de las Mil Lagunas destacó como autor de gloriosas matanzas y su fama crecía mientras el número de compañeros de armas descendía progresivamente. En la noche de su victoria final, Axe se nombró a sí mismo General de la Niebla Roja y asumió el título definitivo de \"Axe\". Pero ya no quedaban tropas que liderar. Por supuesto, muchos habían fallecido durante la batalla, pero un buen número también habían caído bajo el acero de Axe. No hace falta decir que ahora, muchos soldados rechazan su liderazgo, pero esto no importa ni lo más mínimo a Axe, que sabe que un ejército de un solo hombre es, de lejos, el mejor.\t");
        h.setImage("http://cdn.dota2.com/apps/dota2/images/heroes/axe_vert.jpg");


        title   = (TextView)rootView.findViewById(R.id.title);
        bio     = (TextView)rootView.findViewById(R.id.bio);
        imagen  = (ImageView)rootView.findViewById(R.id.thumbnail);

        Context c = getActivity().getApplicationContext();


        title.setText(h.getName());
        bio.setText(h.getBio());
        Picasso.with(c).load(h.getImage()).into( imagen);


        return rootView;

    }
}
