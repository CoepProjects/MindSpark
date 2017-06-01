package aceshub.mindspark.Events;

import java.util.List;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 1/6/17.
 */

public class CategoriesSingleItem {
    private int image;
    private String categoryName;
    private List<EventsSingleItem> eventsSingleItemList;
    private int backgroundColor;

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public CategoriesSingleItem(int image, String categoryName, List<EventsSingleItem> eventsSingleItemList, int backgroundColor) {
        this.image = image;
        this.categoryName = categoryName;
        this.eventsSingleItemList = eventsSingleItemList;
        this.backgroundColor =backgroundColor;

    }

    public int getImage() {
        return image;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<EventsSingleItem> getEventsSingleItemList() {
        return eventsSingleItemList;
    }
}
