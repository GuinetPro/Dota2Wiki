package com.guinet.dota.Activities;

/**
 * Created by elpesao on 04/01/2016.
 */
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.guinet.dota.Adapters.MyFragmentPagerAdapter;
import com.guinet.dota.Framents.HabilidadesSlidePageFragment;
import com.guinet.dota.Framents.InfoGeneralSlidePageFragment;
import com.guinet.dota.Framents.ScreenSlidePageFragment;
import com.guinet.dota.R;
import com.guinet.dota.Transformers.DepthPageTransformer;
import com.viewpagerindicator.TitlePageIndicator;


public class HeroeDetailActivity extends FragmentActivity {

    /**
     * The pager widget, which handles animation and allows swiping horizontally
     * to access previous and next pages.
     */
    ViewPager pager = null;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    MyFragmentPagerAdapter pagerAdapter;



    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        this.setContentView(R.layout.main);

        // Instantiate a ViewPager
        this.pager = (ViewPager) this.findViewById(R.id.pager);


        // Set a custom animation
        this.pager.setPageTransformer(true, new DepthPageTransformer());




        // Create an adapter with the fragments we show on the ViewPager
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(
                getSupportFragmentManager());

        adapter.addFragment(InfoGeneralSlidePageFragment.newInstance());

        adapter.addFragment(HabilidadesSlidePageFragment.newInstance());

        adapter.addFragment(ScreenSlidePageFragment.newInstance(getResources()
                .getColor(R.color.android_green), 2));

        adapter.addFragment(ScreenSlidePageFragment.newInstance(getResources()
                .getColor(R.color.android_yellow), 3));

        this.pager.setAdapter(adapter);

        // Bind the title indicator to the adapter
        TitlePageIndicator titleIndicator = (TitlePageIndicator) findViewById(R.id.indicator);
        titleIndicator.setViewPager(pager);

    }

    @Override
    public void onBackPressed() {

        // Return to previous page when we press back button
        if (this.pager.getCurrentItem() == 0)
            super.onBackPressed();
        else
            this.pager.setCurrentItem(this.pager.getCurrentItem() - 1);

    }

}
