package com.example.vijaay.vachunt;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //   Toolbar toolbar = findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);


        TabLayout tabLayout= findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.icons_home_icon_before_click).setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.icons_contacts_icon).setText("Contacts"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.icons_profile_icon).setText("Profile"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.home_notification_icon_1).setText("Notification"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.icons_hunt_icon).setText("Hunt"));
        tabLayout.setTabTextColors(Color.parseColor("#000000"), Color.parseColor("#ff1313"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager =  findViewById(R.id.pager);
        final Pager_Adapter adapter = new Pager_Adapter(getSupportFragmentManager(), tabLayout.getTabCount());


        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
