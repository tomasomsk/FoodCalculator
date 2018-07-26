package model;

import java.util.Objects;

/**
 * Порция еды
 */
public class Portion {

    private FoodItem foodItem;
    private Double weight;
    private NutrititionalValue nutrValue;

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;

    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public NutrititionalValue getNutrValue() {
        return nutrValue;
    }

    public void setNutrValue(NutrititionalValue nutrValue) {
        this.nutrValue = nutrValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Portion portion = (Portion) o;
        return Objects.equals(foodItem, portion.foodItem) &&
                Objects.equals(weight, portion.weight) &&
                Objects.equals(nutrValue, portion.nutrValue);
    }

    @Override
    public int hashCode() {

        return Objects.hash(foodItem, weight, nutrValue);
    }
}
