package aceshub.mindspark.Workshops;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import aceshub.mindspark.R;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 3/6/17.
 */

public class OverviewWorkshopDetailsFragment extends Fragment {
    WorkshopSingleItem workshopSingleItem;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_overview_workshop_details,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvWorkshopName,tvIntro,tvFees,tvDate,tvBenefits,tvOutcomes,tvVenue;

        tvWorkshopName=(TextView)view.findViewById(R.id.tvWorkshopName);
        tvIntro=(TextView)view.findViewById(R.id.tvIntro);
        tvFees=(TextView)view.findViewById(R.id.tvFees);
        tvBenefits=(TextView)view.findViewById(R.id.tvBenifits);
        tvOutcomes=(TextView)view.findViewById(R.id.tvOutcomes);
        tvVenue=(TextView)view.findViewById(R.id.tvVenue);
        tvDate=(TextView)view.findViewById(R.id.tvDate);

         workshopSingleItem= (WorkshopSingleItem) getArguments().getSerializable("Workshop");
        tvWorkshopName.setText(workshopSingleItem.getWorkshopName());
        tvBenefits.setText(workshopSingleItem.getWorkshopBenifits());
        tvIntro.setText(workshopSingleItem.getWorkshopIntro());
        tvFees.setText(workshopSingleItem.getWorkshopFees());
        tvOutcomes.setText(workshopSingleItem.getWorkshopOutcomes());
        tvVenue.setText(workshopSingleItem.getWorkshopVenue());
        tvDate.setText(workshopSingleItem.getWorkshopDate());

    }
}
