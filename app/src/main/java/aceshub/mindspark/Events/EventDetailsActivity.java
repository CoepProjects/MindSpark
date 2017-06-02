package aceshub.mindspark.Events;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import aceshub.mindspark.Location.LocationFragment;
import aceshub.mindspark.R;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 2/6/17.
 */

public class EventDetailsActivity extends AppCompatActivity {
    private EventDetailsAdapter eventDetailsAdapter;
    private ViewPager viewPager;
    private TabLayout tablayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);
        initialize();

    }

    private void initialize() {
        eventDetailsAdapter=new EventDetailsAdapter(this.getSupportFragmentManager());
        viewPager=(ViewPager)findViewById(R.id.vpEventDetails);
        tablayout=(TabLayout)findViewById(R.id.tlEventDetails);

        viewPager.animate();
        tablayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(eventDetailsAdapter);

        String eventName=getIntent().getStringExtra("EventName");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(eventName);
    }

    private class EventDetailsAdapter extends FragmentStatePagerAdapter {
        public EventDetailsAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new OverviewEventDetailsFragment();
                case 2:
                    return new LocationFragment();
                case 1:
                    return new NotificationsEventDetailsFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "Overview";
                case 1:
                    return "Notifications";
                case 2:
                    return "Location";
            }
            return null;
        }
    }
}
