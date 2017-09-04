package aceshub.mindspark.Workshops;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import aceshub.mindspark.R;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 1/6/17.
 */

public class WorkshopTab extends Fragment {
    RecyclerView rvWorkshops;
    WorkshopsAdapter workshopsAdapter;
    List<WorkshopSingleItem> workshopSingleItemList;
    String tabName;

    public WorkshopTab() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.workshop_tab, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvWorkshops = (RecyclerView) view.findViewById(R.id.rvWorkshops);
        rvWorkshops.setLayoutManager(new LinearLayoutManager(getContext()));
        rvWorkshops.setItemAnimator(new DefaultItemAnimator());

        getWorkshopList();

        workshopsAdapter = new WorkshopsAdapter(getContext(), workshopSingleItemList);
        rvWorkshops.setAdapter(workshopsAdapter);
    }

    private void getWorkshopList() {
//        workshopData = new WorkshopData();
//        workshopSingleItemList = new ArrayList<>();
//        if (tabName.equals("InPune")) {
//            for (int i = 0; i < workshopData.workshopInPuneNames.length; i++)
//                workshopSingleItemList.add(new WorkshopSingleItem(workshopData.workshopInPuneNames[i], workshopData.workshopInPuneImg[i], workshopData.workshopBackgroundColor[i]));
//        } else if (tabName.equals("OutOfPune")) {
//            for (int i = 0; i < workshopData.workshops.length; i++)
//                workshopSingleItemList.add(new WorkshopSingleItem(workshopData.workshops[i], workshopData.workshopOutofPuneImg[i], workshopData.workshopBackgroundColor[i]));
//        }

        String[] workshops={getResources().getString(R.string.workshop_title_ethical_hacking),getResources().getString(R.string.workshop_title_hovercraft),getResources().getString(R.string.workshop_title_android_app_development),getResources().getString(R.string.workshop_title_fantastic_four),getResources().getString(R.string.workshop_title_3d_game_designing_and_virtual_reality),getResources().getString(R.string.workshop_title_creo_workshop),getResources().getString(R.string.workshop_title_advanced_iot),getResources().getString(R.string.workshop_title_hello_to_hired),getResources().getString(R.string.workshop_title_rc_nitro_car),getResources().getString(R.string.workshop_title_multi_touch_and_gesture_computing)};

        int[] workshopsImg={R.drawable.hack,R.drawable.hovercraft,R.drawable.appdev,R.drawable.fantastic_four,R.drawable.vr,R.drawable.creo,R.drawable.iot,R.drawable.hellotohired,R.drawable.rcnitro,R.drawable.gesture};

        String[] workshopIntro={getResources().getString(R.string.workshop_introduction_ethical_hacking),getResources().getString(R.string.workshop_introduction_hovercraft),getResources().getString(R.string.workshop_introduction_android_app_development),getResources().getString(R.string.workshop_introduction_fantastic_four),getResources().getString(R.string.workshop_title_3d_game_designing_and_virtual_reality),getResources().getString(R.string.workshop_title_creo_workshop),getResources().getString(R.string.workshop_introduction_advanced_iot),getResources().getString(R.string.workshop_introduction_hello_to_hired),getResources().getString(R.string.workshop_introduction_rc_nitro_car),getResources().getString(R.string.workshop_introduction_multi_touch_and_gesture_computing)};

        String[] workshopContent={getResources().getString(R.string.workshop_content_ethical_hacking),getResources().getString(R.string.workshop_content_hovercraft),getResources().getString(R.string.workshop_content_android_app_development),getResources().getString(R.string.workshop_content_fantastic_four),getResources().getString(R.string.workshop_content_3d_game_designing_and_virtual_reality),getResources().getString(R.string.workshop_content_creo_workshop),getResources().getString(R.string.workshop_content_advanced_iot),getResources().getString(R.string.workshop_content_hello_to_hired),getResources().getString(R.string.workshop_content_rc_nitro_car),getResources().getString(R.string.workshop_content_multi_touch_and_gesture_computing)};

        String[] workshopBenifits={getResources().getString(R.string.workshop_benefits_ethical_hacking),getResources().getString(R.string.workshop_benefits_hovercraft),getResources().getString(R.string.workshop_benefits_android_app_development),getResources().getString(R.string.workshop_benefits_fantastic_four),getResources().getString(R.string.workshop_benefits_3d_game_designing_and_virtual_reality),getResources().getString(R.string.workshop_benefits_creo_workshop),getResources().getString(R.string.workshop_benefits_advanced_iot),getResources().getString(R.string.workshop_benefits_hello_to_hired),getResources().getString(R.string.workshop_benefits_rc_nitro_car),getResources().getString(R.string.workshop_benefits_multi_touch_and_gesture_computing)};

        String[] workshopOutcomes={getResources().getString(R.string.workshop_outcome_ethical_hacking),getResources().getString(R.string.workshop_outcome_hovercraft),getResources().getString(R.string.workshop_outcome_android_app_development),getResources().getString(R.string.workshop_outcome_fantastic_four),getResources().getString(R.string.workshop_outcome_3d_game_designing_and_virtual_reality),getResources().getString(R.string.workshop_outcome_creo_workshop),getResources().getString(R.string.workshop_outcome_advanced_iot),getResources().getString(R.string.workshop_title_hello_to_hired),getResources().getString(R.string.workshop_outcome_rc_nitro_car),getResources().getString(R.string.workshop_outcome_multi_touch_and_gesture_computing)};

        String[] workshopFees={getResources().getString(R.string.workshop_fees_ethical_hacking),getResources().getString(R.string.workshop_fees_hovercraft),getResources().getString(R.string.workshop_fees_android_app_development),getResources().getString(R.string.workshop_fees_fantastic_four),getResources().getString(R.string.workshop_fees_3d_game_designing_and_virtual_reality),getResources().getString(R.string.workshop_fees_creo_workshop),getResources().getString(R.string.workshop_fees_advanced_iot),getResources().getString(R.string.workshop_fees_hello_to_hired),getResources().getString(R.string.workshop_fees_rc_nitro_car),getResources().getString(R.string.workshop_fees_multi_touch_and_gesture_computing)};

        String[] workshopDates={getResources().getString(R.string.workshop_date_ethical_hacking),getResources().getString(R.string.workshop_date_hovercraft),getResources().getString(R.string.workshop_date_android_app_development),getResources().getString(R.string.workshop_date_fantastic_four),getResources().getString(R.string.workshop_date_3d_game_designing_and_virtual_reality),getResources().getString(R.string.workshop_date_creo_workshop),getResources().getString(R.string.workshop_date_advanced_iot),getResources().getString(R.string.workshop_date_hello_to_hired),getResources().getString(R.string.workshop_date_hovercraft),getResources().getString(R.string.workshop_date_multi_touch_and_gesture_computing)};

        String[] workshopVenue={getResources().getString(R.string.workshop_venue_ethical_hacking),getResources().getString(R.string.workshop_venue_hovercraft),getResources().getString(R.string.workshop_venue_android_app_development),getResources().getString(R.string.workshop_venue_fantastic_four),getResources().getString(R.string.workshop_venue_3d_game_designing_and_virtual_reality),getResources().getString(R.string.workshop_venue_creo_workshop),getResources().getString(R.string.workshop_venue_advanced_iot),getResources().getString(R.string.workshop_venue_hello_to_hired),getResources().getString(R.string.workshop_venue_rc_nitro_car),getResources().getString(R.string.workshop_venue_multi_touch_and_gesture_computing)};


        workshopSingleItemList=new ArrayList<>();

        for(int i=0;i<workshops.length;i++){
            workshopSingleItemList.add(new WorkshopSingleItem(workshops[i],workshopIntro[i],workshopContent[i],workshopBenifits[i],workshopOutcomes[i],workshopVenue[i],workshopFees[i],workshopDates[i],workshopsImg[i]));
        }

    }
}
