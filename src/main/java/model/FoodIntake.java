package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Прием пищи. Например, завтрак, обед, ужин и т.п.
 */

public class FoodIntake {

    private String name;
    private List<Portion> portions;
    private NutrititionalValue nutrValue;

    public FoodIntake(String name) {
        this.name = name;
    }

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
        if (portions == null) {
            portions = new ArrayList<>();
        }
        portions.add(portion);
    }

    public void removePortion(Portion portion) {
        portions.remove(portion);
    }
}
