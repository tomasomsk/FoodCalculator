package model;

/**
 * Пищевая ценность
 */

public class NutrititionalValue {

    private Double protein;
    private Double carbo;
    private Double fats;
    private Double callories;

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getCarbo() {
        return carbo;
    }

    public Double getCallories() {
        return callories;
    }

    public void setCarbo(Double carbo) {
        this.carbo = carbo;
    }

    public Double getFats() {
        return fats;
    }

    public void setFats(Double fats) {
        this.fats = fats;
    }

    public void setCallories(Double callories) {
        this.callories = callories;
    }

    public void setNutritionalValues(Double proptein, Double carbo, Double fats, Double callories) {
        this.protein = proptein;
        this.carbo = carbo;
        this.fats = fats;
        this.callories = callories;
    }
}
