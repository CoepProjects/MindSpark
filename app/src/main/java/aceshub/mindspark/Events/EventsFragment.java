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
        EventsSingleItem codeJunkie=new EventsSingleItem(R.drawable.codejunkie,"Code junkie",getString(R.string.event_objective_code_junkie),getString(R.string.event_structure_code_junkie),getString(R.string.event_rules_code_junkie),getString(R.string.event_heads_code_junkie)+"\n\n"+getString(R.string.event_tafs_code_junkie));
        EventsSingleItem codeJunkiePlusPlus=new EventsSingleItem(R.drawable.codejunkie,"Code junkie++",getString(R.string.event_objective_code_junkie_pp),getString(R.string.event_structure_code_junkie_pp),getString(R.string.event_rules_code_junkie_pp),getString(R.string.event_heads_code_junkie_pp)+"\n\n"+getString(R.string.event_tafs_code_junkie_pp));
        EventsSingleItem xterminate=new EventsSingleItem(R.drawable.xterminate,"Xterminate",getString(R.string.event_objective_xterminate),getString(R.string.event_structure_xterminate),getString(R.string.event_rules_xterminate),getString(R.string.event_heads_xterminate)+"\n\n"+getString(R.string.event_tafs_xterminate));
        EventsSingleItem circuitFixer1=new EventsSingleItem(R.drawable.circuitfixer,"Circuit Fixer I",getString(R.string.event_objective_circuit_fixer_1),getString(R.string.event_structure_circuit_fixer_1),getString(R.string.event_rules_circuit_fixer_1),getString(R.string.event_heads_circuit_fixer_1)+"\n\n"+getString(R.string.event_tafs_circuit_fixer_1));
        EventsSingleItem circuitFixer2=new EventsSingleItem(R.drawable.circuitfixer,"Circuit Fixer II",getString(R.string.event_objective_circuit_fixer_2),getString(R.string.event_structure_circuit_fixer_2),getString(R.string.event_rules_circuit_fixer_2),getString(R.string.event_heads_circuit_fixer_2)+"\n\n"+getString(R.string.event_tafs_circuit_fixer_2));
        EventsSingleItem encrypto=new EventsSingleItem(R.drawable.encrypto,"Encrypto",getString(R.string.event_objective_encrypto),getString(R.string.event_structure_encrypto),getString(R.string.event_rules_encrypto),getString(R.string.event_heads_encrypto)+"\n\n"+getString(R.string.event_tafs_encrypto));
        EventsSingleItem microApps=new EventsSingleItem(R.drawable.microapps,"Micro Apps",getString(R.string.event_objective_microapps),getString(R.string.event_structure_microapps),getString(R.string.event_rules_microapps),getString(R.string.event_heads_microapps)+"\n\n"+getString(R.string.event_tafs_microapps));
        EventsSingleItem assemblix=new EventsSingleItem(R.drawable.assemblix,"Assemblix",getString(R.string.event_objective_assemblix),getString(R.string.event_structure_assemblix),getString(R.string.event_rules_assemblix),getString(R.string.event_heads_assemblix)+"\n\n"+getString(R.string.event_tafs_assemblix));
        EventsSingleItem mechtrix=new EventsSingleItem(R.drawable.mechtrix,"MechTrix",getString(R.string.event_objective_mechtrix),getString(R.string.event_structure_mechtrix),getString(R.string.event_rules_mechtrix),getString(R.string.event_heads_mechtrix)+"\n\n"+getString(R.string.event_tafs_mechtrix));
        EventsSingleItem turnament=new EventsSingleItem(R.drawable.turnament,"Turnament",getString(R.string.event_objective_turnament),getString(R.string.event_structure_turnament),getString(R.string.event_rules_turnament),getString(R.string.event_heads_turnament)+"\n\n"+getString(R.string.event_tafs_turnament));
        EventsSingleItem intelligentDesign2D=new EventsSingleItem(R.drawable.intellidesign,"Intelligent Design 2D",getString(R.string.event_objective_id_2d),getString(R.string.event_structure_id_2d),getString(R.string.event_rules_id_2d),getString(R.string.event_heads_id_2d)+"\n\n"+getString(R.string.event_tafs_id_2d));
        EventsSingleItem intelligentDesign3D=new EventsSingleItem(R.drawable.intellidesign,"Intelligent Design 3D",getString(R.string.event_objective_id_3d),getString(R.string.event_structure_id_3d),getString(R.string.event_rules_id_3d),getString(R.string.event_rules_id_3d)+"\n\n"+getString(R.string.event_tafs_id_3d));
        EventsSingleItem onTheEtch=new EventsSingleItem(R.drawable.ontheetch,"On The Etch",getString(R.string.event_objective_on_the_etch),getString(R.string.event_structure_on_the_etch),getString(R.string.event_rules_on_the_etch),getString(R.string.event_heads_on_the_etch)+"\n\n"+getString(R.string.event_tafs_on_the_etch));
        EventsSingleItem dextersLab=new EventsSingleItem(R.drawable.dexterslab,"Dexter's Lab",getString(R.string.event_objective_dexters_lab),getString(R.string.event_structure_dexters_lab),getString(R.string.event_rules_dexters_lab),getString(R.string.event_heads_dexters_lab)+"\n\n"+getString(R.string.event_tafs_dexters_lab));
        EventsSingleItem metropolis=new EventsSingleItem(R.drawable.metropolis,"Metropolis",getString(R.string.event_objective_metropolis),getString(R.string.event_structure_metropolis),getString(R.string.event_rules_metropolis),getString(R.string.event_heads_metropolis)+"\n\n"+getString(R.string.event_tafs_metropolis));
        EventsSingleItem conquest=new EventsSingleItem(R.drawable.conquest,"Conquest",getString(R.string.event_objective_conquest),getString(R.string.event_structure_conquest),getString(R.string.event_rules_conquest),getString(R.string.event_rules_conquest)+"\n\n"+getString(R.string.event_tafs_conquest));
        EventsSingleItem idCivil=new EventsSingleItem(R.drawable.idcivil,"ID Civil",getString(R.string.event_objective_id_civil),getString(R.string.event_structure_id_civil),getString(R.string.event_rules_id_civil),getString(R.string.event_heads_id_civil)+"\n\n"+getString(R.string.event_tafs_id_civil));
        EventsSingleItem epitome=new EventsSingleItem(R.drawable.epitome,"Epitome",getString(R.string.event_objective_epitome),getString(R.string.event_structure_epitome),getString(R.string.event_rules_epitome),getString(R.string.event_heads_epitome)+"\n\n"+getString(R.string.event_tafs_epitome));
        EventsSingleItem robowars=new EventsSingleItem(R.drawable.robowars,"Robowars",getString(R.string.event_objective_robowars),getString(R.string.event_structure_robowars),getString(R.string.event_rules_robowars),getString(R.string.event_heads_robowars)+"\n\n"+getString(R.string.event_tafs_robowars));
        EventsSingleItem searchNDestroy=new EventsSingleItem(R.drawable.searchndestroy,"Search N' Destroy",getString(R.string.event_objective_search_n_destroy),getString(R.string.event_structure_search_n_destroy),getString(R.string.event_rules_search_n_destroy),getString(R.string.event_heads_search_n_destroy)+"\n\n"+getString(R.string.event_tafs_search_n_destroy));
        EventsSingleItem botWrestling=new EventsSingleItem(R.drawable.botwrestling,"Bot Wrestling",getString(R.string.event_objective_bot_wrestling),getString(R.string.event_structure_bot_wrestling),getString(R.string.event_rules_bot_wrestling),getString(R.string.event_heads_bot_wrestling)+"\n\n"+getString(R.string.event_tafs_bot_wrestling));
        EventsSingleItem dogFight=new EventsSingleItem(R.drawable.dogfight,"Dog Fight",getString(R.string.event_objective_dog_fight),getString(R.string.event_structure_dog_fight),getString(R.string.event_rules_dog_fight),getString(R.string.event_heads_dog_fight)+"\n\n"+getString(R.string.event_tafs_dog_fight));
        EventsSingleItem virtualRobotics=new EventsSingleItem(R.drawable.virtualrobotics,"Virtual Robotics",getString(R.string.event_objective_virtual_robotics),getString(R.string.event_structure_virtual_robotics),getString(R.string.event_rules_virtual_robotics),getString(R.string.event_heads_virtual_robotics)+"\n\n"+getString(R.string.event_tafs_virtual_robotics));
        EventsSingleItem wheelomation=new EventsSingleItem(R.drawable.wheelomation,"Wheelomation",getString(R.string.event_objective_wheelomation),getString(R.string.event_structure_wheelomation),getString(R.string.event_rules_wheelomation),getString(R.string.event_heads_wheelomation)+"\n\n"+getString(R.string.event_tafs_wheelomation));
        EventsSingleItem contraption=new EventsSingleItem(R.drawable.contraption,"Contraption",getString(R.string.event_objective_contraption),getString(R.string.event_structure_contraption),getString(R.string.event_rules_contraption),getString(R.string.event_heads_contraption)+"\n\n"+getString(R.string.event_tafs_contraption));
        EventsSingleItem aqualympics=new EventsSingleItem(R.drawable.aqualympics,"Aqualympics",getString(R.string.event_objective_aqualympics),getString(R.string.event_structure_aqualympics),getString(R.string.event_rules_aqualympics),getString(R.string.event_heads_aqualympics)+"\n\n"+getString(R.string.event_tafs_aqualympics));
        EventsSingleItem theWrightTurnGlider=new EventsSingleItem(R.drawable.wrightturn,"The Wright Turn Glider",getString(R.string.event_objective_the_wright_turn_glider),getString(R.string.event_structure_the_wright_turn_glider),getString(R.string.event_rules_the_wright_turn_glider),getString(R.string.event_heads_the_wright_turn_glider)+"\n\n"+getString(R.string.event_tafs_the_wright_turn_glider));
        EventsSingleItem theWrightTurnRC=new EventsSingleItem(R.drawable.wrightturn,"The Wright Turn RC",getString(R.string.event_objective_the_wright_turn_rc_plane),getString(R.string.event_structure_the_wright_turn_rc_plane),getString(R.string.event_rules_the_wright_turn_rc_plane),getString(R.string.event_heads_the_wright_turn_rc_plane)+"\n\n"+getString(R.string.event_tafs_the_wright_turn_rc_plane));
        EventsSingleItem CNCLathe=new EventsSingleItem(R.drawable.cnclathe,"CNC Lathe",getString(R.string.event_objective_cnc_lathe),getString(R.string.event_structure_cnc_lathe),getString(R.string.event_rules_cnc_lathe),getString(R.string.event_heads_cnc_lathe)+"\n\n"+getString(R.string.event_tafs_cnc_lathe));
        EventsSingleItem starewayToHeaven=new EventsSingleItem(R.drawable.stareway2h,"StareWay To Heaven",getString(R.string.event_objective_stareway_to_heaven),getString(R.string.event_structure_stareway_to_heaven),getString(R.string.event_rules_stareway_to_heaven),getString(R.string.event_heads_stareway_to_heaven)+"\n\n"+getString(R.string.event_tafs_stareway_to_heaven));
        EventsSingleItem tux=new EventsSingleItem(R.drawable.tux,"TUX",getString(R.string.event_objective_tux),getString(R.string.event_structure_tux),getString(R.string.event_rules_tux),getString(R.string.event_heads_tux)+"\n\n"+getString(R.string.event_tafs_tux));
        EventsSingleItem ham=new EventsSingleItem(R.drawable.ham,"HAM",getString(R.string.event_objective_ham),getString(R.string.event_structure_ham),getString(R.string.event_rules_ham),getString(R.string.event_heads_ham)+"\n\n"+getString(R.string.event_tafs_ham));
        EventsSingleItem virtualLabs=new EventsSingleItem(R.drawable.virtuallabs,"Virtual Labs",getString(R.string.event_objective_virtual_labs),getString(R.string.event_structure_virtual_labs),getString(R.string.event_rules_virtual_labs),getString(R.string.event_heads_virtual_labs)+"\n\n"+getString(R.string.event_tafs_virtual_labs));
        EventsSingleItem theAmazingRace=new EventsSingleItem(R.drawable.amazingrace,"The Amazing Race",getString(R.string.event_objective_the_amazing_race),getString(R.string.event_structure_the_amazing_race),getString(R.string.event_rules_the_amazing_race),getString(R.string.event_heads_the_amazing_race)+"\n\n"+getString(R.string.event_tafs_the_amazing_race));
        EventsSingleItem bidzkrieg_1=new EventsSingleItem(R.drawable.bidzkreig,"Bidzkrieg I",getString(R.string.event_objective_bidzkreig_1),getString(R.string.event_structure_bidzkreig_1),getString(R.string.event_rules_bidzkreig_1),getString(R.string.event_heads_bidzkreig_1)+"\n\n"+getString(R.string.event_tafs_bidzkreig_1));
        EventsSingleItem bidzkrieg_2=new EventsSingleItem(R.drawable.bidzkreig,"Bidzkrieg II",getString(R.string.event_objective_bidzkreig_2),getString(R.string.event_structure_bidzkreig_2),getString(R.string.event_rules_bidzkreig_2),getString(R.string.event_heads_bidzkreig_2)+"\n\n"+getString(R.string.event_tafs_bidzkreig_2));
        EventsSingleItem LANSlam=new EventsSingleItem(R.drawable.lanslam,"LAN Slam",getString(R.string.event_objective_lan_slam),getString(R.string.event_structure_lan_slam),getString(R.string.event_rules_lan_slam),getString(R.string.event_heads_lan_slam)+"\n\n"+getString(R.string.event_tafs_lan_slam));
        EventsSingleItem bullRun=new EventsSingleItem(R.drawable.bullrun,"Bull Run",getString(R.string.event_objective_bull_run),getString(R.string.event_structure_bull_run),getString(R.string.event_rules_bull_run),getString(R.string.event_heads_bull_run)+"\n\n"+getString(R.string.event_tafs_bull_run));
        EventsSingleItem flash=new EventsSingleItem(R.drawable.flash,"Flash",getString(R.string.event_objective_flash),getString(R.string.event_structure_flash),getString(R.string.event_rules_flash),getString(R.string.event_heads_flash)+"\n\n"+getString(R.string.event_tafs_flash));
        EventsSingleItem chakravyuh=new EventsSingleItem(R.drawable.chakravyuh,"Chakravyuh",getString(R.string.event_objective_chakravyuh),getString(R.string.event_structure_chakravyuh),getString(R.string.event_rules_chakravyuh),getString(R.string.event_heads_chakravyuh)+"\n\n"+getString(R.string.event_tafs_chakravyuh));
        EventsSingleItem torquest=new EventsSingleItem(R.drawable.torquest,"Torquest",getString(R.string.event_objective_torquest),getString(R.string.event_structure_torquest),getString(R.string.event_rules_torquest),getString(R.string.event_heads_torquest)+"\n\n"+getString(R.string.event_tafs_torquest));
        EventsSingleItem geniusJR=new EventsSingleItem(R.drawable.geniusjr,"Genius JR",getString(R.string.event_objective_genius_jr),getString(R.string.event_structure_genius_jr),getString(R.string.event_rules_genius_jr),getString(R.string.event_heads_genius_jr)+"\n\n"+getString(R.string.event_tafs_genius_jr));
        EventsSingleItem sudoku=new EventsSingleItem(R.drawable.sudoku,"Sudoku",getString(R.string.event_objective_sudoku),getString(R.string.event_structure_sudoku),getString(R.string.event_rules_sudoku),getString(R.string.event_heads_sudoku)+"\n\n"+getString(R.string.event_tafs_sudoku));
        EventsSingleItem googler=new EventsSingleItem(R.drawable.googler,"Googler",getString(R.string.event_objective_googler),getString(R.string.event_structure_googler),getString(R.string.event_rules_googler),getString(R.string.event_heads_googler)+"\n\n"+getString(R.string.event_tafs_googler));
        EventsSingleItem retracer=new EventsSingleItem(R.drawable.codeville,getString(R.string.event_title_retracer),getString(R.string.event_objective_retracer),getString(R.string.event_structure_retracer),getString(R.string.event_rules_retracer),getString(R.string.event_heads_retracer)+"\n\n"+getString(R.string.event_tafs_retracer));
        EventsSingleItem predictX=new EventsSingleItem(R.drawable.codeville,getString(R.string.event_title_predict_x),getString(R.string.event_objective_predict_x),getString(R.string.event_structure_predict_x),getString(R.string.event_rules_predict_x),getString(R.string.event_heads_predict_x)+"\n\n"+getString(R.string.event_tafs_predict_x));
        EventsSingleItem hackathon=new EventsSingleItem(R.drawable.codeville,getString(R.string.event_title_hackathon2_0),getString(R.string.event_objective_hackathon2_0),getString(R.string.event_structure_hackathon2_0),getString(R.string.event_rules_hackathon2_0),getString(R.string.event_heads_hackathon2_0)+"\n\n"+getString(R.string.event_tafs_hackathon2_0));
        EventsSingleItem byldan=new EventsSingleItem(R.drawable.paperppt,getString(R.string.event_title_byldan),getString(R.string.event_objective_byldan),getString(R.string.event_structure_byldan),getString(R.string.event_rules_byldan),getString(R.string.event_heads_byldan)+"\n\n"+getString(R.string.event_tafs_byldan));
        EventsSingleItem ppt_comp_it=new EventsSingleItem(R.drawable.paperppt,getString(R.string.event_title_ppt_comp_it),getString(R.string.event_objective_predict_x),getString(R.string.event_structure_ppt_comp_it),getString(R.string.event_rules_ppt_comp_it),getString(R.string.event_heads_ppt_comp_it)+"\n\n"+getString(R.string.event_tafs_ppt_comp_it));
        EventsSingleItem ppt_mech_prod=new EventsSingleItem(R.drawable.paperppt,getString(R.string.event_title_ppt_mech_prod_meta),getString(R.string.event_objective_ppt_mech_prod_meta),getString(R.string.event_structure_ppt_mech_prod_meta),getString(R.string.event_rules_ppt_mech_prod_meta),getString(R.string.event_heads_ppt_mech_prod_meta)+"\n\n"+getString(R.string.event_tafs_ppt_mech_prod_meta));
        EventsSingleItem ppt_eei=new EventsSingleItem(R.drawable.paperppt,getString(R.string.event_title_ppt_eei),getString(R.string.event_objective_ppt_eei),getString(R.string.event_structure_ppt_eei),getString(R.string.event_rules_predict_x),getString(R.string.event_heads_ppt_eei)+"\n\n"+getString(R.string.event_tafs_ppt_eei));
        EventsSingleItem ppt_civil=new EventsSingleItem(R.drawable.paperppt,getString(R.string.event_title_ppt_civil),getString(R.string.event_objective_ppt_civil),getString(R.string.event_structure_ppt_civil),getString(R.string.event_rules_ppt_civil),getString(R.string.event_heads_ppt_civil)+"\n\n"+getString(R.string.event_tafs_ppt_civil));
        EventsSingleItem indikya=new EventsSingleItem(R.drawable.chakravyuh,getString(R.string.event_title_indikya),getString(R.string.event_objective_indikya),getString(R.string.event_structure_indikya),getString(R.string.event_rules_indikya),getString(R.string.event_heads_indikya)+"\n\n"+getString(R.string.event_tafs_indikya));





        CategoriesSingleItem silicus =new CategoriesSingleItem(R.drawable.silicus,"Silicus",Arrays.asList(codeJunkie,hackathon,codeJunkiePlusPlus,xterminate,retracer,predictX),R.color.colorPrimary);
        CategoriesSingleItem voltus=new CategoriesSingleItem(R.drawable.voltus,"Voltus",Arrays.asList(circuitFixer1,circuitFixer2,encrypto,microApps),R.color.yellow500);
        CategoriesSingleItem dynamus=new CategoriesSingleItem(R.drawable.dynamus,"Dynamus",Arrays.asList(assemblix,mechtrix,turnament,intelligentDesign2D,intelligentDesign3D),R.color.orange400);
        CategoriesSingleItem collatio=new CategoriesSingleItem(R.drawable.substantia,"Substantia",Arrays.asList(onTheEtch,dextersLab),R.color.blue500);
        CategoriesSingleItem structura=new CategoriesSingleItem(R.drawable.structura,"Structura",Arrays.asList(metropolis,conquest,idCivil,epitome),R.color.orange500);
        CategoriesSingleItem robustus=new CategoriesSingleItem(R.drawable.robustus,"Robustus",Arrays.asList(robowars,searchNDestroy,botWrestling,dogFight,virtualRobotics),R.color.purple300);
        CategoriesSingleItem vortex=new CategoriesSingleItem(R.drawable.accelero,"Accelero",Arrays.asList(wheelomation,contraption,aqualympics,theWrightTurnGlider,theWrightTurnRC),R.color.red300);
        CategoriesSingleItem papyrus=new CategoriesSingleItem(R.drawable.ideam,"Ideam",Arrays.asList(ppt_civil,ppt_comp_it,ppt_eei,ppt_mech_prod,byldan),R.color.orange500);
        CategoriesSingleItem cognitio=new CategoriesSingleItem(R.drawable.cognitio,"Cognitio",Arrays.asList(CNCLathe,starewayToHeaven,tux,ham,virtualLabs),R.color.green500);
        CategoriesSingleItem fascinus=new CategoriesSingleItem(R.drawable.fascinus,"Fascinus",Arrays.asList(theAmazingRace,bidzkrieg_1,bidzkrieg_2,LANSlam,bullRun,flash),R.color.brown400);
        CategoriesSingleItem illuminati=new CategoriesSingleItem(R.drawable.illuminati,"Illuminati",Arrays.asList(chakravyuh,torquest,indikya),R.color.blue300);
        CategoriesSingleItem prodigium=new CategoriesSingleItem(R.drawable.prodigium,"Prodigium",Arrays.asList(geniusJR,sudoku,googler),R.color.red400);

        categories= new ArrayList<>();
        categories=Arrays.asList(structura,dynamus,silicus,voltus,collatio,vortex,papyrus,robustus,fascinus,illuminati,prodigium,cognitio);
    }
}
