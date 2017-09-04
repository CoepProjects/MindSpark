package aceshub.mindspark.Workshops;

import java.io.Serializable;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 1/6/17.
 */

public class WorkshopSingleItem implements Serializable{
    private String workshopName,workshopIntro,workshopContent,workshopBenifits,workshopOutcomes,workshopVenue,workshopFees,workshopDate;
    private int workshopImage;

    public String getWorkshopName() {
        return workshopName;
    }

    public String getWorkshopIntro() {
        return workshopIntro;
    }

    public String getWorkshopContent() {
        return workshopContent;
    }

    public String getWorkshopBenifits() {
        return workshopBenifits;
    }

    public String getWorkshopOutcomes() {
        return workshopOutcomes;
    }

    public String getWorkshopVenue() {
        return workshopVenue;
    }

    public String getWorkshopFees() {
        return workshopFees;
    }

    public String getWorkshopDate() {
        return workshopDate;
    }

    public int getWorkshopImage() {
        return workshopImage;
    }

    public WorkshopSingleItem(String workshopName, String workshopIntro, String workshopContent, String workshopBenifits, String workshopOutcomes, String workshopVenue, String workshopFees, String workshopDate, int workshopImage) {

        this.workshopName = workshopName;
        this.workshopIntro = workshopIntro;
        this.workshopContent = workshopContent;
        this.workshopBenifits = workshopBenifits;
        this.workshopOutcomes = workshopOutcomes;
        this.workshopVenue = workshopVenue;
        this.workshopFees = workshopFees;
        this.workshopDate = workshopDate;
        this.workshopImage = workshopImage;
    }
}
