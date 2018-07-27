package gui.listeners;

import gui.GuiForm;
import model.FoodIntake;
import model.FoodItem;
import model.Portion;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;

import java.util.stream.Collectors;

import static common.CommonMethods.round;
import static gui.GuiForm.breakfastObject;
import static gui.GuiForm.foodItemsSimpleList;

public class Handlers {

    public GuiForm gui;
    public static final String NO_SELECTION_IN_FOODINTAKE_SECTION = "Не выбран продукт для удаления.";
    public static final String ADDING_THE_SAME_PRODUCT = "Прием пищи \"%s\" уже содержит продукт \"%s\". " +
            "Чтобы изменить вес порции, необходимо удалить этот продукт из приема пищи и добавить его с новым весом";
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

//    public void calculateBreakfastIndicators(Portion portion, String direction) {
//        gui.getBreakfastListModel().clear();
//
//        Double breakfastProteinCommon = 0d;
//        Double breakfastCarboCommon = 0d;
//        Double breakfastFatsCommon = 0d;
//        Double breakfastCalloriesCommon = 0d;
//
//        for (Portion portionInFoodIntake : breakfastObject.getPortions()) {
//            gui.getBreakfastListModel().addElement(portionInFoodIntake.getFoodItem().getName());
//            breakfastProteinCommon += portionInFoodIntake.getNutrValue().getProtein();
//            breakfastCarboCommon += portionInFoodIntake.getNutrValue().getCarbo();
//            breakfastFatsCommon += portionInFoodIntake.getNutrValue().getFats();
//            breakfastCalloriesCommon += portionInFoodIntake.getNutrValue().getCallories();
//        }
//        gui.getBreakfastJList().setModel(gui.getBreakfastListModel());
//
//        gui.getBreakfastProteinsCommon().setText(String.valueOf(breakfastProteinCommon));
//        gui.getBreakfastCarboCommon().setText(String.valueOf(breakfastCarboCommon));
//        gui.getBreakfastFatsCommon().setText(String.valueOf(breakfastFatsCommon));
//        gui.getBreakFastCalloriesCommon().setText(String.valueOf(breakfastCalloriesCommon));
//
//        Double proteinSum = (gui.getProteinSum().getText().equals("")) ? 0
//                : Double.parseDouble(gui.getProteinSum().getText());
//        Double carboSum = (gui.getCarboSum().getText().equals("")) ? 0
//                : Double.parseDouble(gui.getCarboSum().getText());
//        Double fatsSum = (gui.getFatsSum().getText().equals("")) ? 0
//                : Double.parseDouble(gui.getFatsSum().getText());
//        Double calloriesSum = (gui.getCalloriesSum().getText().equals("")) ? 0
//                : Double.parseDouble(gui.getCalloriesSum().getText());
//
//        if (direction.equals(PLUS)) {
//
//            proteinSum = proteinSum + portion.getFoodItem().getNutrValue().getProtein();
//            carboSum = carboSum + portion.getFoodItem().getNutrValue().getCarbo();
//            fatsSum = fatsSum + portion.getFoodItem().getNutrValue().getFats();
//            calloriesSum = calloriesSum + portion.getFoodItem().getNutrValue().getCallories();
//
//            gui.getBreakfastProteinForItem().setText("");
//            gui.getBreakfastCarboForItem().setText("");
//            gui.getBreakfastFatsForItem().setText("");
//            gui.getBreakfastCalloriesForItem().setText("");
//            gui.getBreakfastWeightForItem().setText("");
//        } else {
//            proteinSum = proteinSum - portion.getFoodItem().getNutrValue().getProtein();
//            carboSum = carboSum - portion.getFoodItem().getNutrValue().getCarbo();
//            fatsSum = fatsSum - portion.getFoodItem().getNutrValue().getFats();
//            calloriesSum = calloriesSum - portion.getFoodItem().getNutrValue().getCallories();
//
//            gui.getBreakfastProteinForItem().setText("");
//            gui.getBreakfastCarboForItem().setText("");
//            gui.getBreakfastFatsForItem().setText("");
//            gui.getBreakfastCalloriesForItem().setText("");
//            gui.getBreakfastWeightForItem().setText("");
//
//        }
//
//        gui.getProteinSum().setText(String.valueOf(round(proteinSum, 2)));
//        gui.getCarboSum().setText(String.valueOf(round(carboSum, 2 )));
//        gui.getFatsSum().setText(String.valueOf(round(fatsSum, 2)));
//        gui.getCalloriesSum().setText(String.valueOf(round(calloriesSum, 2)));
//    }

