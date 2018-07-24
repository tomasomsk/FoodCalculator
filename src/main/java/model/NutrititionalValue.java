package model;

/**
 * Пищевая ценность
 */

public class NutrititionalValue {

    private Double protein;
    private Double carbo;
    private Double fats;

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getCarbo() {
        return carbo;
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

    public void setNutritionalValues(Double proptein, Double carbo, Double fats) {
        this.protein = proptein;
        this.carbo = carbo;
        this.fats = fats;
    }
}
