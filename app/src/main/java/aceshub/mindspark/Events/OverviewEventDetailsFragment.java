package aceshub.mindspark.Events;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import aceshub.mindspark.R;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 2/6/17.
 */

public class OverviewEventDetailsFragment extends Fragment {
    TextView tvEventName,tvEventObj,tvEventStruct;
    ImageView ivEvent;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_overview_event_details,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EventsSingleItem event=(EventsSingleItem)getArguments().getSerializable("Event");

        tvEventName=(TextView)view.findViewById(R.id.tvEventName);
        tvEventObj=(TextView)view.findViewById(R.id.tvObjective);
        tvEventStruct=(TextView)view.findViewById(R.id.tvStructure);
        ivEvent=(ImageView)view.findViewById(R.id.ivEventDesc);


        tvEventName.setText(event.getName());
        tvEventObj.setText(event.getObjective());
        tvEventStruct.setText(event.getStructure());
        ivEvent.setImageResource(event.getImage());

    }

}
