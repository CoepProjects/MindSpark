package aceshub.mindspark.Workshops;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import aceshub.mindspark.R;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 23/5/17.
 */

public class WorkshopsFragment extends Fragment {

    private WorkshopPagerAdapter workshopPagerAdapter;
    private ViewPager viewPager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workshops,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        workshopPagerAdapter =new WorkshopPagerAdapter(getActivity().getSupportFragmentManager());
        viewPager=(ViewPager)view.findViewById(R.id.vpWorkshops);
        viewPager.setAdapter(workshopPagerAdapter);
        viewPager.animate();

        TabLayout tabLayout=(TabLayout)view.findViewById(R.id.tlWorkshops);
        tabLayout.setupWithViewPager(viewPager);
    }

    private class WorkshopPagerAdapter extends FragmentStatePagerAdapter {
        public WorkshopPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:

                    return new WorkshopTab();
                case 1:
                    return new WorkshopTab();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "IN PUNE";
                case 1:
                    return "OUT OF PUNE";
            }
            return null;
        }
    }
}
