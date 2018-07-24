package model;

import apiobjectswithname.ObjectWithName;

/**
 * Единица питания. Например, гречка, рис и т.п. Пищевая ценность указывается на 100 гр
 */

public class FoodItem implements ObjectWithName {

    private String name;
    private NutrititionalValue nutrValue;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NutrititionalValue getNutrValue() {
        return nutrValue;
    }

    public void setNutrValue(NutrititionalValue nutrValue) {
        this.nutrValue = nutrValue;
    }
}
