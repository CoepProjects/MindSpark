package aceshub.mindspark.Notifications;


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

public class NotificationsFragment extends Fragment {

    private NotificationsPagerAdapter notificationsPagerAdapter;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notifications,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        notificationsPagerAdapter =new NotificationsPagerAdapter(getActivity().getSupportFragmentManager());

        viewPager=(ViewPager)view.findViewById(R.id.vpNotifications);
        viewPager.animate();
        TabLayout tabLayout=(TabLayout)view.findViewById(R.id.tlNotifications);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.setAdapter(notificationsPagerAdapter);
    }

    private class NotificationsPagerAdapter extends FragmentStatePagerAdapter {
        private Bundle args;
        public NotificationsPagerAdapter(FragmentManager fm) {
            super(fm);
            args=new Bundle();
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    args.clear();
                    NotificationsFragment notificationsBookmarks = new NotificationsFragment();
                    args.putString("tab","Bookmarks");
                    notificationsBookmarks.setArguments(args);
                    return notificationsBookmarks;
                case 1:
                    args.clear();
                    NotificationsFragment notificationsAllNotifications = new NotificationsFragment();
                    args.putString("tab","AllNotifications");
                    notificationsAllNotifications.setArguments(args);
                    return notificationsAllNotifications;
            }
            return new NotificationsFragment();
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "BOOKMARKS";
                case 1:
                    return "ALL NOTIFICATIONS";
            }
            return null;
        }

    }

}
