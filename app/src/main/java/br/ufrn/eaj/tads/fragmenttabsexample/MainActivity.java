package br.ufrn.eaj.tads.fragmenttabsexample;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = findViewById(R.id.pager);
        PagerAdapter pa = new FixedTabsPageAdapter(getSupportFragmentManager());

        vp.setAdapter(pa);

        tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(vp);

        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);
        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);


        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (position){
                    case 0:
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_online);
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);
                        Log.i("TESTE",""+position);
                        break;
                    case 1:
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_on);
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_off);
                        Log.i("TESTE",""+position);
                        break;
                    case 2:
                        tabLayout.getTabAt(0).setIcon(android.R.drawable.presence_offline);
                        tabLayout.getTabAt(1).setIcon(android.R.drawable.star_off);
                        tabLayout.getTabAt(2).setIcon(android.R.drawable.btn_star_big_on);
                        Log.i("TESTE",""+position);
                        break;
                    default:
                        return;
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
