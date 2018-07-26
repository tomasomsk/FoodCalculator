package gui.listeners;

import gui.GuiForm;
import model.FoodIntake;
import model.Portion;

import javax.swing.*;

import static common.CommonMethods.round;
import static gui.GuiForm.breakfastObject;

public class Handlers {

    public GuiForm gui;
    public static final String NO_SELECTION_IN_FOODINTAKE_SECTION = "В %s не выбран продукт для удаления";
    public static final String PLUS = "plus";
    public static final String MINUS = "minus";

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

    public void calculateBreakfastIndicators(Portion portion, String direction) {
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

            gui.getBreakfastProteinForItem().setText("");
            gui.getBreakfastCarboForItem().setText("");
            gui.getBreakfastFatsForItem().setText("");
            gui.getBreakfastCalloriesForItem().setText("");
            gui.getBreakfastWeightForItem().setText("");

        }

        gui.getProteinSum().setText(String.valueOf(round(proteinSum, 2)));
        gui.getCarboSum().setText(String.valueOf(round(carboSum, 2 )));
        gui.getFatsSum().setText(String.valueOf(round(fatsSum, 2)));
        gui.getCalloriesSum().setText(String.valueOf(round(calloriesSum, 2)));
    }

    public void calculateSecondBreakfastIndicators(Portion portion, FoodIntake foodIntakeObject, String direction,
                                                   DefaultListModel listModel, JList jList,
                                                   JTextField proteinsCommon,
                                                   JTextField carboCommon,
                                                   JTextField fatsCommon,
                                                   JTextField calloriesCommon,
                                                   JTextField weightForItem,
                                                   JTextField proteinForItem,
                                                   JTextField carboForItem,
                                                   JTextField fatsForItem,
                                                   JTextField calloriesForItem) {
        listModel.clear();

        Double breakfastProteinCommon = 0d;
        Double breakfastCarboCommon = 0d;
        Double breakfastFatsCommon = 0d;
        Double breakfastCalloriesCommon = 0d;

        for (Portion portionInFoodIntake : foodIntakeObject.getPortions()) {
            listModel.addElement(portionInFoodIntake.getFoodItem().getName());
            breakfastProteinCommon += portionInFoodIntake.getNutrValue().getProtein();
            breakfastCarboCommon += portionInFoodIntake.getNutrValue().getCarbo();
            breakfastFatsCommon += portionInFoodIntake.getNutrValue().getFats();
            breakfastCalloriesCommon += portionInFoodIntake.getNutrValue().getCallories();
        }
        jList.setModel(listModel);

        proteinsCommon.setText(String.valueOf(breakfastProteinCommon));
        carboCommon.setText(String.valueOf(breakfastCarboCommon));
        fatsCommon.setText(String.valueOf(breakfastFatsCommon));
        calloriesCommon.setText(String.valueOf(breakfastCalloriesCommon));

        Double proteinSum = (gui.getProteinSum().getText().equals("")) ? 0
                : round(Double.parseDouble(gui.getProteinSum().getText()), 2);
        Double carboSum = (gui.getCarboSum().getText().equals("")) ? 0
                : round(Double.parseDouble(gui.getCarboSum().getText()), 2);
        Double fatsSum = (gui.getFatsSum().getText().equals("")) ? 0
                : round(Double.parseDouble(gui.getFatsSum().getText()), 2);
        Double calloriesSum = (gui.getCalloriesSum().getText().equals("")) ? 0
                : round(Double.parseDouble(gui.getCalloriesSum().getText()), 2);

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

            weightForItem.setText("");
            proteinForItem.setText("");
            carboForItem.setText("");
            fatsForItem.setText("");
            calloriesForItem.setText("");
        }

        gui.getProteinSum().setText(String.valueOf(round(proteinSum, 2)));
        gui.getCarboSum().setText(String.valueOf(round(carboSum, 2 )));
        gui.getFatsSum().setText(String.valueOf(round(fatsSum, 2)));
        gui.getCalloriesSum().setText(String.valueOf(round(calloriesSum, 2)));
    }

}
