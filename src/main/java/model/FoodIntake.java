package model;

import java.util.List;

/**
 * Прием пищи. Например, завтрак, обед, ужин и т.п.
 */

public class FoodIntake {

    private String name;
    private List<Portion> portions;
    private NutrititionalValue nutrValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Portion> getPortions() {
        return portions;
    }

    public void setPortions(List<Portion> portions) {
        this.portions = portions;
    }

    public NutrititionalValue getNutrValue() {
        return nutrValue;
    }

    public void setNutrValue(NutrititionalValue nutrValue) {
        this.nutrValue = nutrValue;
    }

    public void addPortion(Portion portion) {
        portions.add(portion);
    }
}
