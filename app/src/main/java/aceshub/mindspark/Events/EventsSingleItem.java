package aceshub.mindspark.Events;

import java.io.Serializable;

/**
 * Created by Ashish Pawar(ashishpawar2015.ap@gmail.com) on 1/6/17.
 */

public class EventsSingleItem implements Serializable {
    private int image;
    private String name;
    private String objective;
    private String structure;
    private String rules;
    private String extra;

    public String getObjective() {
        return objective;
    }

    public String getStructure() {
        return structure;
    }

    public String getRules() {
        return rules;
    }

    public String getExtra() {
        return extra;
    }

    public EventsSingleItem(int image, String name, String objective, String structure, String rules,String extra) {
        this.image = image;
        this.name = name;
        this.objective=objective;
        this.structure=structure;
        this.rules=rules;
        this.extra = extra;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }
}
