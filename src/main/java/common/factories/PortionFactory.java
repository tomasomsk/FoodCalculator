package common.factories;

import model.FoodItem;
import model.NutrititionalValue;
import model.Portion;

import static common.CommonMethods.round;

public class PortionFactory {

    public static Portion makePortion(FoodItem foodItem, Double weight) {
        Portion portion = new Portion();
        portion.setFoodItem(foodItem);
        portion.setWeight(weight);
        Double weightForCalculation = weight / 100;
        NutrititionalValue nutrititionalValue = new NutrititionalValue();
        nutrititionalValue.setProtein(round(foodItem.getNutrValue().getProtein() * weightForCalculation, 1));
        nutrititionalValue.setCarbo(round(foodItem.getNutrValue().getCarbo() * weightForCalculation, 1));
        nutrititionalValue.setFats(round(foodItem.getNutrValue().getFats() * weightForCalculation, 1));
        nutrititionalValue.setCallories(round(foodItem.getNutrValue().getCallories() * weightForCalculation, 1));
        portion.setNutrValue(nutrititionalValue);
        return portion;
    }

}
