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
    public WorkshopTab() {
    }

    RecyclerView rvWorkshops;
    WorkshopsAdapter workshopsAdapter;
    List<WorkshopSingleItem> workshopSingleItemList;
    String tabName;
    WorkshopData workshopData;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.workshop_tab,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tabName=getArguments().getString("tab");

        rvWorkshops=(RecyclerView)view.findViewById(R.id.rvWorkshops);
        rvWorkshops.setLayoutManager(new LinearLayoutManager(getContext()));
        rvWorkshops.setItemAnimator(new DefaultItemAnimator());

        getWorkshopList();

        workshopsAdapter=new WorkshopsAdapter(workshopSingleItemList);
        rvWorkshops.setAdapter(workshopsAdapter);
    }

    private void getWorkshopList() {
        workshopData=new WorkshopData();
        workshopSingleItemList=new ArrayList<>();
        if(tabName.equals("InPune")){
            for(int i=0;i<workshopData.workshopInPuneNames.length;i++)
                workshopSingleItemList.add(new WorkshopSingleItem(workshopData.workshopInPuneNames[i],workshopData.workshopInPuneImg[i],workshopData.workshopBackgroundColor[i]));
        }else if(tabName.equals("OutOfPune")){
            for(int i=0;i<workshopData.workshopOutOfPuneNames.length;i++)
                workshopSingleItemList.add(new WorkshopSingleItem(workshopData.workshopOutOfPuneNames[i],workshopData.workshopOutofPuneImg[i],workshopData.workshopBackgroundColor[i]));
        }
    }
}