    public void calculateFoodIntakeIndicators(Portion portion, FoodIntake foodIntakeObject, String direction,
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

        Double proteinCommonForCalculate = 0d;
        Double carboCommonForCalculate = 0d;
        Double fatsCommonForCalculate = 0d;
        Double calloriesCommonForCalculate = 0d;

        // Добавляем названия продуктов в список продуктов конкретного приема пищи
        // Считает общую пищевую ценность для конкретного приема пищи
        for (Portion portionInFoodIntake : foodIntakeObject.getPortions()) {
            listModel.addElement(portionInFoodIntake.getFoodItem().getName());
            proteinCommonForCalculate += portionInFoodIntake.getNutrValue().getProtein();
            carboCommonForCalculate += portionInFoodIntake.getNutrValue().getCarbo();
            fatsCommonForCalculate += portionInFoodIntake.getNutrValue().getFats();
            calloriesCommonForCalculate += portionInFoodIntake.getNutrValue().getCallories();
        }
        // Устснавливает значения в поля формы конкретного приема пищи
        jList.setModel(listModel);
        proteinsCommon.setText(String.valueOf(proteinCommonForCalculate));
        carboCommon.setText(String.valueOf(carboCommonForCalculate));
        fatsCommon.setText(String.valueOf(fatsCommonForCalculate));
        calloriesCommon.setText(String.valueOf(calloriesCommonForCalculate));

        // Берет общую пищевую ценность у конкретного приема пищи
        Double proteinSum = (gui.getProteinSum().getText().equals("")) ? 0
                : round(Double.parseDouble(gui.getProteinSum().getText()), 2);
        Double carboSum = (gui.getCarboSum().getText().equals("")) ? 0
                : round(Double.parseDouble(gui.getCarboSum().getText()), 2);
        Double fatsSum = (gui.getFatsSum().getText().equals("")) ? 0
                : round(Double.parseDouble(gui.getFatsSum().getText()), 2);
        Double calloriesSum = (gui.getCalloriesSum().getText().equals("")) ? 0
                : round(Double.parseDouble(gui.getCalloriesSum().getText()), 2);

        if (direction.equals(PLUS)) {
            // Добавляет пищевую ценность конкретного приема пищи в общую пищевую ценность дневого рациона
            proteinSum = proteinSum + portion.getFoodItem().getNutrValue().getProtein();
            carboSum = carboSum + portion.getFoodItem().getNutrValue().getCarbo();
            fatsSum = fatsSum + portion.getFoodItem().getNutrValue().getFats();
            calloriesSum = calloriesSum + portion.getFoodItem().getNutrValue().getCallories();

            // Очищает значения пищевой ценности, т.к. снимается выделение с продукта в секции конкретного приема пищи
            weightForItem.setText("");
            proteinForItem.setText("");
            carboForItem.setText("");
            fatsForItem.setText("");
            calloriesForItem.setText("");
        } else {
            // Отнимает пищевую ценность конкретного приема пищи от общей пищевой ценности дневого рациона
            proteinSum = proteinSum - portion.getFoodItem().getNutrValue().getProtein();
            carboSum = carboSum - portion.getFoodItem().getNutrValue().getCarbo();
            fatsSum = fatsSum - portion.getFoodItem().getNutrValue().getFats();
            calloriesSum = calloriesSum - portion.getFoodItem().getNutrValue().getCallories();

            // Очищает значения пищевой ценности, т.к. снимается выделение с продукта в секции конкретного приема пищи
            weightForItem.setText("");
            proteinForItem.setText("");
            carboForItem.setText("");
            fatsForItem.setText("");
            calloriesForItem.setText("");
        }

        // Устанавливает значения в поля общей дневной пищевой ценности
        gui.getProteinSum().setText(String.valueOf(round(proteinSum, 2)));
        gui.getCarboSum().setText(String.valueOf(round(carboSum, 2 )));
        gui.getFatsSum().setText(String.valueOf(round(fatsSum, 2)));
        gui.getCalloriesSum().setText(String.valueOf(round(calloriesSum, 2)));
    }

    public void setItemsTextFieldsForFoodIntake(ListSelectionEvent e,
                                         FoodIntake foodIntakeObject,
                                         DefaultListModel listModel,
                                         JTextField proteinForItem,
                                         JTextField carboForItem,
                                         JTextField fatsForItem,
                                         JTextField calloriesForItem,
                                         JTextField weightForItem) {
        ListSelectionModel lsm = (ListSelectionModel) e.getSource();
        if (!lsm.isSelectionEmpty()) {
            FoodItem foodItem = foodItemsSimpleList.getElementWithName(getValueFromSelection(lsm, listModel));
            proteinForItem.setText(String.valueOf(foodItem.getNutrValue().getProtein()));
            carboForItem.setText(String.valueOf(foodItem.getNutrValue().getCarbo()));
            fatsForItem.setText(String.valueOf(foodItem.getNutrValue().getFats()));
            calloriesForItem.setText(String.valueOf(foodItem.getNutrValue().getCallories()));
            weightForItem.setText(String.valueOf(foodIntakeObject.getPortions().stream()
                    .filter(item -> item.getFoodItem().getName().equals(foodItem.getName()))
                    .collect(Collectors.toList()).get(0).getWeight()));
        }
    }

}
