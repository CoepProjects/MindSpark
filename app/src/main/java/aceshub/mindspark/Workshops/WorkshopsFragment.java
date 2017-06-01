package aceshub.mindspark.Workshops;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
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
        viewPager.animate();
        TabLayout tabLayout=(TabLayout)view.findViewById(R.id.tlWorkshops);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.setAdapter(workshopPagerAdapter);
    }

    private class WorkshopPagerAdapter extends FragmentStatePagerAdapter {
        private Bundle args;
        public WorkshopPagerAdapter(FragmentManager fm) {
            super(fm);
            args=new Bundle();
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 1:
                    args.clear();
                    WorkshopTab workshopsOutOfPune=new WorkshopTab();
                    args.putString("tab","OutOfPune");
                    workshopsOutOfPune.setArguments(args);
                    return workshopsOutOfPune;
                case 0:
                    args.clear();
                    WorkshopTab workshopsInPune=new WorkshopTab();
                    args.putString("tab","InPune");
                    workshopsInPune.setArguments(args);
                    return workshopsInPune;
            }
            return new WorkshopTab();
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
