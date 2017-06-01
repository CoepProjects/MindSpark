package aceshub.mindspark.Workshops;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 1/6/17.
 */

public class WorkshopSingleItem {
    private String workshopName;
    private int workshopImage;

    public WorkshopSingleItem(String workshopName, int workshopImage) {
        this.workshopName = workshopName;
        this.workshopImage = workshopImage;
    }

    public int getWorkshopImage() {
        return workshopImage;
    }

    public String getWorkshopName() {
        return workshopName;
    }
}
