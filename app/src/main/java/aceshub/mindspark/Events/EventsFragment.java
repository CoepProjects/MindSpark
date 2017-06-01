package aceshub.mindspark.Events;

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
import java.util.Arrays;
import java.util.List;

import aceshub.mindspark.R;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 23/5/17.
 */

public class EventsFragment extends Fragment {
    RecyclerView rvCategories;
    private List<CategoriesSingleItem> categories;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_events,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvCategories =(RecyclerView)view.findViewById(R.id.rvCategories);

        rvCategories.setLayoutManager(new LinearLayoutManager(getContext()));
        rvCategories.setItemAnimator(new DefaultItemAnimator());

        createEventsData();

        CategoriesAdapter adapter=new CategoriesAdapter(getContext(),categories);
        rvCategories.setAdapter(adapter);
    }

    private void createEventsData() {
        EventsSingleItem codeJunkie=new EventsSingleItem(0,"Code junkie");
        EventsSingleItem codeJunkiePlusPlus=new EventsSingleItem(0,"Code junkie++");
        EventsSingleItem xterminate=new EventsSingleItem(0,"Xterminate");
        EventsSingleItem codeVille=new EventsSingleItem(0,"Code Ville");
        EventsSingleItem circuitFixer1=new EventsSingleItem(0,"Circuit Fixer I");
        EventsSingleItem circuitFixer2=new EventsSingleItem(0,"Circuit Fixer II");
        EventsSingleItem encrypto=new EventsSingleItem(0,"Encrypto");
        EventsSingleItem microApps=new EventsSingleItem(0,"Micro Apps");
        EventsSingleItem assemblix=new EventsSingleItem(0,"Assemblix");
        EventsSingleItem mechtrix=new EventsSingleItem(0,"MechTrix");
        EventsSingleItem turnament=new EventsSingleItem(0,"Turnament");
        EventsSingleItem intelligentDesign2D=new EventsSingleItem(0,"Intelligent Design 2D");
        EventsSingleItem intelligentDesign3D=new EventsSingleItem(0,"Intelligent Design 3D");
        EventsSingleItem onTheEtch=new EventsSingleItem(0,"On The Etch");
        EventsSingleItem dextersLab=new EventsSingleItem(0,"Dexter's Lab");
        EventsSingleItem metropolis=new EventsSingleItem(0,"Metropolis");
        EventsSingleItem conquest=new EventsSingleItem(0,"Conquest");
        EventsSingleItem idCivil=new EventsSingleItem(0,"ID Civil");
        EventsSingleItem epitome=new EventsSingleItem(0,"Epitome");
        EventsSingleItem robowars=new EventsSingleItem(0,"Robowars");
        EventsSingleItem searchNDestroy=new EventsSingleItem(0,"Search N' Destroy");
        EventsSingleItem botWrestling=new EventsSingleItem(0,"Bot Wrestling");
        EventsSingleItem dogFight=new EventsSingleItem(0,"Dog Fight");
        EventsSingleItem virtualRobotics=new EventsSingleItem(0,"Virtual Robotics");
        EventsSingleItem wheelomation=new EventsSingleItem(0,"Wheelomation");
        EventsSingleItem contraption=new EventsSingleItem(0,"Contraption");
        EventsSingleItem aqualympics=new EventsSingleItem(0,"Aqualympics");
        EventsSingleItem theWrightTurn=new EventsSingleItem(0,"The Wright Turn");
        EventsSingleItem greenSpectrum=new EventsSingleItem(0,"Green Spectrum");
        EventsSingleItem paperPresentation=new EventsSingleItem(0,"Paper Presentation");
        EventsSingleItem mimosa=new EventsSingleItem(0,"Mimosa");
        EventsSingleItem CNCLathe=new EventsSingleItem(0,"CNC Lathe");
        EventsSingleItem starewayToHeaven=new EventsSingleItem(0,"StareWay To Heaven");
        EventsSingleItem tux=new EventsSingleItem(0,"TUX");
        EventsSingleItem ham=new EventsSingleItem(0,"HAM");
        EventsSingleItem virtualLabs=new EventsSingleItem(0,"Virtual Labs");
        EventsSingleItem theAmazingRace=new EventsSingleItem(0,"The Amazing Race");
        EventsSingleItem bidzkrieg=new EventsSingleItem(0,"Bidzkrieg");
        EventsSingleItem LANSlam=new EventsSingleItem(0,"LAN Slam");
        EventsSingleItem bullRun=new EventsSingleItem(0,"Bull Run");
        EventsSingleItem flash=new EventsSingleItem(0,"Flash");
        EventsSingleItem chakravyuh=new EventsSingleItem(0,"Chakravyuh");
        EventsSingleItem qonnoisseur=new EventsSingleItem(0,"Qonnoisseur");
        EventsSingleItem torquest=new EventsSingleItem(0,"Torquest");
        EventsSingleItem geniusJR=new EventsSingleItem(0,"Genius JR");
        EventsSingleItem sudoku=new EventsSingleItem(0,"Sudoku");
        EventsSingleItem googler=new EventsSingleItem(0,"Googler");


        CategoriesSingleItem silicus =new CategoriesSingleItem(0,"Silicus",Arrays.asList(codeJunkie,codeJunkiePlusPlus,xterminate,codeVille));
        CategoriesSingleItem voltus=new CategoriesSingleItem(0,"Voltus",Arrays.asList(circuitFixer1,circuitFixer2,encrypto,microApps));
        CategoriesSingleItem dynamus=new CategoriesSingleItem(0,"Dynamus",Arrays.asList(assemblix,mechtrix,turnament,intelligentDesign2D,intelligentDesign3D));
        CategoriesSingleItem collatio=new CategoriesSingleItem(0,"Collatio",Arrays.asList(onTheEtch,dextersLab));
        CategoriesSingleItem structura=new CategoriesSingleItem(0,"Structura",Arrays.asList(metropolis,conquest,idCivil,epitome));
        CategoriesSingleItem robustus=new CategoriesSingleItem(0,"Robustus",Arrays.asList(robowars,searchNDestroy,botWrestling,dogFight,virtualRobotics));
        CategoriesSingleItem vortex=new CategoriesSingleItem(0,"Vortex",Arrays.asList(wheelomation,contraption,aqualympics,theWrightTurn));
        CategoriesSingleItem papyrus=new CategoriesSingleItem(0,"Papyrus",Arrays.asList(greenSpectrum,paperPresentation,mimosa));
        CategoriesSingleItem cognitio=new CategoriesSingleItem(0,"Cognitio",Arrays.asList(CNCLathe,starewayToHeaven,tux,ham,virtualLabs));
        CategoriesSingleItem fascinus=new CategoriesSingleItem(0,"Fascinus",Arrays.asList(theAmazingRace,bidzkrieg,LANSlam,bullRun,flash));
        CategoriesSingleItem illuminati=new CategoriesSingleItem(0,"Illuminati",Arrays.asList(chakravyuh,qonnoisseur,torquest));
        CategoriesSingleItem prodigium=new CategoriesSingleItem(0,"Prodigium",Arrays.asList(geniusJR,sudoku,googler));

        categories= new ArrayList<>();
        categories=Arrays.asList(silicus,voltus,dynamus,collatio,structura,robustus,vortex,papyrus,cognitio,fascinus,illuminati,prodigium);
    }
}
