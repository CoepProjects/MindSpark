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
import aceshub.mindspark.Workshops.OverviewWorkshopDetailsFragment;
import aceshub.mindspark.Workshops.WorkshopSingleItem;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 2/6/17.
 */

public class Event_WorkshopDetailsActivity extends AppCompatActivity {
    String eventName;
    String origin;
    private EventDetailsAdapter eventDetailsAdapter;
    private ViewPager viewPager;
    private TabLayout tablayout;
    EventsSingleItem event;
    WorkshopSingleItem workshopSingleItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);
        initialize();

    }

    private void initialize() {
        origin = getIntent().getStringExtra("origin");

        eventDetailsAdapter = new EventDetailsAdapter(this.getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.vpEventDetails);
        tablayout = (TabLayout) findViewById(R.id.tlEventDetails);

        viewPager.animate();
        tablayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(eventDetailsAdapter);

        //eventName = getIntent().getStringExtra("Name");

        if(origin.equals("EventsFragment")){
            event=(EventsSingleItem)getIntent().getExtras().getSerializable("Event");
            getSupportActionBar().setTitle(event.getName());
        }else if(origin.equals("WorkshopFragment")){
            workshopSingleItem=(WorkshopSingleItem)getIntent().getExtras().getSerializable("Workshop");
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private class EventDetailsAdapter extends FragmentStatePagerAdapter {
        public EventDetailsAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    if (origin.equals("EventsFragment")) {
                        Bundle args = new Bundle();
                        args.putSerializable("Event",event);
                        Fragment overviewEventDetailsFragment = new OverviewEventDetailsFragment();
                        overviewEventDetailsFragment.setArguments(args);
                        return overviewEventDetailsFragment;
                    } else if (origin.equals("WorkshopFragment")) {
                        Bundle args = new Bundle();
                        args.putSerializable("Workshop",workshopSingleItem);
                        Fragment overviewWorkshopDetailsFragment = new OverviewWorkshopDetailsFragment();
                        overviewWorkshopDetailsFragment.setArguments(args);
                        return overviewWorkshopDetailsFragment;
                    }
                case 1:
                    if (origin.equals("EventsFragment")) {
                    Bundle args = new Bundle();
                        args.putString("origin",origin);
                    args.putSerializable("Event",event);
                    Fragment rulesFragment = new RulesFragment();
                    rulesFragment.setArguments(args);
                    return rulesFragment;
                } else if (origin.equals("WorkshopFragment")) {
                    Bundle args = new Bundle();
                        args.putString("origin",origin);
                    args.putSerializable("Workshop",workshopSingleItem);
                    Fragment rulesFragment = new RulesFragment();
                    rulesFragment.setArguments(args);
                    return rulesFragment;
                }
                case 2:
                    return new LocationFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Overview";
                case 1:
                    if(origin.equals("WorkshopFragment"))
                        return "Details";
                    else
                        return "Rules";
                case 2:
                    return "Location";
            }
            return null;
        }
    }
}
