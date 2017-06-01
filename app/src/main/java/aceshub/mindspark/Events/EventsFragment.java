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
        EventsSingleItem codeJunkie=new EventsSingleItem(R.drawable.codejunkie,"Code junkie");
        EventsSingleItem codeJunkiePlusPlus=new EventsSingleItem(R.drawable.codejunkie,"Code junkie++");
        EventsSingleItem xterminate=new EventsSingleItem(R.drawable.xterminate,"Xterminate");
        EventsSingleItem codeVille=new EventsSingleItem(R.drawable.codeville,"Code Ville");
        EventsSingleItem circuitFixer1=new EventsSingleItem(R.drawable.circuitfixer,"Circuit Fixer I");
        EventsSingleItem circuitFixer2=new EventsSingleItem(R.drawable.circuitfixer,"Circuit Fixer II");
        EventsSingleItem encrypto=new EventsSingleItem(R.drawable.encrypto,"Encrypto");
        EventsSingleItem microApps=new EventsSingleItem(R.drawable.microapps,"Micro Apps");
        EventsSingleItem assemblix=new EventsSingleItem(R.drawable.assemblix,"Assemblix");
        EventsSingleItem mechtrix=new EventsSingleItem(R.drawable.mechtrix,"MechTrix");
        EventsSingleItem turnament=new EventsSingleItem(R.drawable.turnament,"Turnament");
        EventsSingleItem intelligentDesign2D=new EventsSingleItem(R.drawable.intellidesign,"Intelligent Design 2D");
        EventsSingleItem intelligentDesign3D=new EventsSingleItem(R.drawable.intellidesign,"Intelligent Design 3D");
        EventsSingleItem onTheEtch=new EventsSingleItem(R.drawable.ontheetch,"On The Etch");
        EventsSingleItem dextersLab=new EventsSingleItem(R.drawable.dexterslab,"Dexter's Lab");
        EventsSingleItem metropolis=new EventsSingleItem(R.drawable.metropolis,"Metropolis");
        EventsSingleItem conquest=new EventsSingleItem(R.drawable.conquest,"Conquest");
        EventsSingleItem idCivil=new EventsSingleItem(R.drawable.idcivil,"ID Civil");
        EventsSingleItem epitome=new EventsSingleItem(R.drawable.epitome,"Epitome");
        EventsSingleItem robowars=new EventsSingleItem(R.drawable.robowars,"Robowars");
        EventsSingleItem searchNDestroy=new EventsSingleItem(R.drawable.searchndestroy,"Search N' Destroy");
        EventsSingleItem botWrestling=new EventsSingleItem(R.drawable.botwrestling,"Bot Wrestling");
        EventsSingleItem dogFight=new EventsSingleItem(R.drawable.dogfight,"Dog Fight");
        EventsSingleItem virtualRobotics=new EventsSingleItem(R.drawable.virtualrobotics,"Virtual Robotics");
        EventsSingleItem wheelomation=new EventsSingleItem(R.drawable.wheelomation,"Wheelomation");
        EventsSingleItem contraption=new EventsSingleItem(R.drawable.contraption,"Contraption");
        EventsSingleItem aqualympics=new EventsSingleItem(R.drawable.aqualympics,"Aqualympics");
        EventsSingleItem theWrightTurn=new EventsSingleItem(R.drawable.wrightturn,"The Wright Turn");
        EventsSingleItem greenSpectrum=new EventsSingleItem(R.drawable.greenspectrum,"Green Spectrum");
        EventsSingleItem paperPresentation=new EventsSingleItem(R.drawable.paperppt,"Paper Presentation");
        EventsSingleItem mimosa=new EventsSingleItem(R.drawable.mimosa,"Mimosa");
        EventsSingleItem CNCLathe=new EventsSingleItem(R.drawable.cnclathe,"CNC Lathe");
        EventsSingleItem starewayToHeaven=new EventsSingleItem(R.drawable.stareway2h,"StareWay To Heaven");
        EventsSingleItem tux=new EventsSingleItem(R.drawable.tux,"TUX");
        EventsSingleItem ham=new EventsSingleItem(R.drawable.ham,"HAM");
        EventsSingleItem virtualLabs=new EventsSingleItem(R.drawable.virtuallabs,"Virtual Labs");
        EventsSingleItem theAmazingRace=new EventsSingleItem(R.drawable.amazingrace,"The Amazing Race");
        EventsSingleItem bidzkrieg=new EventsSingleItem(R.drawable.bidzkreig,"Bidzkrieg");
        EventsSingleItem LANSlam=new EventsSingleItem(R.drawable.lanslam,"LAN Slam");
        EventsSingleItem bullRun=new EventsSingleItem(R.drawable.bullrun,"Bull Run");
        EventsSingleItem flash=new EventsSingleItem(R.drawable.flash,"Flash");
        EventsSingleItem chakravyuh=new EventsSingleItem(R.drawable.chakravyuh,"Chakravyuh");
        EventsSingleItem qonnoisseur=new EventsSingleItem(R.drawable.qonnoisseur,"Qonnoisseur");
        EventsSingleItem torquest=new EventsSingleItem(R.drawable.torquest,"Torquest");
        EventsSingleItem geniusJR=new EventsSingleItem(R.drawable.geniusjr,"Genius JR");
        EventsSingleItem sudoku=new EventsSingleItem(R.drawable.sudoku,"Sudoku");
        EventsSingleItem googler=new EventsSingleItem(R.drawable.googler,"Googler");


        CategoriesSingleItem silicus =new CategoriesSingleItem(R.drawable.silicus,"Silicus",Arrays.asList(codeJunkie,codeJunkiePlusPlus,xterminate,codeVille));
        CategoriesSingleItem voltus=new CategoriesSingleItem(R.drawable.voltus,"Voltus",Arrays.asList(circuitFixer1,circuitFixer2,encrypto,microApps));
        CategoriesSingleItem dynamus=new CategoriesSingleItem(R.drawable.dynamus,"Dynamus",Arrays.asList(assemblix,mechtrix,turnament,intelligentDesign2D,intelligentDesign3D));
        CategoriesSingleItem collatio=new CategoriesSingleItem(R.drawable.collatio,"Collatio",Arrays.asList(onTheEtch,dextersLab));
        CategoriesSingleItem structura=new CategoriesSingleItem(R.drawable.structura,"Structura",Arrays.asList(metropolis,conquest,idCivil,epitome));
        CategoriesSingleItem robustus=new CategoriesSingleItem(R.drawable.robustus,"Robustus",Arrays.asList(robowars,searchNDestroy,botWrestling,dogFight,virtualRobotics));
        CategoriesSingleItem vortex=new CategoriesSingleItem(R.drawable.vortex,"Vortex",Arrays.asList(wheelomation,contraption,aqualympics,theWrightTurn));
        CategoriesSingleItem papyrus=new CategoriesSingleItem(R.drawable.papyrus,"Papyrus",Arrays.asList(greenSpectrum,paperPresentation,mimosa));
        CategoriesSingleItem cognitio=new CategoriesSingleItem(R.drawable.cognitio,"Cognitio",Arrays.asList(CNCLathe,starewayToHeaven,tux,ham,virtualLabs));
        CategoriesSingleItem fascinus=new CategoriesSingleItem(R.drawable.fascinus,"Fascinus",Arrays.asList(theAmazingRace,bidzkrieg,LANSlam,bullRun,flash));
        CategoriesSingleItem illuminati=new CategoriesSingleItem(R.drawable.illuminati,"Illuminati",Arrays.asList(chakravyuh,qonnoisseur,torquest));
        CategoriesSingleItem prodigium=new CategoriesSingleItem(R.drawable.prodigium,"Prodigium",Arrays.asList(geniusJR,sudoku,googler));

        categories= new ArrayList<>();
        categories=Arrays.asList(silicus,voltus,dynamus,collatio,structura,robustus,vortex,papyrus,cognitio,fascinus,illuminati,prodigium);
    }
}
