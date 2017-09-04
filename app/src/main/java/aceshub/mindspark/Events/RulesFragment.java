package aceshub.mindspark.Events;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import aceshub.mindspark.R;
import aceshub.mindspark.Workshops.WorkshopSingleItem;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 2/6/17.
 */

public class RulesFragment extends Fragment {
    String origin;
    EventsSingleItem event;
    WorkshopSingleItem workshopSingleItem;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rules_details,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        origin=getArguments().getString("origin");

        if(origin.equals("EventsFragment"))
            event=(EventsSingleItem)getArguments().getSerializable("Event");
        else
            workshopSingleItem=(WorkshopSingleItem)getArguments().getSerializable("Workshop");

        TextView tvRules= (TextView) view.findViewById(R.id.tvRules);

        if(origin.equals("EventsFragment"))
            tvRules.setText(event.getRules());
        else
            tvRules.setText(workshopSingleItem.getWorkshopContent());
    }
}
