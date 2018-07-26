package model;

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
}
