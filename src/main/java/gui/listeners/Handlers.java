package gui.listeners;

import gui.GuiForm;
import model.FoodItem;
import model.Portion;

import javax.swing.*;

import static common.CommonMethods.round;
import static gui.GuiForm.breakfastObject;
import static gui.GuiForm.foodItemsSimpleList;

public class Handlers {

    GuiForm gui;
    static final String NO_SELECTION_IN_FOODINTAKE_SECTION = "В %s не выбран продукт для удаления";
    static final String PLUS = "plus";
    static final String MINUS = "minus";

    public Handlers(GuiForm gui) {
        this.gui = gui;
    }

    public String getValueFromSelection(ListSelectionModel lsm, DefaultListModel listModel) {
        int minIndex = lsm.getMinSelectionIndex();
        int maxIndex = lsm.getMaxSelectionIndex();
        for (int i = minIndex; i <= maxIndex; i++) {
            if (lsm.isSelectedIndex(i)) {
                return (String) listModel.get(i);
            }
        }
        return null;
    }

    void calculateBreakfastIndicators(Portion portion, String direction) {
        gui.getBreakfastListModel().clear();

        Double breakfastProteinCommon = 0d;
        Double breakfastCarboCommon = 0d;
        Double breakfastFatsCommon = 0d;
        Double breakfastCalloriesCommon = 0d;

        for (Portion portionInFoodIntake : breakfastObject.getPortions()) {
            gui.getBreakfastListModel().addElement(portionInFoodIntake.getFoodItem().getName());
            breakfastProteinCommon += portionInFoodIntake.getNutrValue().getProtein();
            breakfastCarboCommon += portionInFoodIntake.getNutrValue().getCarbo();
            breakfastFatsCommon += portionInFoodIntake.getNutrValue().getFats();
            breakfastCalloriesCommon += portionInFoodIntake.getNutrValue().getCallories();
        }
        gui.getBreakfastJList().setModel(gui.getBreakfastListModel());

        gui.getBreakfastProteinsCommon().setText(String.valueOf(breakfastProteinCommon));
        gui.getBreakfastCarboCommon().setText(String.valueOf(breakfastCarboCommon));
        gui.getBreakfastFatsCommon().setText(String.valueOf(breakfastFatsCommon));
        gui.getBreakFastCalloriesCommon().setText(String.valueOf(breakfastCalloriesCommon));

        Double proteinSum = (gui.getProteinSum().getText().equals("")) ? 0
                : Double.parseDouble(gui.getProteinSum().getText());
        Double carboSum = (gui.getCarboSum().getText().equals("")) ? 0
                : Double.parseDouble(gui.getCarboSum().getText());
        Double fatsSum = (gui.getFatsSum().getText().equals("")) ? 0
                : Double.parseDouble(gui.getFatsSum().getText());
        Double calloriesSum = (gui.getCalloriesSum().getText().equals("")) ? 0
                : Double.parseDouble(gui.getCalloriesSum().getText());

        if (direction.equals(PLUS)) {

            proteinSum = proteinSum + portion.getFoodItem().getNutrValue().getProtein();
            carboSum = carboSum + portion.getFoodItem().getNutrValue().getCarbo();
            fatsSum = fatsSum + portion.getFoodItem().getNutrValue().getFats();
            calloriesSum = calloriesSum + portion.getFoodItem().getNutrValue().getCallories();
        } else {
            proteinSum = proteinSum - portion.getFoodItem().getNutrValue().getProtein();
            carboSum = carboSum - portion.getFoodItem().getNutrValue().getCarbo();
            fatsSum = fatsSum - portion.getFoodItem().getNutrValue().getFats();
            calloriesSum = calloriesSum - portion.getFoodItem().getNutrValue().getCallories();
        }

        gui.getProteinSum().setText(String.valueOf(round(proteinSum, 2)));
        gui.getCarboSum().setText(String.valueOf(round(carboSum, 2 )));
        gui.getFatsSum().setText(String.valueOf(round(fatsSum, 2)));
        gui.getCalloriesSum().setText(String.valueOf(round(calloriesSum, 2)));
    }

}
