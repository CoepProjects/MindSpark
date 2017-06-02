package aceshub.mindspark.Workshops;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 1/6/17.
 */

public class WorkshopSingleItem {
    private String workshopName;
    private int workshopImage,backgroundColor;

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public WorkshopSingleItem(String workshopName, int workshopImage, int backgroundColor) {
        this.workshopName = workshopName;
        this.workshopImage = workshopImage;
        this.backgroundColor=backgroundColor;

    }

    public int getWorkshopImage() {
        return workshopImage;
    }

    public String getWorkshopName() {
        return workshopName;
    }
}
