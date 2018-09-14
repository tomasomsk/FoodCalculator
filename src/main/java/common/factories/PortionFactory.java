package common.factories;

import model.FoodItem;
import model.NutrititionalValue;
import model.Portion;

import static common.CommonMethods.round;

public class PortionFactory {

    /**
     * Создание порции
     * @param foodItem - название продукта, входящего в порцию
     * @param weight - вес порции
     * @return - порция указанного продукта с указанным весом и рассчитанной по этому весу пищевой ценностью порции
     */
    public static Portion makePortion(FoodItem foodItem, Double weight) {
        Portion portion = new Portion();
        portion.setFoodItem(foodItem);
        portion.setWeight(weight);
        Double weightForCalculation = round(weight / 100, 2);
        NutrititionalValue nutrititionalValue = new NutrititionalValue();
        nutrititionalValue.
                setProtein(round(foodItem.getNutrValue().getProtein() * weightForCalculation, 1));
        nutrititionalValue
                .setCarbo(round(foodItem.getNutrValue().getCarbo() * weightForCalculation, 1));
        nutrititionalValue
                .setFats(round(foodItem.getNutrValue().getFats() * weightForCalculation, 1));
        nutrititionalValue
                .setCallories(round(foodItem.getNutrValue().getCallories() * weightForCalculation, 1));
        portion
                .setNutrValue(nutrititionalValue);
        return portion;
    }

}
