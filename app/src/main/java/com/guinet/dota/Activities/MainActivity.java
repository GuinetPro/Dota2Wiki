package com.guinet.dota.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.guinet.dota.Adapters.heroeListAdapter;
import com.guinet.dota.Models.Heroe;
import com.guinet.dota.R;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        Heroe h = new Heroe();
        h.setName("Axe");
        h.setBio("Como soldado en el Ejército de la Niebla Roja, Mogul Khan puso su mirada en el cargo de General. Batalla tras batalla, demostró su valía con sangrientas hazañas. Su ascenso al poder se vio ayudado por el hecho de que nunca dudó en decapitar a un superior. Durante los siete años que duró la Campaña de las Mil Lagunas destacó como autor de gloriosas matanzas y su fama crecía mientras el número de compañeros de armas descendía progresivamente. En la noche de su victoria final, Axe se nombró a sí mismo General de la Niebla Roja y asumió el título definitivo de \"Axe\". Pero ya no quedaban tropas que liderar. Por supuesto, muchos habían fallecido durante la batalla, pero un buen número también habían caído bajo el acero de Axe. No hace falta decir que ahora, muchos soldados rechazan su liderazgo, pero esto no importa ni lo más mínimo a Axe, que sabe que un ejército de un solo hombre es, de lejos, el mejor.\t");
        h.setImage("http://cdn.dota2.com/apps/dota2/images/heroes/axe_vert.jpg?v=3206368");

        Heroe h2 = new Heroe();
        h2.setName("CRYSTAL MAIDEN");
        h2.setBio("Nacida en un cálido reino, se hizo poderosa junto a su hermana mayor Lina. Rylai, la Doncella de Cristal (Crystal Maiden), no tardó en darse cuenta que su innata afinidad elemental con el hielo comprometía a aquellos que la rodeaban. Manantiales y ríos quedaban congelados cuando ella se detenía a descansar en las cercanías; los cultivos se veían arrasados por las intensas heladas y las frutas de los huertos se convertían en duros trozos de hielo que se echaban a perder. Cuando sus padres, con una gran sensación de desesperación, enviaron a Lina al ecuador, Rylai fue desterrada al reino del Norte de Icewrack, donde fue acogida por un Mago del Hielo que había construido una ermita en el Glaciar del Corazón Azul. Tras mucho tiempo de estudios, el mago la vio preparada para continuar su práctica en solitario y dejó que ocupara su lugar, descendiendo hasta dentro del glaciar para hibernar durante un milenio. Su dominio de las Artes de Congelación dieron sus frutos durante aquel periodo y ahora sus habilidades son inigualables.");
        h2.setImage("http://cdn.dota2.com/apps/dota2/images/heroes/crystal_maiden_vert.jpg");


        Heroe h3 = new Heroe();
        h3.setName("SVEN");
        h3.setBio("Nacida en un cálido reino, se hizo poderosa junto a su hermana mayor Lina. Rylai, la Doncella de Cristal (Crystal Maiden), no tardó en darse cuenta que su innata afinidad elemental con el hielo comprometía a aquellos que la rodeaban. Manantiales y ríos quedaban congelados cuando ella se detenía a descansar en las cercanías; los cultivos se veían arrasados por las intensas heladas y las frutas de los huertos se convertían en duros trozos de hielo que se echaban a perder. Cuando sus padres, con una gran sensación de desesperación, enviaron a Lina al ecuador, Rylai fue desterrada al reino del Norte de Icewrack, donde fue acogida por un Mago del Hielo que había construido una ermita en el Glaciar del Corazón Azul. Tras mucho tiempo de estudios, el mago la vio preparada para continuar su práctica en solitario y dejó que ocupara su lugar, descendiendo hasta dentro del glaciar para hibernar durante un milenio. Su dominio de las Artes de Congelación dieron sus frutos durante aquel periodo y ahora sus habilidades son inigualables.");
        h3.setImage("http://cdn.dota2.com/apps/dota2/images/heroes/sven_vert.jpg?v=3206368");

        List<Heroe> heroes = new ArrayList<Heroe>();
        heroes.add(h);
        heroes.add(h2);
        heroes.add(h3);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(new heroeListAdapter(heroes));
    }


}
